package ParcialEj2;

import java.util.HashMap;

/**
 * Created by Tomas on 23-Sep-16.
 */
public class Catalogue {
    private HashMap<Drink, Double> catalogue = new HashMap<>();

    public void catalogueDrink(Drink drink, double price){
        catalogue.putIfAbsent(drink, price);
    }

    public HashMap<Drink, Double> getCatalogue() {
        return catalogue;
    }
}
