package Parcial;

/**
 * Created by Tomas on 16-Sep-16.
 */
public class Inversion {
    private PlazoFijo plazoFijo;
    private double funds;

    public Inversion(double funds, PlazoFijo plazoFijo) {
        this.funds = funds;
        this.plazoFijo = plazoFijo;
    }

    public PlazoFijo getPlazoFijo() {
        return plazoFijo;
    }

    public double getFunds() {
        return funds;
    }

}
