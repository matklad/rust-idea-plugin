package org.jetbrains.rust.actions;

import com.intellij.ide.actions.CreateFileAction;
import com.intellij.openapi.actionSystem.DataContext;
import com.intellij.openapi.actionSystem.LangDataKeys;
import com.intellij.openapi.module.Module;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.Messages;
import com.intellij.psi.PsiDirectory;
import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.rust.icons.RustIcons;
import org.jetbrains.rust.module.RustModuleType;

// Currently written in Java cause of KT-8959
public class NewRustFileAction extends CreateFileAction {
    private static final String WHAT = "Rust file";

    public NewRustFileAction() {
        super(WHAT, "Create new " + WHAT, RustIcons.RUST);
    }

    @Override
    protected boolean isAvailable(DataContext dataContext) {
        Module module = (Module) dataContext.getData(LangDataKeys.MODULE.getName());
        if (module == null) return false;

        String moduleTypeId = module.getOptionValue(Module.ELEMENT_TYPE);
        return RustModuleType.RUST_MODULE.equals(moduleTypeId);
    }

    @NotNull
    @Override
    protected PsiElement[] invokeDialog(Project project, PsiDirectory directory) {
        MyValidator validator = new MyValidator(project, directory);
        Messages.showInputDialog(
                project,
                "Enter name for new " + WHAT,
                "New " + WHAT,
                Messages.getQuestionIcon(),
                "",
                validator);

        return validator.getCreatedElements();
    }

    @NotNull
    @Override
    protected PsiElement[] create(String newName, PsiDirectory directory) throws Exception {
        return super.create(completeFileName(newName), directory);
    }

    private String completeFileName(String name) {
        return name.endsWith(".rs") ? name : name + ".rs";
    }

    protected class MyValidator extends CreateFileAction.MyValidator {
        public MyValidator(Project project, PsiDirectory directory) {
            super(project, directory);
        }

        @Override
        public boolean canClose(String inputString) {
            return super.canClose(completeFileName(inputString));
        }
    }
}
