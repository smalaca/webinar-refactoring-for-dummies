package com.smalaca.webinar.refactoring.domain.refactoring;

import com.smalaca.webinar.refactoring.domain.classcode.ClassCode;
import com.smalaca.webinar.refactoring.domain.codebase.CodeBaseRepository;
import com.smalaca.webinar.refactoring.domain.developer.Developer;
import com.smalaca.webinar.refactoring.domain.testssuite.TestsSuiteRepository;

public class SimpleRefactoringService {
    private final TestsSuiteRepository testsSuiteRepository;
    private final CodeBaseRepository codeBaseRepository;

    SimpleRefactoringService(TestsSuiteRepository testsSuiteRepository, CodeBaseRepository codeBaseRepository) {
        this.testsSuiteRepository = testsSuiteRepository;
        this.codeBaseRepository = codeBaseRepository;
    }

    public void apply(ClassCode code, Developer developer) {
        if (isRequiredToStartRefactoring(code)) {
            startRefactoringOf(code, developer);
        }
    }

    private boolean isRequiredToStartRefactoring(ClassCode code) {
        return codeBaseRepository.contains(code)
                && testsSuiteRepository.testsExistFor(code)
                && code.isComplex();
    }

    private void startRefactoringOf(ClassCode code, Developer developer) {

    }
}
