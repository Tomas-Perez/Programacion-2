package TP3.Heritage;

/**
 * Created by Tomas on 19-Aug-16.
 */
public class A {
    public int m1(){
        return this.m3();
    }
    public int m2(){
        return 10;
    }
    public int m3(){
        return 3;
    }
    public int m4(){
        return this.m4();
    }
}
