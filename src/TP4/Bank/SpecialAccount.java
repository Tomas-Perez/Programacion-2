package TP4.Bank;

/**
 * Created by Toto on 31-Aug-16.
 */
public class SpecialAccount extends BankAccount {
    private String name;
    private float balance;
    private int cbu;
    private int points;

    @Override
    public boolean deposit(float amount) {
        if(super.deposit(amount)) {
            points += 5;
            return true;
        }
        return false;
    }

    @Override
    public boolean withdraw(float amount) {
        if(amount<=balance) {
            if (super.withdraw(amount)) {
                points += 5;
                return true;
            }
        }
        return false;
    }

    public int getPoints() {
        return points;
    }
}
