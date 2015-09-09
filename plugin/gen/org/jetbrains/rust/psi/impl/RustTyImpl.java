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

public class RustTyImpl extends ASTWrapperPsiElement implements RustTy {

  public RustTyImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof RustVisitor) ((RustVisitor)visitor).visitTy(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public RustCommaSeparatedList getCommaSeparatedList() {
    return findChildByClass(RustCommaSeparatedList.class);
  }

  @Override
  @Nullable
  public RustExpr getExpr() {
    return findChildByClass(RustExpr.class);
  }

  @Override
  @Nullable
  public RustTy getTy() {
    return findChildByClass(RustTy.class);
  }

  @Override
  @Nullable
  public RustTySum getTySum() {
    return findChildByClass(RustTySum.class);
  }

  @Override
  @Nullable
  public RustTypePath getTypePath() {
    return findChildByClass(RustTypePath.class);
  }

}
