package org.jetbrains.rust.module

import com.intellij.openapi.module.ModuleType
import org.jetbrains.rust.icons.RustIcons
import org.jetbrains.rust.fileType.RustFileType
import javax.swing.Icon

public class RustModuleType() : ModuleType<RustModuleBuilder>(RustModuleType.RUST_MODULE) {

    override fun createModuleBuilder(): RustModuleBuilder {
        return RustModuleBuilder()
    }

    override fun getName(): String {
        return "Rust Module"
    }

    override fun getDescription(): String {
        return "Rust Module"
    }

    override fun getBigIcon(): Icon {
        return RustIcons.RUST
    }

    override fun getNodeIcon(isOpened: Boolean): Icon {
        return RustFileType.INSTANCE.getIcon()
    }

    companion object {
        public val RUST_MODULE: String = "RUST_MODULE"
        public val INSTANCE: RustModuleType = RustModuleType()
    }
}
