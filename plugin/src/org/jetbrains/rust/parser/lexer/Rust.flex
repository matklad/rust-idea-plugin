package org.jetbrains.rust.parser.lexer;

import java.util.*;
import com.intellij.lexer.*;
import com.intellij.psi.*;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.rust.parser.token.*;

%%

%unicode
%class _RustLexer
%implements FlexLexer

%{
    private int commentStart;
    private int commentDepth;
%}


%function advance
%type IElementType

ID = [a-zA-Z_][a-zA-Z0-9_]*
WHITE_SPACE = [\ \t\n\r]

%%

{WHITE_SPACE}+         { return TokenType.WHITE_SPACE; }
// Keywords
"as"                   { return RustLexerTokens.KW_AS; }
"break"                { return RustLexerTokens.KW_BREAK; }
"const"                { return RustLexerTokens.KW_CONST; }
"crate"                { return RustLexerTokens.KW_CRATE; }
"else"                 { return RustLexerTokens.KW_ELSE; }
"enum"                 { return RustLexerTokens.KW_ENUM; }
"extern"               { return RustLexerTokens.KW_EXTERN; }
"false"                { return RustLexerTokens.KW_FALSE; }
"fn"                   { return RustLexerTokens.KW_FN; }
"for"                  { return RustLexerTokens.KW_FOR; }
"if"                   { return RustLexerTokens.KW_IF; }
"impl"                 { return RustLexerTokens.KW_IMPL; }
"in"                   { return RustLexerTokens.KW_IN; }
"let"                  { return RustLexerTokens.KW_LET; }
"loop"                 { return RustLexerTokens.KW_LOOP; }
"match"                { return RustLexerTokens.KW_MATCH; }
"mod"                  { return RustLexerTokens.KW_MOD; }
"mut"                  { return RustLexerTokens.KW_MUT; }
"priv"                 { return RustLexerTokens.KW_PRIV; }
"proc"                 { return RustLexerTokens.KW_PROC; }
"move"                 { return RustLexerTokens.KW_MOVE; }
"pub"                  { return RustLexerTokens.KW_PUB; }
"ref"                  { return RustLexerTokens.KW_REF; }
"return"               { return RustLexerTokens.KW_RETURN; }
"self"                 { return RustLexerTokens.KW_SELF; }
"static"               { return RustLexerTokens.KW_STATIC; }
"struct"               { return RustLexerTokens.KW_STRUCT; }
"super"                { return RustLexerTokens.KW_SUPER; }
"true"                 { return RustLexerTokens.KW_TRUE; }
"trait"                { return RustLexerTokens.KW_TRAIT; }
"type"                 { return RustLexerTokens.KW_TYPE; }
"unsafe"               { return RustLexerTokens.KW_UNSAFE; }
"use"                  { return RustLexerTokens.KW_USE; }
"while"                { return RustLexerTokens.KW_WHILE; }
"continue"             { return RustLexerTokens.KW_CONTINUE; }
"box"                  { return RustLexerTokens.KW_BOX; }
"where"                { return RustLexerTokens.KW_WHERE; }
{ID}                   { return RustLexerTokens.ID; }

.                      { return TokenType.BAD_CHARACTER; }