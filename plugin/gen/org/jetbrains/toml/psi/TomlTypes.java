// This is a generated file. Not intended for manual editing.
package org.jetbrains.toml.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import org.jetbrains.toml.parser.TomlTokenType;
import org.jetbrains.toml.psi.impl.*;

public interface TomlTypes {

  IElementType KEY = new TomlElementType("KEY");

  IElementType ID = new TomlTokenType("ID");
  IElementType WHITE_SPACE = new TomlTokenType("WHITE_SPACE");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
       if (type == KEY) {
        return new TomlKeyImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
