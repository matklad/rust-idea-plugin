// This is a generated file. Not intended for manual editing.
package org.jetbrains.rust.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface RustImplItem extends PsiElement {

  @Nullable
  RustGenericParams getGenericParams();

  @NotNull
  List<RustImplMember> getImplMemberList();

  @NotNull
  List<RustInnerAttr> getInnerAttrList();

  @NotNull
  List<RustTySum> getTySumList();

  @NotNull
  List<RustVisibility> getVisibilityList();

  @Nullable
  RustWhereClause getWhereClause();

}
