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

public class RustMemberFnItemImpl extends ASTWrapperPsiElement implements RustMemberFnItem {

  public RustMemberFnItemImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof RustVisitor) ((RustVisitor)visitor).visitMemberFnItem(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public RustBlockExpr getBlockExpr() {
    return findNotNullChildByClass(RustBlockExpr.class);
  }

  @Override
  @Nullable
  public RustGenericParams getGenericParams() {
    return findChildByClass(RustGenericParams.class);
  }

  @Override
  @NotNull
  public RustMemberFnParams getMemberFnParams() {
    return findNotNullChildByClass(RustMemberFnParams.class);
  }

  @Override
  @Nullable
  public RustTy getTy() {
    return findChildByClass(RustTy.class);
  }

  @Override
  @Nullable
  public RustWhereClause getWhereClause() {
    return findChildByClass(RustWhereClause.class);
  }

  @Override
  @NotNull
  public PsiElement getIdent() {
    return findNotNullChildByType(IDENT);
  }

}
