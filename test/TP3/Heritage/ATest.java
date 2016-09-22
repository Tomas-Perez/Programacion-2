package TP3.Heritage;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Tomas on 19-Aug-16.
 */
public class ATest {
    @Test
    public void m1() throws Exception {
        A a = new A();
        assertEquals(3, a.m1());
    }

    @Test
    public void m2() throws Exception {
        A a = new A();
        assertEquals(10, a.m2());
    }

    @Test
    public void m3() throws Exception {
        A a = new A();
        assertEquals(3, a.m3());
    }

    @Test (expected = StackOverflowError.class)
    public void m4() throws Exception {
        A a = new A();
        a.m4();
    }

}