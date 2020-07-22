package com.smalaca.webinar.refactoring.domain.classcode;

import com.smalaca.webinar.refactoring.domain.methodcode.MethodCondition;
import com.smalaca.webinar.refactoring.domain.refactoring.Refactoring;

class RefactoringApplier {
    static void applyRefactoringFor(MethodCondition condition, Refactoring refactoring) {
        condition.modify(refactoring);
    }
}
