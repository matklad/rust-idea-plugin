package org.jetbrains.rust.fileType

import com.intellij.openapi.fileTypes.LanguageFileType
import com.intellij.openapi.vfs.VirtualFile
import org.jetbrains.rust.icons.RustIcons
import org.jetbrains.rust.RustLanguage
import javax.swing.Icon

public class RustFileType() : LanguageFileType(RustLanguage.INSTANCE) {

    private var myIcon: Icon = RustIcons.RUST

    override fun getName(): String =
            "Rust file"

    override fun getDescription(): String =
            "Rust file"

    override fun getDefaultExtension(): String =
            DEFAULT_EXTENSION

    override fun getIcon(): Icon =
            myIcon

    override fun getCharset(file: VirtualFile, content: ByteArray?): String =
            "UTF-8"

    companion object {
        public val INSTANCE: RustFileType = RustFileType()
        public val DEFAULT_EXTENSION: String = "rs"
    }
}
