package TP3.Heritage;

/**
 * Created by Tomas on 19-Aug-16.
 */
public class D extends B {
    @Override
    public int m1(){
        return super.m3();
    }

    @Override
    public int m3(){
        return 2;
    }

    @Override
    public int m5(){
        return this.m4();
    }

}
