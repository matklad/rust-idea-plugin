// This is a generated file. Not intended for manual editing.
package org.jetbrains.toml.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.jetbrains.toml.psi.TomlTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import org.jetbrains.toml.psi.*;

public class TomlExpressionImpl extends ASTWrapperPsiElement implements TomlExpression {

  public TomlExpressionImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof TomlVisitor) ((TomlVisitor)visitor).visitExpression(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public TomlKeyValue getKeyValue() {
    return findChildByClass(TomlKeyValue.class);
  }

  @Override
  @Nullable
  public TomlTable getTable() {
    return findChildByClass(TomlTable.class);
  }

}
