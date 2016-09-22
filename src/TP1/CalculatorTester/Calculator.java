package TP1.CalculatorTester;

/**
 * Created by Tomas on 8/5/2016.
 */
public class Calculator {
    public int evaluate(String expression) {
        int sum = 0;
        for (String summand: expression.split("\\+"))
            sum += Integer.valueOf(summand);
        return sum;
    }

    public int multiply(int factorA, int factorB){
        return factorA*factorB;
    }
}
