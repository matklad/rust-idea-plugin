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

public class RustPatImpl extends ASTWrapperPsiElement implements RustPat {

  public RustPatImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof RustVisitor) ((RustVisitor)visitor).visitPat(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public RustCommaSeparatedList getCommaSeparatedList() {
    return findChildByClass(RustCommaSeparatedList.class);
  }

  @Override
  @Nullable
  public RustLit getLit() {
    return findChildByClass(RustLit.class);
  }

  @Override
  @Nullable
  public RustPat getPat() {
    return findChildByClass(RustPat.class);
  }

  @Override
  @Nullable
  public RustPath getPath() {
    return findChildByClass(RustPath.class);
  }

}
