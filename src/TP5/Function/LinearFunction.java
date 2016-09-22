package TP5.Function;

/**
 * Created by Toto on 15-Sep-16.
 */
public class LinearFunction implements Function {
    private double a1;
    private double a0;

    public LinearFunction(double a1, double a0) {
        this.a1 = a1;
        this.a0 = a0;
    }

    public double getA1() {
        return a1;
    }

    public double getA0() {
        return a0;
    }

    public double evaluate(double value) {
        return (a1*value)+a0;
    }
}
