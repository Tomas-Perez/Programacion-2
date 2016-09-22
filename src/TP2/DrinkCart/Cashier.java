package TP2.DrinkCart;

/**
 * Created by Toto on 17-Aug-16.
 */
public class Cashier {
    private String name;

    public Cashier(String name) {
        this.name = name;
    }

    public Invoice Checkout(DrinkCart cart){
        double total = 0;
        Drink[] drinks = cart.getDrinks();
        for(int i = 0; i<drinks.length; i++) if (drinks[i] !=null) total += drinks[i].getPrice();
        return new Invoice(drinks,total);
    }

    public String getName() {
        return name;
    }
}
