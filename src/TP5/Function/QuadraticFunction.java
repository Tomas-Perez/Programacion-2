package TP5.Function;

/**
 * Created by Toto on 15-Sep-16.
 */
public class QuadraticFunction implements Function {
    private double a2;
    private double a1;
    private double a0;

    public QuadraticFunction(double a2, double a1, double a0) {
        this.a2 = a2;
        this.a1 = a1;
        this.a0 = a0;
    }

    public double getA2() {
        return a2;
    }

    public double getA1() {
        return a1;
    }

    public double getA0() {
        return a0;
    }

    public double evaluate(double value) {
        return (a2*value*value)+(a1*value)+a0;
    }
}
