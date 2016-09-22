package TP4.Bank;

/**
 * Created by Toto on 31-Aug-16.
 */
public class CheckingAccount extends BankAccount {
    private String name;
    private float balance;
    private int cbu;
    private float overdrawAmount;

    public CheckingAccount(String name, float balance, int cbu, float overdrawAmount) {
        this.name = name;
        this.balance = balance;
        this.cbu = cbu;
        this.overdrawAmount = overdrawAmount;
    }

    @Override
    public boolean withdraw(float amount) {
        if(amount<=balance+overdrawAmount) {
            return super.withdraw(amount);
        }
        return false;
    }
}
