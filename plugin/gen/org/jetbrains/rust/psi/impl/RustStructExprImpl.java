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

public class RustStructExprImpl extends RustExprImpl implements RustStructExpr {

  public RustStructExprImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof RustVisitor) ((RustVisitor)visitor).visitStructExpr(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public RustCommaSeparatedList getCommaSeparatedList() {
    return findNotNullChildByClass(RustCommaSeparatedList.class);
  }

  @Override
  @Nullable
  public RustExpr getExpr() {
    return findChildByClass(RustExpr.class);
  }

  @Override
  @NotNull
  public RustPath getPath() {
    return findNotNullChildByClass(RustPath.class);
  }

}
