package TP8.LazyFibonacci;

import java.util.HashMap;

public class LazyFibonacci {

    private HashMap<Integer, Integer> values = new HashMap<>();

    public int calculate(int n){
        if(values.containsKey(n)) return values.get(n);
        else if(n <= 1) return 1;
        else {
            int newValue = calculate(n - 1) + calculate(n - 2);
            values.put(n, newValue);
            return newValue;
        }
    }
}
