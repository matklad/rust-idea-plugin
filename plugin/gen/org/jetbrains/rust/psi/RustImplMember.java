// This is a generated file. Not intended for manual editing.
package org.jetbrains.rust.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface RustImplMember extends PsiElement {

  @Nullable
  RustExpr getExpr();

  @Nullable
  RustMemberFnItem getMemberFnItem();

  @Nullable
  RustTySum getTySum();

  @Nullable
  PsiElement getIdent();

}
