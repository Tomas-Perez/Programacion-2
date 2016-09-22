package TP3.Heritage;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Tomas on 19-Aug-16.
 */
public class BTest {
    @Test
    public void m1() throws Exception {
        B b = new B();
        assertEquals(8, b.m1());
    }

    @Test
    public void m2() throws Exception {
        B b = new B();
        assertEquals(10, b.m2());
    }

    @Test
    public void m3() throws Exception {
        B b = new B();
        assertEquals(3, b.m3());
    }

    @Test
    public void m4() throws Exception {
        B b = new B();
        assertEquals(20, b.m4());
    }

    @Test (expected = StackOverflowError.class)
    public void m5() throws Exception {
        B b = new B();
        b.m5();
    }

    @Test
    public void m7() throws Exception {
        B b = new B();
        assertEquals(20, b.m7());
    }

}