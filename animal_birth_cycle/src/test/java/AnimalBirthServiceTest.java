import com.jovan.AnimalBirthService;
import com.jovan.AnimalType;
import com.jovan.ResultDates;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class AnimalBirthServiceTest {

    @Test
    public void test_optimal_delivery_date_for_animal_cow() {
        LocalDate today = LocalDate.now();
        ResultDates resultDates = AnimalBirthService.countAnimalBirthDate(today, AnimalType.COW);
        LocalDate expectedDate = today.plusDays(AnimalType.COW.getOptimalNumberOfDays()); //
        Assertions.assertEquals(resultDates.getTargetDate(), expectedDate);
    }
    @Test
    public void test_optimal_delivery_date_for_animal_horse() {
        LocalDate today = LocalDate.now();
        ResultDates resultDates = AnimalBirthService.countAnimalBirthDate(today, AnimalType.HORSE);
        LocalDate expectedDate = today.plusDays(AnimalType.HORSE.getOptimalNumberOfDays()); //
        Assertions.assertEquals(resultDates.getTargetDate(), expectedDate);
    }
    @Test
    public void test_optimal_delivery_date_for_animal_pig() {
        LocalDate today = LocalDate.now();
        ResultDates resultDates = AnimalBirthService.countAnimalBirthDate(today, AnimalType.PIG);
        LocalDate expectedDate = today.plusDays(114); //
        Assertions.assertEquals(resultDates.getTargetDate(), expectedDate);
    }
    @Test
    public void test_optimal_delivery_date_for_animal_goat() {
        LocalDate today = LocalDate.now();
        ResultDates resultDates = AnimalBirthService.countAnimalBirthDate(today, AnimalType.GOAT);
        LocalDate expectedDate = today.plusDays(AnimalType.GOAT.getOptimalNumberOfDays()); //
        Assertions.assertEquals(resultDates.getTargetDate(), expectedDate);
    }
    @Test
    public void test_optimal_delivery_date_for_animal_sheep() {
        LocalDate today = LocalDate.now();
        ResultDates resultDates = AnimalBirthService.countAnimalBirthDate(today, AnimalType.SHEEP);
        LocalDate expectedDate = today.plusDays(AnimalType.SHEEP.getOptimalNumberOfDays()); //
        Assertions.assertEquals(resultDates.getTargetDate(), expectedDate);
    }
    @Test
    public void test_optimal_delivery_date_for_animal_chicken() {
        LocalDate today = LocalDate.now();
        ResultDates resultDates = AnimalBirthService.countAnimalBirthDate(today, AnimalType.CHICKEN);
        LocalDate expectedDate = today.plusDays(AnimalType.CHICKEN.getOptimalNumberOfDays()); //
        Assertions.assertEquals(resultDates.getTargetDate(), expectedDate);
    }
    @Test
    public void test_optimal_delivery_date_for_animal_dog() {
        LocalDate today = LocalDate.now();
        ResultDates resultDates = AnimalBirthService.countAnimalBirthDate(today, AnimalType.DOG);
        LocalDate expectedDate = today.plusDays(AnimalType.DOG.getOptimalNumberOfDays()); //
        Assertions.assertEquals(resultDates.getTargetDate(), expectedDate);
    }
    @Test
    public void test_optimal_delivery_date_for_animal_cat() {
        LocalDate today = LocalDate.now();
        ResultDates resultDates = AnimalBirthService.countAnimalBirthDate(today, AnimalType.CAT);
        LocalDate expectedDate = today.plusDays(AnimalType.CAT.getOptimalNumberOfDays()); //
        Assertions.assertEquals(resultDates.getTargetDate(), expectedDate);
    }
    @Test
    public void test_optimal_delivery_date_for_animal_rabbit() {
        LocalDate today = LocalDate.now();
        ResultDates resultDates = AnimalBirthService.countAnimalBirthDate(today, AnimalType.RABBIT);
        LocalDate expectedDate = today.plusDays(AnimalType.RABBIT.getOptimalNumberOfDays());
        Assertions.assertEquals(resultDates.getTargetDate(), expectedDate);
    }
    @Test
    public void test_optimal_delivery_date_for_animal_duck() {
        LocalDate today = LocalDate.now();
        ResultDates resultDates = AnimalBirthService.countAnimalBirthDate(today, AnimalType.DUCK);
        LocalDate expectedDate = today.plusDays(AnimalType.DUCK.getOptimalNumberOfDays()); //
        Assertions.assertEquals(resultDates.getTargetDate(), expectedDate);
    }
}
