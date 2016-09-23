package ParcialEj2;

import java.util.HashMap;

/**
 * Created by Tomas on 23-Sep-16.
 */
public class Invoice {
    private HashMap<Drink, Double> drinks = new HashMap<>();
    private double total;

    public void setTotal(double total) {
        this.total = total;
    }

    public void addDrink(Drink drink, double value){
        drinks.put(drink, value);
    }

    public void removeDrink(Drink drink){
        drinks.remove(drink);
    }

    public double getTotal() {
        return total;
    }

    public HashMap<Drink, Double> getDrinks() {
        return drinks;
    }

    public double getDrinkPrice(Drink drink){
        if (drinks.containsKey(drink)) {
            return drinks.get(drink);
        }
        throw new NoSuchDrinkExc();
    }
}
