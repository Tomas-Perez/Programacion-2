package TP4.Sube;

/**
 * Created by Toto on 01-Sep-16.
 */
public abstract class Sube {

    public abstract void carge(float amount);
    public abstract void withdraw(float amount);
    public abstract float getBalance();
    public abstract void setOverdrawAmount(float overdrawAmount);
}
