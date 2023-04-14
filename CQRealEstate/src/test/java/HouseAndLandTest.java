import org.junit.Test;
import org.junit.jupiter.api.Assertions;
public class HouseAndLandTest {
    @Test
    public void testRequestValidInt() {
        int validInput = 1;
        int inValidInput = -2;
        int inValidInput2 = 0;
        int min = 0;

        Assertions.assertEquals(validInput, Validator.requestValidInt("Enter a number", min));

    }
}
