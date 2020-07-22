package com.smalaca.webinar.refactoring.domain.refactoring;

public class Refactoring {
    private final RefactoringScope refactoringScope;

    public Refactoring(RefactoringScope refactoringScope) {
        this.refactoringScope = refactoringScope;
    }

    public RefactoringScope getScope() {
        return refactoringScope;
    }
}
