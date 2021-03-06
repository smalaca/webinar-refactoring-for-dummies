package com.smalaca.webinar.refactoring.domain.methodcode;

import com.smalaca.webinar.refactoring.domain.classcode.RefactoringApplier;
import com.smalaca.webinar.refactoring.domain.refactoring.Refactoring;

public class MethodCondition {
    boolean isSameAs(MethodCondition condition) {
        return this.equals(condition);
    }

    public void modify(Refactoring refactoring) {

    }

    public void refactor(Refactoring refactoring) {
        RefactoringApplier.applyRefactoringFor(this, refactoring);
    }
}
