// This is a generated file. Not intended for manual editing.
package org.jetbrains.rust.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.jetbrains.rust.psi.RustTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import org.jetbrains.rust.psi.*;

public class RustTySumImpl extends ASTWrapperPsiElement implements RustTySum {

  public RustTySumImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof RustVisitor) ((RustVisitor)visitor).visitTySum(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public RustTy getTy() {
    return findNotNullChildByClass(RustTy.class);
  }

  @Override
  @Nullable
  public RustTyParamBounds getTyParamBounds() {
    return findChildByClass(RustTyParamBounds.class);
  }

}
