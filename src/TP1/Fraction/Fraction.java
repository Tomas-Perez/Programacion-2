package TP1.Fraction;

/**
 * Created by Toto on 11-Aug-16.
 */
public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
        simplify();
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public Fraction add(Fraction fraction){
        int commonDen = denominator*fraction.denominator;
        numerator = (commonDen/denominator)*numerator + (commonDen/fraction.denominator)*fraction.numerator;
        denominator = commonDen;
        simplify();
        return this;
    }

    public Fraction sub(Fraction fraction){
        int commonDen = denominator*fraction.denominator;
        numerator = (commonDen/denominator)*numerator - (commonDen/fraction.denominator)*fraction.numerator;
        denominator = commonDen;
        simplify();
        return this;
    }

    public Fraction add(int interger){
        numerator += interger*denominator;
        simplify();
        return this;
    }

    public Fraction multiply(Fraction fraction){
        numerator = numerator*fraction.numerator;
        denominator = denominator*fraction.denominator;
        simplify();
        return this;
    }

    public Fraction division(Fraction fraction){
        numerator = numerator*fraction.denominator;
        denominator = denominator*fraction.numerator;
        simplify();
        return this;
    }

    public float asFloat(){
        return (float)numerator/denominator;
    }

    public boolean equals(Fraction fraction){
        return (numerator == fraction.numerator && denominator == fraction.denominator);
    }

    private int mcm(int numA, int numB){
        if (numB == 0) return numA;
        return mcm(numB, numA%numB);
    }

    private void simplify(){
        int mcm = mcm(numerator, denominator);
        numerator = numerator/mcm;
        denominator = denominator/mcm;
    }

}
