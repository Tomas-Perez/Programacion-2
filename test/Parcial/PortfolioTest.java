package Parcial;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Toto on 22-Sep-16.
 */
public class PortfolioTest {
    @Test
    public void withdrawInversion() throws Exception {
        FixedTerm A = new FixedTerm(20);
        Inversion inversion = new Inversion(500, A);
        Portfolio portfolio = new Portfolio();
        portfolio.addInversion(inversion);
        portfolio.withdrawInversion(inversion);
        assertTrue(portfolio.getInversions().isEmpty());
    }

    @Test (expected = NoSuchInversionExc.class)
    public void withdrawInversion1() throws Exception {
        FixedTerm A = new FixedTerm(20);
        Inversion inversion = new Inversion(500, A);
        Inversion inversion1 = new Inversion(250, A);
        Portfolio portfolio = new Portfolio();
        portfolio.addInversion(inversion);
        portfolio.withdrawInversion(inversion1);
    }

    @Test
    public void getRentability() throws Exception {
        FixedTerm A = new FixedTerm(20);
        Inversion inversion = new Inversion(500, A);
        Portfolio portfolio = new Portfolio();
        portfolio.addInversion(inversion);
        assertEquals(100, portfolio.getRentability(inversion), 0.1);
    }

    @Test (expected = NoSuchInversionExc.class)
    public void getRentability1() throws Exception {
        FixedTerm A = new FixedTerm(20);
        Inversion inversion = new Inversion(500, A);
        Inversion inversion1 = new Inversion(250, A);
        Portfolio portfolio = new Portfolio();
        portfolio.addInversion(inversion);
        assertEquals(100, portfolio.getRentability(inversion1), 0.1);
    }

    @Test
    public void getProjectedFunds() throws Exception {
        FixedTerm A = new FixedTerm(20);
        FixedTerm B = new FixedTerm(15);
        Inversion inversionA = new Inversion(500, A);
        Inversion inversionB = new Inversion(250, B);
        Portfolio portfolio = new Portfolio();
        portfolio.addInversion(inversionA);
        portfolio.addInversion(inversionB);
        assertEquals(887.5, portfolio.getProjectedFunds(365), 0.1);
        assertEquals(787.67, portfolio.getProjectedFunds(100), 0.01);
    }

}