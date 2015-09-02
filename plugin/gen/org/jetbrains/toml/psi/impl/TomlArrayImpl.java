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

public class TomlArrayImpl extends ASTWrapperPsiElement implements TomlArray {

  public TomlArrayImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof TomlVisitor) ((TomlVisitor)visitor).visitArray(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<TomlValue> getValueList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, TomlValue.class);
  }

}
