package TP7.BetterInterval;

import org.junit.Test;

import static org.junit.Assert.*;

public class BetterIntervalTest {
    @Test
    public void iterator() throws Exception {
        BetterInterval interval = new BetterInterval(2, 15, 3);
        for (int i: interval) {
            System.out.println(i);
        }
    }


    @Test
    public void remove() throws Exception {
        BetterInterval interval = new BetterInterval(2, 15, 3);
        assertEquals(5, interval.size());
        interval.remove(2);
        assertEquals(4, interval.size());
    }

    @Test
    public void first() throws Exception {
        BetterInterval interval = new BetterInterval(2, 15, 3);
        assertEquals(2, interval.first());
    }

    @Test
    public void last() throws Exception {
        BetterInterval interval = new BetterInterval(2, 15, 3);
        assertEquals(14, interval.last());
    }

    @Test
    public void at() throws Exception {
        BetterInterval interval = new BetterInterval(2, 15, 3);
        assertEquals(2, interval.at(0));
        assertEquals(5, interval.at(1));
        assertEquals(8, interval.at(2));
        assertEquals(11, interval.at(3));
        assertEquals(14, interval.at(4));
    }

    @Test
    public void size() throws Exception {
        BetterInterval interval = new BetterInterval(2, 15, 3);
        assertEquals(5, interval.size());
    }

}