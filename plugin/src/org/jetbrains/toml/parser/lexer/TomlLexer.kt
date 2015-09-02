package org.jetbrains.toml.parser.lexer

import com.intellij.lexer.FlexAdapter
import java.io.Reader

public class TomlLexer : FlexAdapter(_TomlLexer(null as Reader?))
