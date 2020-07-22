package com.smalaca.webinar.refactoring.domain.classcode;

import com.smalaca.webinar.refactoring.domain.developer.Developer;

class ClassCodeVerificationService {
    private final IsRefactoringPossibleAndJustifiedPredicate isRefactoringPossibleAndJustifiedPredicate;

    ClassCodeVerificationService(IsRefactoringPossibleAndJustifiedPredicate isRefactoringPossibleAndJustifiedPredicate) {
        this.isRefactoringPossibleAndJustifiedPredicate = isRefactoringPossibleAndJustifiedPredicate;
    }

    void process(ClassCode classCode, Developer developer) {
        if (isRefactoringPossibleAndJustifiedPredicate.check(classCode, developer)) {
            doRefactoring(classCode);
        }
    }

    private void doRefactoring(ClassCode classCode) {

    }
}
