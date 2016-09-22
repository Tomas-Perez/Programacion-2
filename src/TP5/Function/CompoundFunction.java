package TP5.Function;

/**
 * Created by Toto on 15-Sep-16.
 */
public class CompoundFunction implements Function {
    private Function outerFunction;
    private Function insideFunction;

    public CompoundFunction(Function outerFunction, Function insideFunction) {
        this.outerFunction = outerFunction;
        this.insideFunction = insideFunction;
    }

    public Function getOuterFunction() {
        return outerFunction;
    }

    public Function getInsideFunction() {
        return insideFunction;
    }

    public double evaluate(double value) {
        return outerFunction.evaluate(insideFunction.evaluate(value));
    }
}
