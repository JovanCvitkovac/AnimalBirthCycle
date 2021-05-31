import com.jovan.InputHandler;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class InputHandlerTest {

    @Test
    public void test_to_see_is_entered_date_format_is_invalid() {
        boolean resultFalse = InputHandler.isDateValid("ssdd");
        Assertions.assertFalse(resultFalse);

    }

    @Test
    public void test_to_see_is_entered_date_format_a_valid_one() {
        boolean resultTrue = InputHandler.isDateValid("1111-11-11");
        Assertions.assertTrue(resultTrue);

    }

    @Test
    public void test_to_see_is_entered_animal_is_a_valid_one() {
        boolean resultTrue = InputHandler.isAnimalTypeValid("2");
        Assertions.assertTrue(resultTrue);
    }

    @Test
    public void test_to_see_is_entered_animal_is_a_invalid_one() {
        boolean resultFalse = InputHandler.isAnimalTypeValid("NaN");
        Assertions.assertFalse(resultFalse);
    }


}
