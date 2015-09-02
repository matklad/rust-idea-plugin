package org.jetbrains.toml.parser.lexer;

import java.util.*;
import com.intellij.lexer.*;
import com.intellij.psi.*;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.toml.psi.*;

%%

%unicode
%class _TomlLexer
%implements FlexLexer


%function advance
%type IElementType

%eof{ return;
%eof}

WHITE_SPACE = [\ \t\n\r]
ID_CHARACTER = [a-zA-Z0-9_]

%%

{WHITE_SPACE}+             { return TokenType.WHITE_SPACE; }

{ID_CHARACTER}+            { return TomlTypes.ID; }

.                          { return TokenType.BAD_CHARACTER; }
