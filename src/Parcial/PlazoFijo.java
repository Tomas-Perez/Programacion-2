package Parcial;

/**
 * Created by Tomas on 16-Sep-16.
 */
public abstract class PlazoFijo {
    private int interest;

    public PlazoFijo(int interest){
        this.interest = interest;
    }

    public int getInterest() {
        return interest;
    }
}
