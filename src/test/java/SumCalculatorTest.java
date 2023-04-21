import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SumCalculatorTest {
    private SumCalculator calculator;
    @BeforeEach
    public void createSumCalculator(){
        calculator = new SumCalculator();
    }

    @Test
    public void correctSumNumberFrom1To1() {
        int actual = calculator.sum(1);
        int expected = 1;
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void correctSumNumberFrom1To3() {
        int actual = calculator.sum(3);
        int expected = 6;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void returnsIllegalArgumentExceptionFor0() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> calculator.sum(0));
    }
}
