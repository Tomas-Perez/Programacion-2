package TP4.Bank2;

/**
 * Created by Toto on 31-Aug-16.
 */
public class SpecialAccount extends BankAccount {
    private String name;
    private float balance;
    private int cbu;
    private int points;

    public SpecialAccount(String name, float balance, int cbu) {
        this.name = name;
        this.balance = balance;
        this.cbu = cbu;
    }

    public boolean deposit(float amount){
        if(amount>0) {
            balance += amount;
            points+=5;
            return true;
        }
        return false;
    }

    public boolean withdraw(float amount) {
        if(amount <= balance && amount > 0){
            balance -= amount;
            points += 5;
            return true;
        }
        return false;
    }

    public int getPoints() {
        return points;
    }

    public float getBalance() {
        return balance;
    }
    public int getCbu() {
        return cbu;
    }
    public String getName() {return name;}

    public boolean equals(BankAccount account){
        return (name.equals(account.getName())&&balance==account.getBalance()&&cbu==account.getCbu());
    }

    public Check issueCheck(float amount){
        return new Check(amount, cbu);
    }
}
