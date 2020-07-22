package com.smalaca.webinar.refactoring.domain.methodcode;

import com.smalaca.webinar.refactoring.domain.refactoring.RefactoringScope;

import java.util.List;

public class MethodCode {
    private final String name;
    private final List<MethodCondition> conditions;

    public MethodCode(String name, List<MethodCondition> conditions) {
        this.name = name;
        this.conditions = conditions;
    }

    public boolean hasNameSameAs(String name) {
        return this.name.equals(name);
    }

    public MethodCondition getCondition(RefactoringScope scope) {
        return conditions.stream()
                .filter(condition -> condition.isSameAs(scope.getOriginAsCondition()))
                .findAny().get();
    }
}
