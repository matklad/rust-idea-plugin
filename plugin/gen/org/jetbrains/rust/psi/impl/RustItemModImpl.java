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

public class RustItemModImpl extends ASTWrapperPsiElement implements RustItemMod {

  public RustItemModImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof RustVisitor) ((RustVisitor)visitor).visitItemMod(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public RustInnerAttrs getInnerAttrs() {
    return findChildByClass(RustInnerAttrs.class);
  }

  @Override
  @Nullable
  public RustModItems getModItems() {
    return findChildByClass(RustModItems.class);
  }

  @Override
  @NotNull
  public PsiElement getIdent() {
    return findNotNullChildByType(IDENT);
  }

}
