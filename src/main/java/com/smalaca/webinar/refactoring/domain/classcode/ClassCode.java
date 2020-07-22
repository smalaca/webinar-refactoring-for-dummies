package com.smalaca.webinar.refactoring.domain.classcode;

import com.smalaca.webinar.refactoring.domain.attributecode.AttributeCode;
import com.smalaca.webinar.refactoring.domain.constantcode.ConstantCode;
import com.smalaca.webinar.refactoring.domain.methodcode.MethodCode;
import com.smalaca.webinar.refactoring.domain.methodcode.MethodCondition;
import com.smalaca.webinar.refactoring.domain.refactoring.Refactoring;
import com.smalaca.webinar.refactoring.domain.refactoring.RefactoringScope;

import java.util.List;

public class ClassCode {
    private final List<ConstantCode> constants;
    private final List<AttributeCode> attributes;
    private final List<MethodCode> methods;
    private boolean complex;
    private boolean unreadable;

    ClassCode(List<ConstantCode> constants, List<AttributeCode> attributes, List<MethodCode> methods) {
        this.constants = constants;
        this.attributes = attributes;
        this.methods = methods;
    }

    boolean isComplexOrUnreadable() {
        return complex || unreadable;
    }

    private MethodCode getMethodByName(RefactoringScope scope) {
        return methods.stream()
                .filter(methodCode -> methodCode.hasNameSameAs(scope.getName()))
                .findAny().get();
    }

    void refactor(Refactoring refactoring) {
        MethodCondition condition = getConditionBy(refactoring.getScope());

        condition.refactor(refactoring);
    }

    private MethodCondition getConditionBy(RefactoringScope scope) {
        return getMethodByName(scope).getCondition(scope);
    }

    public boolean canBeImproved() {
        return isComplex() || isUnreadable();
    }

    public boolean isComplex() {
        return complex;
    }

    public boolean isUnreadable() {
        return unreadable;
    }
}
