package TP4.Sube;

/**
 * Created by Toto on 01-Sep-16.
 */
public class StandartSube extends Sube{
    private float balance;
    private float overdrawAmount = 10;

    public void carge(float amount){
        balance += amount;
    }


    public void withdraw(float amount){
        if(amount<=balance+overdrawAmount)
            balance -= amount;
    }

    public float getBalance(){
        return balance;
    }

    public void setOverdrawAmount(float overdrawAmount) {
        this.overdrawAmount = overdrawAmount;
    }
}
