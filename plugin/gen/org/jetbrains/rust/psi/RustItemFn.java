// This is a generated file. Not intended for manual editing.
package org.jetbrains.rust.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface RustItemFn extends PsiElement {

  @NotNull
  RustBlockExpr getBlockExpr();

  @NotNull
  RustFnDecl getFnDecl();

  @Nullable
  RustGenericParams getGenericParams();

  @Nullable
  RustWhereClause getWhereClause();

  @NotNull
  PsiElement getIdent();

}
