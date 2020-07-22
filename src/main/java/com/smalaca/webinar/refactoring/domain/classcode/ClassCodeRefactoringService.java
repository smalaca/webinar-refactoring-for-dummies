package com.smalaca.webinar.refactoring.domain.classcode;

import com.smalaca.webinar.refactoring.domain.developer.Developer;

class ClassCodeRefactoringService {
    void process(ClassCode classCode) {
        if (classCode.isComplexOrUnreadable()) {
            doRefactoring(classCode);
        }
    }

    private void doRefactoring(ClassCode classCode) {

    }
}
