package TP1.Polynomial;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Toto on 11-Aug-16.
 */
public class PolynomialTest {
    @Test
    public void setCoef() throws Exception {
        Polynomial polynomial = new Polynomial(10);
        polynomial.setCoef(2,1); // x^2
        assertEquals(4, polynomial.evaluate(2));
    }

    @Test
    public void evaluate() throws Exception {
        Polynomial polynomial = new Polynomial(10);
        polynomial.setCoef(2,1);
        polynomial.setCoef(0,1);
        polynomial.setCoef(1,5); // x^2+5x+1
        assertEquals(15, polynomial.evaluate(2));
    }

    @Test
    public void derivate() throws Exception {
        Polynomial polynomial = new Polynomial(10);
        polynomial.setCoef(2,1);
        polynomial.setCoef(0,1);
        polynomial.setCoef(1,5); // x^2+5x+1
        Polynomial newpolynomial = polynomial.derivate(); // 2x+5
        assertEquals(11, newpolynomial.evaluate(3));
    }

}