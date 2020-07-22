package com.smalaca.webinar.refactoring.domain.testssuite;

import com.smalaca.webinar.refactoring.domain.classcode.ClassCode;

public interface TestsSuiteRepository {
    boolean testsExistFor(ClassCode code);
}
