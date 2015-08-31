package org.jetbrains.rust.fileType

import com.intellij.extapi.psi.PsiFileBase
import com.intellij.openapi.fileTypes.FileType
import com.intellij.psi.FileViewProvider
import com.intellij.psi.PsiElementVisitor
import org.jetbrains.rust.RustLanguage

public class RustFile(provider: FileViewProvider) : PsiFileBase(provider, RustLanguage.INSTANCE) {

    override fun getFileType(): FileType {
        return RustFileType.INSTANCE
    }

    override fun accept(visitor: PsiElementVisitor) {
        visitor.visitFile(this)
    }
}