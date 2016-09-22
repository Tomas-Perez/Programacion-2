package TP3.Heritage;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Toto on 19-Aug-16.
 */
public class CTest {
    @Test
    public void m1() throws Exception {
        C c = new C();
        assertEquals(9, c.m1());
    }

    @Test
    public void m2() throws Exception {
        C c = new C();
        assertEquals(3, c.m2());
    }

    @Test
    public void m3() throws Exception {
        C c = new C();
        assertEquals(3, c.m3());
    }

    @Test
    public void m4() throws Exception {
        C c = new C();
        assertEquals(20, c.m4());
    }

    @Test (expected = StackOverflowError.class)
    public void m5() throws Exception {
        C c = new C();
        c.m5();
    }

    @Test
    public void m6() throws Exception {
        C c = new C();
        assertEquals(3, c.m6());
    }

    @Test
    public void m7() throws Exception {
        C c = new C();
        assertEquals(20, c.m7());
    }


}