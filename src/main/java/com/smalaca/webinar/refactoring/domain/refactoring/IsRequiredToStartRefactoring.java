package com.smalaca.webinar.refactoring.domain.refactoring;

import com.smalaca.webinar.refactoring.domain.classcode.ClassCode;
import com.smalaca.webinar.refactoring.domain.codebase.CodeBaseRepository;
import com.smalaca.webinar.refactoring.domain.testssuite.TestsSuiteRepository;

class IsRequiredToStartRefactoring {
    private final CodeBaseRepository codeBaseRepository;
    private final TestsSuiteRepository testsSuiteRepository;

    IsRequiredToStartRefactoring(CodeBaseRepository codeBaseRepository, TestsSuiteRepository testsSuiteRepository) {
        this.codeBaseRepository = codeBaseRepository;
        this.testsSuiteRepository = testsSuiteRepository;
    }

    boolean check(ClassCode code) {
        return codeBaseRepository.contains(code)
                && testsSuiteRepository.testsExistFor(code)
                && code.isComplex();
    }
}
