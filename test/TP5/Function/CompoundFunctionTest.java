package TP5.Function;

import TP1.Polynomial.Polynomial;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Toto on 15-Sep-16.
 */
public class CompoundFunctionTest {
    @Test
    public void evaluate() throws Exception {
        LinearFunction function1 = new LinearFunction(1,2);
        QuadraticFunction function2 = new QuadraticFunction(2,4,1);
        CompoundFunction function = new CompoundFunction(function2, function1);
        assertEquals(31, function.evaluate(1),0.1);
        Polynomial polynomial = new Polynomial(3);
        polynomial.setCoef(0,1);
        polynomial.setCoef(1,4);
        polynomial.setCoef(2,2);
        CompoundFunction function3 = new CompoundFunction(polynomial, function1);
        assertEquals(31, function3.evaluate(1),0.1);
    }

}