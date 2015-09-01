package org.jetbrains.rust.parser

import com.intellij.psi.tree.IElementType
import org.jetbrains.rust.RustLanguage

public class RustTokenType(debugName: String) : IElementType(debugName, RustLanguage.INSTANCE) {
    public val myName: String = debugName

}