// This is a generated file. Not intended for manual editing.
package org.jetbrains.rust.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface RustTypePathSegment extends PsiElement {

  @Nullable
  RustCommaSeparatedList getCommaSeparatedList();

  @Nullable
  RustGenericValues getGenericValues();

  @Nullable
  RustTy getTy();

  @NotNull
  PsiElement getIdent();

}
