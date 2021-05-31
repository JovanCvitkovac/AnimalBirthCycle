package com.jovan;

import java.time.LocalDate;


public class ResultDates {

    private final LocalDate targetDate;
    private final LocalDate dateBefore;
    private final LocalDate afterDate;

    public ResultDates(LocalDate targetDate, LocalDate dateBefore, LocalDate afterDate) {
        this.targetDate = targetDate;
        this.dateBefore = dateBefore;
        this.afterDate = afterDate;
    }

    public LocalDate getTargetDate() {
        return targetDate;
    }

    public LocalDate getDateBefore() {
        return dateBefore;
    }

    public LocalDate getAfterDate() {
        return afterDate;
    }
}
