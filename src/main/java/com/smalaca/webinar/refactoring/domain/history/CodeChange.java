package com.smalaca.webinar.refactoring.domain.history;

import com.smalaca.webinar.refactoring.domain.developer.Author;
import com.smalaca.webinar.refactoring.domain.refactoring.RefactoringJustification;
import com.smalaca.webinar.refactoring.domain.refactoring.RefactoringScope;
import com.smalaca.webinar.refactoring.domain.refactoring.RefactoringType;

import java.time.LocalDate;

class CodeChange {
    private final Author author;
    private final RefactoringType type;
    private final RefactoringScope scope;
    private final RefactoringJustification justification;
    private final LocalDate today;

    CodeChange(
            Author author, RefactoringType type, RefactoringScope scope, RefactoringJustification justification, LocalDate today) {
        this.author = author;
        this.type = type;
        this.scope = scope;
        this.justification = justification;
        this.today = today;
    }

    Author getAuthor() {
        return author;
    }

    RefactoringType getType() {
        return type;
    }

    RefactoringScope getScope() {
        return scope;
    }

    RefactoringJustification getJustification() {
        return justification;
    }

    LocalDate getToday() {
        return today;
    }
}
