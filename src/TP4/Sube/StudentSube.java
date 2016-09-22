package TP4.Sube;

/**
 * Created by Toto on 01-Sep-16.
 */
public class StudentSube extends Sube {
    private float balance;
    private float ridesLeft = 2;
    private float overdrawAmount = 10;

    public void carge(float amount){
        balance += amount;
    }


    public void withdraw(float amount){
        if(ridesLeft!=0 && amount*0.2<=balance+overdrawAmount) {
            balance -= amount * 0.2;
            ridesLeft--;
            return;
        }

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
