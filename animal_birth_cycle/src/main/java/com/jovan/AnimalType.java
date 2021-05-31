package com.jovan;

public enum AnimalType {

    HORSE(336, 16, 19),
    COW(280, 10, 15),
    PIG(114, 9, 10),
    GOAT(154, 9, 5),
    SHEEP(150, 5, 9),
    DOG(62, 9, 3),
    CAT(58, 2, 3),
    DUCK(30, 0, 0),
    RABBIT(30, 0, 0),
    CHICKEN(21, 0 ,0);


    private final Integer optimalNumberOfDays;
    private final Integer daysBeforeOptimalNumberOfDays;
    private final Integer daysAfterOptimalNumberOfDays;

    AnimalType(Integer optimalNumberOfDays, Integer daysBeforeOptimalNumberOfDays, Integer daysAfterOptimalNumberOfDays) {
        this.optimalNumberOfDays = optimalNumberOfDays;
        this.daysBeforeOptimalNumberOfDays = daysBeforeOptimalNumberOfDays;
        this.daysAfterOptimalNumberOfDays = daysAfterOptimalNumberOfDays;
    }

    public Integer getOptimalNumberOfDays() {
        return optimalNumberOfDays;
    }

    public Integer getDaysBeforeOptimalNumberOfDays() {
        return daysBeforeOptimalNumberOfDays;
    }

    public Integer getDaysAfterOptimalNumberOfDays() {
        return daysAfterOptimalNumberOfDays;
    }
}
