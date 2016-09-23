package Parcial;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Toto on 22-Sep-16.
 */
public class ClientTest {
    Client Toto = new Client(750);
    FixedTerm A = new FixedTerm(20);
    FixedTerm B = new FixedTerm(15);

    @Test
    public void getFunds() throws Exception {
        assertEquals(500, Toto.getFunds(),0.1);
    }

    @Test
    public void invest() throws Exception {
        assertTrue(Toto.getPortfolio().getInversions().isEmpty());
        Toto.invest(300, A);
        assertFalse(Toto.getPortfolio().getInversions().isEmpty());
        assertEquals(200, Toto.getFunds(), 0.1);
    }

    @Test
    public void withdrawInvestment() throws Exception {
        Toto.invest(300, A);
        assertFalse(Toto.getPortfolio().getInversions().isEmpty());
        Toto.withdrawInvestment(Toto.getPortfolio().getInversions().get(0));
        assertTrue(Toto.getPortfolio().getInversions().isEmpty());
        Inversion inversionA = new Inversion(500, A);
        Toto.withdrawInvestment(inversionA);
    }

    @Test
    public void getProjectedFunds() throws Exception {
        Toto.invest(500, A);
        Toto.invest(250, B);
        assertEquals(887.5, Toto.getProjectedFunds(365),0.1);
        assertEquals(787.67, Toto.getProjectedFunds(100),0.1);
    }

}