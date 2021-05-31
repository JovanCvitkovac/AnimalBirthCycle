package com.jovan;

import java.time.LocalDate;


public class AnimalBirthService {

    public static ResultDates countAnimalBirthDate(LocalDate date, AnimalType animalType) {
        LocalDate targetDate = date.plusDays(animalType.getOptimalNumberOfDays());
        LocalDate dateBefore = targetDate.minusDays(animalType.getDaysBeforeOptimalNumberOfDays());
        LocalDate afterDate = targetDate.plusDays(animalType.getDaysAfterOptimalNumberOfDays());
        return new ResultDates(targetDate, dateBefore, afterDate);
    }

}
