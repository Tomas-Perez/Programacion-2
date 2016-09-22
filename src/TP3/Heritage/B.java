package TP3.Heritage;

/**
 * Created by Tomas on 19-Aug-16.
 */
public class B extends A{
    @Override
    public int m1(){
        return 8;
    }

    @Override
    public int m2(){
        return super.m2();
    }

    @Override
    public int m4(){
        return 20;
    }

    public int m5(){
        return this.m5();
    }

    public int m7(){
        return super.m4();
    }

}
