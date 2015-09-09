package org.jetbrains.rust.parser;

import com.intellij.testFramework.ParsingTestCase;
import org.jetbrains.rust.parser.grammar.RustParserDefinition;

public class RustParserTest extends ParsingTestCase {
    static {
        System.setProperty("idea.platform.prefix", "Idea");
    }

    public RustParserTest() {
        super("rust", "rs", new RustParserDefinition());
    }

    @Override
    protected String getTestDataPath() {
        return "plugin/test/data";
    }

    public void testHello() throws Exception { doTest(true); }

}