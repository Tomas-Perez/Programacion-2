package TP1.Interval;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Toto on 11-Aug-16.
 */
public class IntervalTest {
    @Test
    public void getFirst() throws Exception {
        Interval interval = new Interval(2,8);
        assertEquals(2, interval.getFirst());
    }

    @Test
    public void getLast() throws Exception {
        Interval interval = new Interval(2,8);
        assertEquals(8, interval.getLast());
    }

    @Test
    public void getSize() throws Exception {
        Interval interval = new Interval(2,8);
        assertEquals(6, interval.getSize());
    }

    @Test
    public void at() throws Exception {
        Interval interval = new Interval(2,8);
        assertEquals(5, interval.at(3));
    }

}