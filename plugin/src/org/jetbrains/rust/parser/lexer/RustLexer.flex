package org.jetbrains.rust.parser.lexer;
import com.intellij.lexer.*;
import com.intellij.psi.tree.IElementType;
import static org.jetbrains.rust.psi.RustTypes.*;

%%

%{
  public _RustLexer() {
    this((java.io.Reader)null);
  }
%}

%public
%class _RustLexer
%implements FlexLexer
%function advance
%type IElementType
%unicode

EOL="\r"|"\n"|"\r\n"
LINE_WS=[\ \t\f]
WHITE_SPACE=({LINE_WS}|{EOL})+

LINE_COMMENT="//".*
BLOCK_COMMENT="/"\*(.|\n)*\*"/"
IDENT=[:letter:][a-zA-Z_0-9]*
LIT_CHAR='.'
LIT_STRING=(\"([^\"\\]|\\.)*\")
LIT_INTEGER=[0-9]+
LIT_BOOL=true|false

%%
<YYINITIAL> {
  {WHITE_SPACE}          { return com.intellij.psi.TokenType.WHITE_SPACE; }

  "("                    { return PAR_LEFT; }
  ")"                    { return PAR_RIGHT; }
  "{"                    { return CURLY_LEFT; }
  "}"                    { return CURLY_RIGHT; }
  "["                    { return BRACKET_LEFT; }
  "]"                    { return BRACKET_RIGHT; }
  "."                    { return DOT; }
  ".."                   { return DOT_DOT; }
  "..."                  { return DOT_DOT_DOT; }
  ";"                    { return SEMI; }
  ","                    { return COMMA; }
  "!"                    { return BANG; }

  "byte_string_lit"      { return LIT_BYTE_STRING; }
  "byte_lit"             { return LIT_BYTE; }
  "static"               { return STATIC; }
  "mut"                  { return MUT; }
  "const"                { return CONST; }
  "mod"                  { return MOD; }
  "pub"                  { return PUB; }
  "fn"                   { return FN; }
  "param"                { return PARAM; }
  "lifetimes"            { return LIFETIMES; }
  "where"                { return WHERE; }
  "true"                 { return TRUE; }
  "false"                { return FALSE; }
  "str"                  { return STR; }

  {LINE_COMMENT}         { return LINE_COMMENT; }
  {BLOCK_COMMENT}        { return BLOCK_COMMENT; }
  {IDENT}                { return IDENT; }
  {LIT_CHAR}             { return LIT_CHAR; }
  {LIT_STRING}           { return LIT_STRING; }
  {LIT_INTEGER}          { return LIT_INTEGER; }
  {LIT_BOOL}             { return LIT_BOOL; }

  [^] { return com.intellij.psi.TokenType.BAD_CHARACTER; }
}
