package com.smalaca.webinar.refactoring.domain.refactoring;

import com.smalaca.webinar.refactoring.domain.classcode.ClassCode;
import com.smalaca.webinar.refactoring.domain.codebase.CodeBaseRepository;
import com.smalaca.webinar.refactoring.domain.developer.Developer;
import com.smalaca.webinar.refactoring.domain.testssuite.TestsSuiteRepository;

public class SimpleRefactoringService {
    private final IsRequiredToStartRefactoring isRequiredToStartRefactoring;

    SimpleRefactoringService(TestsSuiteRepository testsSuiteRepository, CodeBaseRepository codeBaseRepository) {
        isRequiredToStartRefactoring = new IsRequiredToStartRefactoring(codeBaseRepository, testsSuiteRepository);
    }

    public void apply(ClassCode code, Developer developer) {
        if (isRequiredToStartRefactoring.check(code)) {
            startRefactoringOf(code, developer);
        }
    }

    private void startRefactoringOf(ClassCode code, Developer developer) {

    }
}
