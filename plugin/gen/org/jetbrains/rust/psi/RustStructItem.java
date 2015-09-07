// This is a generated file. Not intended for manual editing.
package org.jetbrains.rust.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface RustStructItem extends PsiElement {

  @Nullable
  RustGenericParams getGenericParams();

  @Nullable
  RustRecordStructBody getRecordStructBody();

  @Nullable
  RustTupleStructBody getTupleStructBody();

  @Nullable
  RustWhereClause getWhereClause();

  @NotNull
  PsiElement getIdent();

}
