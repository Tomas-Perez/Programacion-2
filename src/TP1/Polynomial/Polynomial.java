package TP1.Polynomial;

import TP5.Function.Function;

import java.util.Arrays;

/**
 * Created by Toto on 11-Aug-16.
 */
public class Polynomial implements Function{
    public double[] polynomial;
    public int size;

    public Polynomial(int size){
        this.size = size;
        polynomial = new double[size];
    }

    public void setCoef(int a, double b){
        polynomial[a]=b;
    }

    public double evaluate(double x){
        int result = 0;
        for(int i = 0; i<polynomial.length; i++){
            result += polynomial[i]*Math.pow(x,i);
        }
        return result;
    }

    public Polynomial derivate(){
        Polynomial newPolynomial = new Polynomial(size-1);
        for(int i = 0; i<polynomial.length-1; i++){
            newPolynomial.setCoef(i, polynomial[i+1]*(i+1));
        }

        return newPolynomial;
    }

    public boolean equals(Polynomial polynomial2){
        return Arrays.equals(polynomial,polynomial2.polynomial);
    }
}
