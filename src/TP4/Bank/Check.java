package TP4.Bank;

/**
 * Created by Toto on 31-Aug-16.
 */
public class Check {
    private float amount;
    private int issuerCbu;
    private boolean used = false;

    public Check(float amount, int issuerCbu) {
        this.amount = amount;
        this.issuerCbu = issuerCbu;
    }

    public float getAmount() {
        return amount;
    }

    public int getIssuerCbu() {
        return issuerCbu;
    }

    public void useCheck(){
        used = true;
    }

    public boolean isUsed(){
        return used;
    }
}
