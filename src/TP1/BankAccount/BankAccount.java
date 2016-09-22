package TP1.BankAccount;

/**
 * Created by Tomas on 8/5/2016.
 */
public class BankAccount {
    private String name;
    private float balance;
    private int cbu;

    public BankAccount(String name, float balance, int cbu) {
        this.name = name;
        this.balance = balance;
        this.cbu = cbu;
    }

    public BankAccount() {
    }

    public void deposit(float amount){
        if(amount>0)
            balance += amount;
        else
            System.out.println("Ingrese una cantidad positiva");
    }

    public void withdraw(float amount){
        if (amount > 0) {
            balance -= amount;
        } else {
            System.out.println("Ingrese una cantidad positiva");
        }
    }

    public float getBalance() {
        return balance;
    }
    public int getCbu() {
        return cbu;
    }

    public boolean equals(BankAccount account){
        return (name.equals(account.name)&&balance==account.balance&&cbu==account.cbu);
    }
}
