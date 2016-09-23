package Parcial;

/**
 * Created by Tomas on 16-Sep-16.
 */
public class Inversion {
    private FixedTerm fixedTerm;
    private double funds;

    public Inversion(double funds, FixedTerm fixedTerm) {
        this.funds = funds;
        this.fixedTerm = fixedTerm;
    }

    public FixedTerm getFixedTerm() {
        return fixedTerm;
    }

    public double getFunds() {
        return funds;
    }

}
