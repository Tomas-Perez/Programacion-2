package TP2.DrinkCart;

/**
 * Created by Toto on 17-Aug-16.
 */
public class Invoice {
    private Drink[] drinks;
    private double total;

    public Invoice(Drink[] drinks, double total){
        this.drinks = drinks;
        this.total = total;
    }

    public String toString(){
        String result = "";

        for(int i = 0; i<drinks.length; i++){
            if (drinks[i] != null) result += drinks[i].toString() + "/n";
            result += "Total : " + total;
        }

        return result;
    }

    public double getTotal() {
        return total;
    }
}
