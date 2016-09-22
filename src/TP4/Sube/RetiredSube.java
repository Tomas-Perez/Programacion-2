package TP4.Sube;

/**
 * Created by Toto on 01-Sep-16.
 */
public class RetiredSube extends Sube {
    private float balance;
    private float overdrawAmount = 10;

    public void carge(float amount){
        balance += amount;
    }


    public void withdraw(float amount){
        if(amount*0.8<=balance+overdrawAmount)
            balance -= amount*0.8;
    }

    public float getBalance(){
        return balance;
    }

    public void setOverdrawAmount(float overdrawAmount) {
        this.overdrawAmount = overdrawAmount;
    }
}
