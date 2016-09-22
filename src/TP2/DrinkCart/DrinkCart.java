package TP2.DrinkCart;

/**
 * Created by Toto on 17-Aug-16.
 */
public class DrinkCart {
    private Drink[] drinks;
    private int drinksAmount;

    public DrinkCart(int size) {
        drinks = new Drink[size];
    }

    public int AddDrink(Drink drink){
        for(int i = 0; i<drinks.length; i++){
            if(drinks[i] == null){
                drinks[i] = drink;
                return ++drinksAmount;
            }
        }
        return -1;
    }

    public int RemoveDrink(Drink drink){
        for(int i = 0; i<drinks.length; i++){
            if(drinks [i] != null && drinks[i].equals(drink)){
                drinks[i] = null;
                return --drinksAmount;
            }
        }
        return -1;
    }

    public Drink[] getDrinks() {
        return drinks;
    }

    public int getDrinksAmount() {
        return drinksAmount;
    }
}
