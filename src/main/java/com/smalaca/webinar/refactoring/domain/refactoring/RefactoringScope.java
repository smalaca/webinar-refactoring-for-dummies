package com.smalaca.webinar.refactoring.domain.refactoring;

import com.smalaca.webinar.refactoring.domain.methodcode.MethodCondition;

public class RefactoringScope {
    private final String name;
    private final Object origin;
    private final Object refactored;

    public RefactoringScope(String name, Object origin, Object refactored) {
        this.name = name;
        this.origin = origin;
        this.refactored = refactored;
    }

    public String getName() {
        return name;
    }

    public MethodCondition getOriginAsCondition() {
        return (MethodCondition) origin;
    }
}
