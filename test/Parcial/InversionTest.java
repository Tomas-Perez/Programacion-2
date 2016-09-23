package Parcial;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Toto on 22-Sep-16.
 */
public class InversionTest {
    @Test
    public void getFixedTerm() throws Exception {
        FixedTerm A = new FixedTerm(20);
        Inversion inversion = new Inversion(500, A);
        assertTrue(A == inversion.getFixedTerm());
    }

    @Test
    public void getFunds() throws Exception {
        FixedTerm A = new FixedTerm(20);
        Inversion inversion = new Inversion(500, A);
        assertTrue(500 == inversion.getFunds());
    }

}