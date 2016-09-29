package ParcialEj2;

/**
 * Created by Tomas on 23-Sep-16.
 */
public class Drink {
    private double sizeInMl;
    private String type;

    public Drink(double sizeInMl, String type) {
        this.sizeInMl = sizeInMl;
        this.type = type;
    }

    public double getSizeInMl() {
        return sizeInMl;
    }

    public String getType() {
        return type;
    }
}
