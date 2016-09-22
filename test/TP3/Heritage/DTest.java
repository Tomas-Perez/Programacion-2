package TP3.Heritage;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Toto on 19-Aug-16.
 */
public class DTest {

    @Test
    public void m1() throws Exception {
        D d = new D();
        assertEquals(3, d.m1());
    }

    @Test
    public void m2() throws Exception {
        D d = new D();
        assertEquals(10, d.m2());
    }

    @Test
    public void m3() throws Exception {
        D d = new D();
        assertEquals(2, d.m3());
    }

    @Test
    public void m4() throws Exception {
        D d = new D();
        assertEquals(20, d.m4());
    }

    @Test
    public void m5() throws Exception {
        D d = new D();
        assertEquals(20, d.m5());
    }

    @Test
    public void m7() throws Exception {
        D d = new D();
        assertEquals(20, d.m7());
    }



}