package org.jetbrains.rust.parser

import com.intellij.openapi.util.text.StringUtil
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiElementVisitor
import com.intellij.psi.PsiErrorElement
import com.intellij.psi.PsiFile
import com.intellij.testFramework.ParsingTestCase
import org.jetbrains.rust.parser.grammar.RustParserDefinition
import org.junit.Assert

public class RustParserTest : ParsingTestCase("rust", "rs", RustParserDefinition()) {

    init {
        System.setProperty("idea.platform.prefix", "Idea")
    }

    override fun getTestDataPath(): String {
        return "plugin/test/data"
    }

    public fun hasError(file: PsiFile): Boolean {
        var hasErrors = false
        file.accept(object : PsiElementVisitor() {
            override fun visitElement(element: PsiElement?) {
                if (element is PsiErrorElement) {
                    hasErrors = true
                    return
                }
                element!!.acceptChildren(this)
            }
        })
        return hasErrors
    }

    protected override fun getTestName(lowercaseFirstLetter: Boolean): String {
        val methodName = this.getName()
        val name = StringUtil.trimStart(methodName, "test")
        val result = StringBuilder()

        result.append(name[0].toLowerCase())
        for (ch in name.subSequence(1, name.length())) {
            if (ch.isUpperCase()) {
                result.append("_").append(ch.toLowerCase())
            } else {
                result.append(ch)
            }
        }
        return result.toString()
    }


    fun doTest() {
        val name = this.getTestName(true);
        val text = this.loadFile(name + ".rs")
        val psi = this.createPsiFile(name, text)
        Assert.assertFalse(hasError(psi))
    }

    public fun testLongFn1(): Unit = doTest()
    public fun testMod1(): Unit = doTest()
    public fun testStruct(): Unit = doTest()
    public fun testStringLit(): Unit = doTest()
    public fun testEmptyFile(): Unit = doTest()
    public fun testEnum(): Unit = doTest()
    public fun testChainsNoOverlow2(): Unit = doTest()
    public fun testStructLitsVisual(): Unit = doTest()
    public fun testStructLit(): Unit = doTest()
    public fun testIssue64(): Unit = doTest()
    public fun testSkip(): Unit = doTest()
    public fun testTuple(): Unit = doTest()
    public fun testMacro(): Unit = doTest()
    public fun testFnCustom(): Unit = doTest()
    public fun testExp(): Unit = doTest()
    public fun testMod2(): Unit = doTest()
    public fun testCommentsFn(): Unit = doTest()
    public fun testSingleLineIfElse(): Unit = doTest()
    public fun testMultiple(): Unit = doTest()
    public fun testFn(): Unit = doTest()
    public fun testDoc(): Unit = doTest()
    public fun testAttrib(): Unit = doTest()
    public fun testFnCustom3(): Unit = doTest()
    public fun testNoNewLineBeginning(): Unit = doTest()
    public fun testClosure(): Unit = doTest()
    public fun testFnCustom5(): Unit = doTest()
    public fun testChain(): Unit = doTest()
    public fun testLoop(): Unit = doTest()
    public fun testAssignment(): Unit = doTest()
    public fun testImportsReorde(): Unit = doTest()
    public fun testFnSimple(): Unit = doTest()
    public fun testOthe(): Unit = doTest()
    public fun testFnCustom4(): Unit = doTest()
    public fun testExprNoHint(): Unit = doTest()
    public fun testStructLitsVisualMultiline(): Unit = doTest()
    public fun testAttribExternCrate(): Unit = doTest()
    public fun testImport(): Unit = doTest()
    public fun testTrait(): Unit = doTest()
    public fun testStringLitCustom(): Unit = doTest()
    public fun testMatch(): Unit = doTest()
    public fun testPath(): Unit = doTest()
    public fun testChainsNoOverflow(): Unit = doTest()
    public fun testFnCustom6(): Unit = doTest()
    public fun testFnCustom2(): Unit = doTest()
    public fun testHello(): Unit = doTest()
    public fun testStructLitsMultiline(): Unit = doTest()
}
