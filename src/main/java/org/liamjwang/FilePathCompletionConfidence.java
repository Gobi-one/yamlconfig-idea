package org.liamjwang;

import com.intellij.codeInsight.completion.CompletionConfidence;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.util.ThreeState;
import org.jetbrains.annotations.NotNull;

public class FilePathCompletionConfidence extends CompletionConfidence {
    @NotNull
    @Override
    public ThreeState shouldSkipAutopopup(@NotNull PsiElement contextElement, @NotNull PsiFile psiFile, int offset) {
        return ThreeState.NO;
    }
}
