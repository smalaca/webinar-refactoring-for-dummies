package com.smalaca.webinar.refactoring.domain.codebase;

import com.smalaca.webinar.refactoring.domain.classcode.ClassCode;

public interface CodeBaseRepository {
    boolean contains(ClassCode code);
}
