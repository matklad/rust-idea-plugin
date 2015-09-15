// This is a generated file. Not intended for manual editing.
package org.jetbrains.rust.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface RustTraitItem extends PsiElement {

  @Nullable
  RustGenericParams getGenericParams();

  @NotNull
  RustTraitBody getTraitBody();

  @Nullable
  RustTyParamBounds getTyParamBounds();

  @Nullable
  RustWhereClause getWhereClause();

  @NotNull
  PsiElement getIdent();

}
