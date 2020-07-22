package com.smalaca.webinar.refactoring.domain.refactoring;

import com.smalaca.webinar.refactoring.domain.classcode.ClassCode;
import com.smalaca.webinar.refactoring.domain.codebase.CodeBaseRepository;
import com.smalaca.webinar.refactoring.domain.developer.Developer;
import com.smalaca.webinar.refactoring.domain.testssuite.TestsSuiteRepository;

public class ComplexRefactoringService {
    private final TestsSuiteRepository testsSuiteRepository;

    ComplexRefactoringService(TestsSuiteRepository testsSuiteRepository) {
        this.testsSuiteRepository = testsSuiteRepository;
    }

    public void apply(ClassCode code, Developer developer) {
        if (testsSuiteRepository.testsExistFor(code)
                && developer.canModify(code)
                && (code.isComplex() || code.isUnreadable())) {
            startRefactoringOf(code, developer);
        }
    }

    private void startRefactoringOf(ClassCode code, Developer developer) {

    }
}
