package TP7.Stack;

import org.junit.Test;

import static org.junit.Assert.*;

public class StackListTest {



    StackList<Integer> stackList = new StackList<>();

    @Test
    public void pop() throws Exception {
        stackList.push(5);
        stackList.push(8);
        stackList.push(0);
        assertTrue(0 == stackList.pop());
        assertTrue(8 == stackList.pop());
        assertTrue(5 == stackList.pop());
    }

    @Test
    public void isEmpty() throws Exception {
        assertTrue(stackList.isEmpty());
        stackList.push(5);
        assertFalse(stackList.isEmpty());
    }

    @Test
    public void sort() throws Exception {
        stackList.push(5);
        stackList.push(8);
        stackList.push(-2);
        stackList.push(0);
        stackList.push(27);
        stackList.push(-2);
        stackList.sort(new IntegerAscendingComparator());
        assertTrue(new Integer(-2).equals(stackList.pop()));
        assertTrue(new Integer(-2).equals(stackList.pop()));
        assertTrue(new Integer(0).equals(stackList.pop()));
        assertTrue(new Integer(5).equals(stackList.pop()));
        assertTrue(new Integer(8).equals(stackList.pop()));
        assertTrue(new Integer(27).equals(stackList.pop()));
    }

    @Test
    public void isSorted() throws Exception {
        stackList.push(5);
        stackList.push(8);
        stackList.push(-2);
        stackList.push(0);
        stackList.push(27);
        stackList.push(-2);
        assertFalse(stackList.isSorted(new IntegerAscendingComparator()));
        stackList.sort(new IntegerAscendingComparator());
        assertTrue(stackList.isSorted(new IntegerAscendingComparator()));
    }

    @Test
    public void sort1() throws Exception {
        stackList.push(5);
        stackList.push(8);
        stackList.push(-2);
        stackList.push(0);
        stackList.push(27);
        stackList.push(-2);
        stackList.sort();
        assertTrue(new Integer(-2).equals(stackList.pop()));
        assertTrue(new Integer(-2).equals(stackList.pop()));
        assertTrue(new Integer(0).equals(stackList.pop()));
        assertTrue(new Integer(5).equals(stackList.pop()));
        assertTrue(new Integer(8).equals(stackList.pop()));
        assertTrue(new Integer(27).equals(stackList.pop()));
    }

    @Test
    public void isSorted1() throws Exception {
        stackList.push(5);
        stackList.push(8);
        stackList.push(-2);
        stackList.push(0);
        stackList.push(27);
        stackList.push(-2);
        assertFalse(stackList.isSorted());
        stackList.sort();
        assertTrue(stackList.isSorted());
    }

    @Test
    public void iterate() throws Exception{
        stackList.push(5);
        stackList.push(8);
        stackList.push(-2);
        stackList.push(0);
        stackList.push(27);
        stackList.push(-2);
        for (int i: stackList) {
            System.out.println(i);
        }
        stackList.sort();
        for (int i: stackList) {
            System.out.println(i);
        }
    }
}