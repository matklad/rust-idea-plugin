package org.jetbrains.toml.psi

import com.intellij.extapi.psi.PsiFileBase
import com.intellij.openapi.fileTypes.FileType
import com.intellij.psi.FileViewProvider
import org.jetbrains.toml.TomlLanguage
import org.jetbrains.toml.fileType.TomlFileType

class TomlFile(viewProvider: FileViewProvider) : PsiFileBase(viewProvider, TomlLanguage.INSTANCE) {
    override fun getFileType(): FileType =
            TomlFileType.INSTANCE

    override fun toString(): String =
            "TOML File"
}
