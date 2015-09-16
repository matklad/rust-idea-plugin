package org.jetbrains.rust.parser

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

    fun doTest() {
        val name = this.getTestName(true);
        val text = this.loadFile(name + ".rs")
        val psi = this.createPsiFile(name, text)
        Assert.assertFalse(hasError(psi))
    }

    public fun testHello(): Unit = doTest()

}