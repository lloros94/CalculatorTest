import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void whenAddTenToFiveThenResultFifthteen() {
        double expected = 15;
        double result = calculator.add(10,5);
        assertEquals(expected, result, 0.001);
    }

    @Test
    public void when5AddTo10AsStringThenResult() {
        double expected = 15;
        double result = calculator.add("10","5");
        assertEquals(expected, result, 0.001);
    }

    @Test(expected = Exception.class)
    public void whenInputIncorrectValueThenThrowException() {
/*        int expected = 1;
        int result = 0;
        try{
            calculator.add("asdav","5");
        } catch (Exception e) {
            result = 1;
        }

        assertEquals(expected, result);*/

/*        boolean wasException = false;
        try{
            calculator.add("asdav","5");
        } catch (Exception e) {
            wasException = true;
        }

        assertTrue(wasException);*/

        calculator.add("asdav","5");

    }

    @Test
    void add() {
        double expected2 = 150;
        double result2 = calculator.add(100,50);
        assertEquals(expected2, result2, 0.001);
    }

    @Test
    void minus() {
        double expected3 = 50;
        double result3 = calculator.minus(100,50);
        assertEquals(expected3, result3, 0.001);
    }

    @Test
    void multiply() {
        double expected4 = 5000;
        double result4 = calculator.multiply(100,50);
        assertEquals(expected4, result4, 0.001);
    }

    @AfterEach
    public void close() {
        calculator = null;
    }

}