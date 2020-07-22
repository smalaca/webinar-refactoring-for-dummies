package com.smalaca.webinar.refactoring.domain.developer;

import com.smalaca.webinar.refactoring.domain.classcode.ClassCode;
import com.smalaca.webinar.refactoring.domain.codebase.CodeBaseAccess;

import java.util.List;

public class Developer {
    private final List<CodeBaseAccess> accesses;

    public Developer(List<CodeBaseAccess> accesses) {
        this.accesses = accesses;
    }

    public boolean canModify(ClassCode code) {
        return accesses.stream()
                .anyMatch(access -> access.allowsToModify(code));
    }
}
