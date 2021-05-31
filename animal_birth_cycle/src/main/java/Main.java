import com.jovan.AnimalBirthService;
import com.jovan.InputHandler;
import com.jovan.AnimalType;
import com.jovan.ResultDates;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        LocalDate date = InputHandler.datePicker();
        AnimalType animalType = InputHandler.animalPicker();

        ResultDates resultDates = AnimalBirthService.countAnimalBirthDate(date, animalType);

        System.out.println("Result dates: ");
        System.out.println("Target date: " + resultDates.getTargetDate());
        System.out.println("Before date: " + resultDates.getDateBefore());
        System.out.println("After date: " + resultDates.getAfterDate());
    }
}
