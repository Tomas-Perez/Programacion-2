package TP8.LazyFibonacci;

import org.junit.Test;

import static org.junit.Assert.*;

public class LazyFibonacciTest {

    @Test
    public void calculate() throws Exception {
        LazyFibonacci lazyFibonacci = new LazyFibonacci();
        for(int i = 0; i<8; i++){
            System.out.println(lazyFibonacci.calculate(i));
        }
        System.out.println(lazyFibonacci.calculate(5));
    }

}