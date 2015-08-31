package org.jetbrains.rust;

import com.intellij.lang.Language;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.psi.PsiManager;
import com.intellij.psi.SingleRootFileViewProvider;
import org.jetbrains.annotations.NotNull;

public class RustViewProvider extends SingleRootFileViewProvider {

  public RustViewProvider(@NotNull PsiManager manager, @NotNull VirtualFile file) {
   super(manager, file);
  }

  public RustViewProvider(@NotNull PsiManager manager, @NotNull VirtualFile virtualFile, final boolean physical) {
    super(manager, virtualFile, physical);
  }

  public RustViewProvider(@NotNull PsiManager manager, @NotNull VirtualFile virtualFile, final boolean eventSystemEnabled, @NotNull Language language) {
    super(manager, virtualFile, eventSystemEnabled, language);
  }

  public boolean supportsIncrementalReparse(final Language rootLanguage) {
    return false;
  }

}
