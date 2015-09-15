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

public class RustStmtImpl extends ASTWrapperPsiElement implements RustStmt {

  public RustStmtImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof RustVisitor) ((RustVisitor)visitor).visitStmt(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public RustConstItem getConstItem() {
    return findChildByClass(RustConstItem.class);
  }

  @Override
  @Nullable
  public RustExpr getExpr() {
    return findChildByClass(RustExpr.class);
  }

  @Override
  @Nullable
  public RustFnItem getFnItem() {
    return findChildByClass(RustFnItem.class);
  }

  @Override
  @Nullable
  public RustImplItem getImplItem() {
    return findChildByClass(RustImplItem.class);
  }

  @Override
  @Nullable
  public RustModItem getModItem() {
    return findChildByClass(RustModItem.class);
  }

  @Override
  @Nullable
  public RustPat getPat() {
    return findChildByClass(RustPat.class);
  }

  @Override
  @Nullable
  public RustStaticItem getStaticItem() {
    return findChildByClass(RustStaticItem.class);
  }

  @Override
  @Nullable
  public RustStructItem getStructItem() {
    return findChildByClass(RustStructItem.class);
  }

  @Override
  @Nullable
  public RustTySum getTySum() {
    return findChildByClass(RustTySum.class);
  }

}
