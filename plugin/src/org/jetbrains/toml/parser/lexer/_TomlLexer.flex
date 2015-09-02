package org.jetbrains.toml.parser.lexer;
import com.intellij.lexer.*;
import com.intellij.psi.tree.IElementType;
import static org.jetbrains.toml.psi.TomlTypes.*;

%%

%{
  public _TomlLexer() {
    this((java.io.Reader)null);
  }
%}

%public
%class _TomlLexer
%implements FlexLexer
%function advance
%type IElementType
%unicode

EOL="\r"|"\n"|"\r\n"
LINE_WS=[\ \t\f]
WHITE_SPACE=({LINE_WS}|{EOL})+

SPACE=[ \t\n\x0B\f\r]+
COMMENT=#[^\n\r]*
STRING=(\"[^\"]*\")
NUMBER=([0-9]|_)+
BOOLEAN=true|false
KEY=[0-9_\-a-zA-Z]+

%%
<YYINITIAL> {
  {WHITE_SPACE}      { return com.intellij.psi.TokenType.WHITE_SPACE; }


  {SPACE}            { return SPACE; }
  {COMMENT}          { return COMMENT; }
  {STRING}           { return STRING; }
  {NUMBER}           { return NUMBER; }
  {BOOLEAN}          { return BOOLEAN; }
  {KEY}              { return KEY; }

  [^] { return com.intellij.psi.TokenType.BAD_CHARACTER; }
}
