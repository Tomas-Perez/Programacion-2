package TP4.Bank2;

/**
 * Created by Toto on 31-Aug-16.
 */
public abstract class BankAccount {

    public abstract boolean deposit(float amount);
    public abstract boolean withdraw(float amount);
    public abstract float getBalance();
    public abstract int getCbu();
    public abstract String getName();
    public abstract boolean equals(BankAccount account);
    public abstract Check issueCheck(float amount);

}
