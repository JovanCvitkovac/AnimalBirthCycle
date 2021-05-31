package com.jovan;

import org.apache.commons.lang3.StringUtils;

import java.time.LocalDate;
import java.util.Scanner;

public class InputHandler {

    private final static Scanner scanner = new Scanner(System.in);

    public static LocalDate datePicker() {
        System.out.println("Please enter date of conception: ");
        String enteredDateAsString = scanner.nextLine();
        while (!InputHandler.isDateValid(enteredDateAsString)) {
            System.out.println("Entered date format is not valid, please try again!");
            enteredDateAsString = scanner.nextLine();
        }
        return LocalDate.parse(enteredDateAsString);
    }

    public static boolean isDateValid(String enteredDateAsString) {
        return DateValidator.validate(enteredDateAsString);
    }

    public static AnimalType animalPicker() {
        displayAllowedAnimals();
        String animalTypeOrdinalAsString = scanner.nextLine();
        while (!InputHandler.isAnimalTypeValid(animalTypeOrdinalAsString)) {
            animalTypeOrdinalAsString = scanner.nextLine();
        }
        return getAnimalTypeAsOrdinal(Integer.parseInt(animalTypeOrdinalAsString));
    }


    private static AnimalType getAnimalTypeAsOrdinal(Integer ordinal) {
        AnimalType animalType = null;
        for (AnimalType type : AnimalType.values()) {
            if (type.ordinal() == ordinal) {
                animalType = type;
            }
        }
        return animalType;
    }

    private static void displayAllowedAnimals() {
        System.out.println("Please pick animal type. Allowed types are: ");
        for (AnimalType animalType : AnimalType.values()) {
            System.out.println(animalType.name() +  " " + animalType.ordinal());
        }
    }

    public static boolean isAnimalTypeValid(String enteredAnimalNumberAsString) {
        if (!StringUtils.isNumeric(enteredAnimalNumberAsString)) {
            System.out.println("Entered value must be a number");
            return false;
        }
        int i = Integer.parseInt(enteredAnimalNumberAsString);
        if (i > 9) {
            System.out.println("Entered number should be from 0 to 9, please try again");
            return false;
        }
        return true;
    }
}
