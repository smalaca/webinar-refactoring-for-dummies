package com.smalaca.webinar.refactoring.domain.classcode;

import com.smalaca.webinar.refactoring.domain.methodcode.MethodCondition;
import com.smalaca.webinar.refactoring.domain.refactoring.Refactoring;

public class ClassCodeRefactoredService {
    public void apply(ClassCode code, Refactoring refactoring) {
        MethodCondition condition = code.getMethodByName(refactoring.getScope()).getCondition(refactoring.getScope());

        RefactoringApplier.applyRefactoringFor(condition, refactoring);
    }
}
