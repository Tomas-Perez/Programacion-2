package TP8.Set;

import org.junit.Test;

import static org.junit.Assert.*;

public class SetTest {

    Set<Integer> set = new Set<>();

    @Test
    public void iterator() throws Exception {
        set.add(5);
        set.add(3);
        set.add(0);

        for (Integer i: set) {
            System.out.println(i);
        }
    }

    @Test
    public void contains() throws Exception {
        set.add(5);
        set.add(3);
        set.add(0);
        assertTrue(set.contains(0));
        assertTrue(set.contains(5));
        assertFalse(set.contains(7));
    }

}