// This is a generated file. Not intended for manual editing.
package org.jetbrains.rust.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface RustWhileExpr extends RustExpr {

  @NotNull
  List<RustExpr> getExprList();

  @Nullable
  RustPat getPat();

}
