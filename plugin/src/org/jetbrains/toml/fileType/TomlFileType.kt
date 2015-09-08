package org.jetbrains.toml.fileType

import com.intellij.openapi.fileTypes.LanguageFileType
import com.intellij.openapi.vfs.VirtualFile
import org.jetbrains.rust.icons.RustIcons
import org.jetbrains.toml.TomlLanguage
import org.jetbrains.toml.parser.TomlIcons
import javax.swing.Icon

public class TomlFileType : LanguageFileType(TomlLanguage.INSTANCE) {

    private var myIcon: Icon = TomlIcons.CARGO

    override fun getName(): String =
            "TOML file"

    override fun getDescription(): String =
            "TOML file"

    override fun getDefaultExtension(): String =
            DEFAULT_EXTENSION

    override fun getIcon(): Icon =
            myIcon

    override fun getCharset(file: VirtualFile, content: ByteArray): String =
            "UTF-8"

    companion object {
        public val INSTANCE: TomlFileType = TomlFileType()
        public val DEFAULT_EXTENSION: String = "toml"
    }

}
