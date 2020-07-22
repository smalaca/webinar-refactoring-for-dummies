package com.smalaca.webinar.refactoring.domain.classcode;

import com.smalaca.webinar.refactoring.domain.refactoring.Refactoring;

public class ClassCodeRefactoredService {
    public void apply(ClassCode code, Refactoring refactoring) {
        code.refactor(refactoring);
    }
}
