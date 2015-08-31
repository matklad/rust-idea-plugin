package org.jetbrains.rust.fileType

import com.intellij.lang.Language
import com.intellij.openapi.vfs.VirtualFile
import com.intellij.psi.FileViewProvider
import com.intellij.psi.FileViewProviderFactory
import com.intellij.psi.PsiManager
import org.jetbrains.rust.RustViewProvider

public class RustFileViewProviderFactory() : FileViewProviderFactory {


    override fun createFileViewProvider(file: VirtualFile,
                                        language: Language?,
                                        manager: PsiManager,
                                        eventSystemEnabled: Boolean): FileViewProvider? {
        return RustViewProvider(manager, file, eventSystemEnabled, language!!)
    }
}
