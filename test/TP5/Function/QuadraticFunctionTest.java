package TP5.Function;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Toto on 15-Sep-16.
 */
public class QuadraticFunctionTest {
    @Test
    public void evaluate() throws Exception {
        QuadraticFunction function = new QuadraticFunction(2,4,1);
        assertEquals(7, function.evaluate(1),0.1);
    }

}