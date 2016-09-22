package TP3.Heritage;

/**
 * Created by Tomas on 19-Aug-16.
 */
public class C extends B {
    @Override
    public int m1(){
        return super.m1()+1;
    }

    @Override
    public int m2(){
        return this.m6();
    }

    public int m6(){
        return 3;
    }
}
