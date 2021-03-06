// This is a generated file. Not intended for manual editing.
package org.jetbrains.rust.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.jetbrains.rust.psi.RustTypes.*;
import org.jetbrains.rust.psi.*;

public class RustUnsafeBlockExprImpl extends RustExprImpl implements RustUnsafeBlockExpr {

  public RustUnsafeBlockExprImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof RustVisitor) ((RustVisitor)visitor).visitUnsafeBlockExpr(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public RustBlockExpr getBlockExpr() {
    return findNotNullChildByClass(RustBlockExpr.class);
  }

}
