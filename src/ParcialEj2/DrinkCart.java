package ParcialEj2;

import java.util.ArrayList;

/**
 * Created by Tomas on 23-Sep-16.
 */
public class DrinkCart {
    private ArrayList<Drink> drinks =  new ArrayList<Drink>();

    public void addDrink(Drink drink){
        drinks.add(drink);
    }

    public void removeDrink(Drink drink){
        for (Drink cartDrink: drinks) {
            if(cartDrink == drink) {
                drinks.remove(cartDrink);
                return;
            }
        }
        throw new NoSuchDrinkExc(drink.getType());
    }

    public ArrayList<Drink> getDrinks() {
        return drinks;
    }
}
