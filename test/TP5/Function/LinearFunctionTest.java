package TP5.Function;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Toto on 15-Sep-16.
 */
public class LinearFunctionTest {
    @Test
    public void evaluate() throws Exception {
        LinearFunction function = new LinearFunction(1,2);
        assertEquals(3, function.evaluate(1),0.1);
    }

}