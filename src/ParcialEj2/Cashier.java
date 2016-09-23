package ParcialEj2;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Tomas on 23-Sep-16.
 */
public class Cashier {

    public Invoice checkout(DrinkCart cart, Catalogue catalogue){
        Invoice invoice = new Invoice();
        HashMap<Drink, Double> drinkPrices = catalogue.getCatalogue();
        double total = 0;
        for (Drink drink: cart.getDrinks()) {
            if(drinkPrices.containsKey(drink))
                invoice.getDrinks().put(drink, drinkPrices.get(drink));
                total += getDrinkPrice(drink, catalogue);
        }
        invoice.setTotal(total);
        return invoice;
    }

    public double getDrinkPrice(Drink drink, Catalogue catalogue){
        if(catalogue.getCatalogue().containsKey(drink))
            return catalogue.getCatalogue().get(drink);

        throw new NoSuchDrinkExc();
    }
}