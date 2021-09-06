import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setUp(){
        calculator = new Calculator();
    }

    @Test
    public void mathCalculation() {

        String[] inArray1 = {"1", "+", "2"};
        String expected1 = "3";
        String result1 = calculator.mathCalculation(inArray1);
        assertEquals(expected1, result1);

        String[] inArray2 = {"VI", "/", "III"};
        String expected2 = "II";
        String result2 = calculator.mathCalculation(inArray2);
        assertEquals(expected2, result2);

        String[] inArray3 = {"IX", "*", "VII"};
        String expected3 = "LXIII";
        String result3 = calculator.mathCalculation(inArray3);
        assertEquals(expected3, result3);
    }

    @After
    public void close() {
        System.out.println("Тест окончен");
    }
}