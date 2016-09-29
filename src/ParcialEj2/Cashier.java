package ParcialEj2;

import java.util.HashMap;

/**
 * Created by Tomas on 23-Sep-16.
 */
public class Cashier {

    private Catalogue catalogue;

    public Cashier(Catalogue catalogue) {
        this.catalogue = catalogue;
    }

    public Invoice checkout(DrinkCart cart){
        HashMap<Drink, Double> checkedDrinks = new HashMap<>();
        double total = 0;
        for (Drink drink: cart.getDrinks()) {
            boolean drinkInCatalogue;
            try{
                drinkInCatalogue = catalogue.isDrinkCatalogued(drink);
            }
            catch (UncataloguedDrinkExc e){
                System.out.println(e.getMessage() + " sera ignorada");
                drinkInCatalogue = false;
            }
            if(drinkInCatalogue)
                checkedDrinks.put(drink, getDrinkPrice(drink));
                total += getDrinkPrice(drink);
        }
        return new Invoice(checkedDrinks, total);
    }

    public double getDrinkPrice(Drink drink){
        boolean drinkInCatalogue;
        try{
            drinkInCatalogue = catalogue.isDrinkCatalogued(drink);
        }
        catch (UncataloguedDrinkExc e){
            System.out.println(e.getMessage());
            drinkInCatalogue = false;
        }
        if(drinkInCatalogue)
            return catalogue.getDrinkPrice(drink);

        else return 0;
    }
}