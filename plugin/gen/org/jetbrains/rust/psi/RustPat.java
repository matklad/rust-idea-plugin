// This is a generated file. Not intended for manual editing.
package org.jetbrains.rust.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface RustPat extends PsiElement {

  @Nullable
  RustCommaSeparatedList getCommaSeparatedList();

  @Nullable
  RustLit getLit();

  @Nullable
  RustPat getPat();

  @Nullable
  RustPath getPath();

  @Nullable
  PsiElement getIdent();

}
