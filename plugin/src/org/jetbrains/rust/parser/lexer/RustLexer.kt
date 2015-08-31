package org.jetbrains.rust.parser.lexer

import com.intellij.lexer.FlexAdapter

import java.io.Reader

public class RustLexer : FlexAdapter(_RustLexer(null as Reader?))
