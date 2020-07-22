package com.smalaca.webinar.refactoring;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class WebinarRefactoringTest {
    @Test
    void shouldBeFun() {
        assertThat(refactoring().isFun()).isTrue();
    }

    private WebinarRefactoring refactoring() {
        return new WebinarRefactoring();
    }

    private static class WebinarRefactoring {
        boolean isFun() {
            return true;
        }
    }
}