package com.smalaca.webinar.refactoring.domain.history;

import com.smalaca.webinar.refactoring.domain.developer.Author;
import com.smalaca.webinar.refactoring.domain.refactoring.RefactoringJustification;
import com.smalaca.webinar.refactoring.domain.refactoring.RefactoringScope;
import com.smalaca.webinar.refactoring.domain.refactoring.RefactoringType;

import java.time.LocalDate;

public class HistoryService {
    public void store(
            Author author, RefactoringType type, RefactoringScope scope, RefactoringJustification justification, LocalDate today) {
        instruction1(author, type);
        instruction2(scope, justification, today);
        instruction3();
        instruction4();

        if (question1(author)) {
            if (question2(scope)) {
                instruction5(author, scope);
                instruction6(author, scope, justification);
                instruction7();
            } else if (question3(author, scope)) {
                instruction8();
                instruction9(scope);
            }
        }

        instruction10(author, type, scope, justification, today);
    }

    private void instruction1(Author author, RefactoringType type) {

    }

    private void instruction2(RefactoringScope scope, RefactoringJustification justification, LocalDate today) {

    }

    private void instruction3() {

    }

    private void instruction4() {

    }

    private boolean question1(Author author) {
        return false;
    }

    private boolean question2(RefactoringScope scope) {
        return false;
    }

    private void instruction5(Author author, RefactoringScope scope) {

    }

    private void instruction6(Author author, RefactoringScope scope, RefactoringJustification justification) {

    }

    private void instruction7() {

    }

    private boolean question3(Author author, RefactoringScope scope) {
        return false;
    }

    private void instruction8() {

    }

    private void instruction9(RefactoringScope scope) {

    }

    private void instruction10(Author author, RefactoringType type, RefactoringScope scope, RefactoringJustification justification, LocalDate today) {

    }
}
