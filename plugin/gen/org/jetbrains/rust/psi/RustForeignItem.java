// This is a generated file. Not intended for manual editing.
package org.jetbrains.rust.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface RustForeignItem extends PsiElement {

  @Nullable
  RustCommaSeparatedList getCommaSeparatedList();

  @Nullable
  RustGenericParams getGenericParams();

  @NotNull
  RustOuterAttrs getOuterAttrs();

  @Nullable
  RustTy getTy();

  @Nullable
  RustVisibility getVisibility();

  @Nullable
  RustWhereClause getWhereClause();

  @NotNull
  PsiElement getIdent();

}
