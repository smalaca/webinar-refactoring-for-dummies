package com.smalaca.webinar.refactoring.domain.history;

import com.smalaca.webinar.refactoring.domain.developer.Author;
import com.smalaca.webinar.refactoring.domain.refactoring.RefactoringJustification;
import com.smalaca.webinar.refactoring.domain.refactoring.RefactoringScope;
import com.smalaca.webinar.refactoring.domain.refactoring.RefactoringType;

import java.time.LocalDate;

public class HistoryService {
    public void store(
            Author author, RefactoringType type, RefactoringScope scope, RefactoringJustification justification,
            LocalDate today) {
        store(new CodeChange(author, type, scope, justification, today));
    }

    private void store(CodeChange codeChange) {
        instruction1(codeChange.getAuthor(), codeChange.getType());
        instruction2(codeChange.getScope(), codeChange.getJustification(), codeChange.getToday());
        instruction3();
        instruction4();

        if (question1(codeChange.getAuthor())) {
            if (question2(codeChange.getScope())) {
                instruction5(codeChange.getAuthor(), codeChange.getScope());
                instruction6(codeChange.getAuthor(), codeChange.getScope(), codeChange.getJustification());
                instruction7();
            } else if (question3(codeChange.getAuthor(), codeChange.getScope())) {
                instruction8();
                instruction9(codeChange.getScope());
            }
        }

        instruction10(codeChange.getAuthor(), codeChange.getType(), codeChange.getScope(), codeChange.getJustification(), codeChange.getToday());
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
