package org.jetbrains.rust.parser

import com.intellij.testFramework.ParsingTestCase
import org.jetbrains.rust.parser.grammar.RustParserDefinition

public class RustParserTest : ParsingTestCase("rust", "rs", RustParserDefinition()) {

    init {
        System.setProperty("idea.platform.prefix", "Idea")
    }

    override fun getTestDataPath(): String {
        return "plugin/test/data"
    }

    public fun testHello(): Unit = doTest(true)

}