package org.jetbrains.rust.sdk

import com.intellij.openapi.projectRoots.*
import com.intellij.openapi.roots.OrderRootType
import com.intellij.openapi.util.SystemInfo
import com.intellij.openapi.util.io.FileUtil
import org.jdom.Element
import org.jetbrains.rust.icons.RustIcons
import java.io.File
import java.io.FileFilter
import java.io.FilenameFilter
import java.util.ArrayList
import java.util.Collections
import java.util.Comparator
import javax.swing.Icon

public class RustSdkType() : SdkType("Rust") {

    class SDKInfo(val sdkPath: File) {
    }

    override fun suggestHomePath(): String? {
        return null
    }

    override fun isValidSdkHome(path: String?): Boolean {
        return true;
    }

    override fun suggestSdkName(currentSdkName: String?, sdkHome: String?): String {
        return "Rust"
    }

    override fun getVersionString(sdkHome: String?): String? {
        return null
    }


    override fun saveAdditionalData(additionalData: SdkAdditionalData, additional: Element) {
    }


    override fun loadAdditionalData(additional: Element?): SdkAdditionalData? {
        return null;
    }

    override fun getPresentableName(): String {
        return "Rust"
    }

    override fun getIcon(): Icon {
        return RustIcons.RUST
    }

    override fun getIconForAddAction(): Icon {
        return getIcon()
    }

    override fun setupSdkPaths(sdk: Sdk) {
    }

    override fun isRootTypeApplicable(`type`: OrderRootType?): Boolean {
        return false
    }


    override fun createAdditionalDataConfigurable(p0: SdkModel?, p1: SdkModificator?):
            AdditionalDataConfigurable? = null

}
