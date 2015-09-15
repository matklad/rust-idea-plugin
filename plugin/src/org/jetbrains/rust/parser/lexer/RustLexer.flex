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
IDENT_START=[:letter:] | _
IDENT_CONT=[a-zA-Z_0-9]
IDENT={IDENT_START} {IDENT_CONT}*
LIFETIME=\'{IDENT}
LIT_CHAR='.'
LIT_STRING=(r?\"([^\"\\]|\\.)*\")
LIT_FLOAT=[:digit:]+\.[:digit:]+
LIT_INTEGER=[:digit:]+
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
  "|"                    { return PIPE; }
  "||"                   { return PIPE_PIPE; }
  "&"                    { return AMPERSAND; }
  "&&"                   { return AMPERSAND_AMPERSAND; }
  "."                    { return DOT; }
  ".."                   { return DOT_DOT; }
  "..."                  { return DOT_DOT_DOT; }
  ";"                    { return SEMI; }
  ","                    { return COMMA; }
  "!"                    { return BANG; }
  ":"                    { return COLON; }
  "-"                    { return MINUS; }
  "+"                    { return PLUS; }
  "=="                   { return EQUAL_EQUAL; }
  "<="                   { return LESS_EQUAL; }
  ">="                   { return GREATER_EQUAL; }
  "<"                    { return LESS; }
  ">"                    { return GREATER; }
  "=>"                   { return FAT_ARROW; }
  "="                    { return ASSIGN; }
  "#"                    { return HASH; }

  "as"                   { return AS; }
  "byte_lit"             { return LIT_BYTE; }
  "byte_string_lit"      { return LIT_BYTE_STRING; }
  "const"                { return CONST; }
  "crate"                { return CRATE; }
  "else"                 { return ELSE; }
  "extern"               { return EXTERN; }
  "false"                { return FALSE; }
  "fn"                   { return FN; }
  "for"                  { return FOR; }
  "if"                   { return IF; }
  "impl"                 { return IMPL; }
  "in"                   { return IN; }
  "let"                  { return LET; }
  "match"                { return MATCH; }
  "mod"                  { return MOD; }
  "mut"                  { return MUT; }
  "pub"                  { return PUB; }
  "return"               { return RETURN; }
  "self"                 { return SELF; }
  "static"               { return STATIC; }
  "struct"               { return STRUCT; }
  "trait"                { return TRAIT; }
  "true"                 { return TRUE; }
  "type"                 { return TYPE; }
  "use"                  { return USE; }
  "where"                { return WHERE; }

  {LINE_COMMENT}         { return LINE_COMMENT; }
  {BLOCK_COMMENT}        { return BLOCK_COMMENT; }
  {LIT_BOOL}             { return LIT_BOOL; }
  {IDENT}                { return IDENT; }
  {LIFETIME}             { return LIFETIME; }
  {LIT_CHAR}             { return LIT_CHAR; }
  {LIT_STRING}           { return LIT_STRING; }
  {LIT_FLOAT}            { return LIT_FLOAT; }
  {LIT_INTEGER}          { return LIT_INTEGER; }

  [^] { return com.intellij.psi.TokenType.BAD_CHARACTER; }
}
