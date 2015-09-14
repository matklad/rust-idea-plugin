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

public class RustCallExprImpl extends RustExprImpl implements RustCallExpr {

  public RustCallExprImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof RustVisitor) ((RustVisitor)visitor).visitCallExpr(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public RustCommaSeparatedList getCommaSeparatedList() {
    return findChildByClass(RustCommaSeparatedList.class);
  }

  @Override
  @NotNull
  public RustExpr getExpr() {
    return findNotNullChildByClass(RustExpr.class);
  }

  @Override
  @Nullable
  public RustGenericValues getGenericValues() {
    return findChildByClass(RustGenericValues.class);
  }

}
