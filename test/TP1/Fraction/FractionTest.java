package TP1.Fraction;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Toto on 12-Aug-16.
 */
public class FractionTest {
    @Test
    public void getNumerator() throws Exception {
        Fraction fraction = new Fraction(5,2);
        assertEquals(5,fraction.getNumerator());
    }

    @Test
    public void getDenominator() throws Exception {
        Fraction fraction = new Fraction(5,2);
        assertEquals(2,fraction.getDenominator());
    }

    @Test
    public void add() throws Exception {
        Fraction fraction1 = new Fraction(5,2);
        Fraction fraction2 = new Fraction(5,2);
    }

    @Test
    public void sub() throws Exception {

    }

    @Test
    public void add1() throws Exception {

    }

    @Test
    public void multiply() throws Exception {

    }

    @Test
    public void division() throws Exception {

    }

    @Test
    public void asFloat() throws Exception {

    }

    @Test
    public void equals() throws Exception {

    }

}