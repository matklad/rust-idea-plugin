package org.jetbrains.toml.parser

import com.intellij.psi.tree.IElementType
import org.jetbrains.toml.TomlLanguage


public class TomlTokenType(debugName: String) : IElementType(debugName, TomlLanguage.INSTANCE)
