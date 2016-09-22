package TP1.CalculatorTester; /**
 * Created by Tomas on 8/5/2016.
 */
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorTest {
    @Test
    public void evaluatesExpression() {
        Calculator calculator = new Calculator();
        int sum = calculator.evaluate("1+2+3");
        assertEquals(6, sum);
    }

    @Test
    public void evaluatesMultiply() {
        Calculator calculator = new Calculator();
        int result = calculator.multiply(3,10);
        assertEquals(30, result);
    }
}
