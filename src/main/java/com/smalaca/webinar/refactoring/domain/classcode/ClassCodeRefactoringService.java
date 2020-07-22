package com.smalaca.webinar.refactoring.domain.classcode;

class ClassCodeRefactoringService {
    void process(ClassCode classCode) {
        if (classCode.shouldBeRefactored()) {
            doRefactoring(classCode);
        }
    }

    private void doRefactoring(ClassCode classCode) {

    }
}
