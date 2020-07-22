package com.smalaca.webinar.refactoring.infrastructure.history;

import com.smalaca.webinar.refactoring.domain.developer.Author;
import com.smalaca.webinar.refactoring.domain.history.HistoryService;
import com.smalaca.webinar.refactoring.domain.refactoring.RefactoringJustification;
import com.smalaca.webinar.refactoring.domain.refactoring.RefactoringScope;
import com.smalaca.webinar.refactoring.domain.refactoring.RefactoringType;

import java.time.LocalDate;

class HistoryServiceClient {
    private final HistoryService historyService;

    HistoryServiceClient(HistoryService historyService) {
        this.historyService = historyService;
    }

    void process(
            Author author, RefactoringType type, RefactoringScope scope, RefactoringJustification justification, LocalDate today) {
        // some code
        historyService.store(author, type, scope, justification, today);
        // some code
    }
}
