package TP4.Bank;

/**
 * Created by Toto on 31-Aug-16.
 */
public class SavingsAccount extends BankAccount {
    private String name;
    private float balance;
    private int cbu;
    private int freeMovementsLeft;

    public SavingsAccount(String name, float balance, int cbu, int freeMovementsLeft) {
        this.name = name;
        this.balance = balance;
        this.cbu = cbu;
        this.freeMovementsLeft = freeMovementsLeft;
    }

    @Override
    public boolean deposit(float amount) {
        if(super.deposit(amount)) {
            if (freeMovementsLeft > 0)
                freeMovementsLeft--;
            else balance--;
            return true;
        }
        return false;
    }

    @Override
    public boolean withdraw(float amount) {
        if(amount <= balance) {
            if (super.withdraw(amount)) {
                if (freeMovementsLeft > 0)
                    freeMovementsLeft--;
                else balance--;
                return true;
            }
        }
        return false;
    }

}
