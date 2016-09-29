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

    public boolean isDrinkCatalogued(Drink drink){
        if(catalogue.containsKey(drink))
            return true;
        throw new UncataloguedDrinkExc(drink.getType());
    }

    public double getDrinkPrice(Drink drink){
        isDrinkCatalogued(drink);
        return catalogue.get(drink);
    }

    public HashMap<Drink, Double> filter(Filter filter){
        HashMap<Drink, Double> filteredCatalogue = new HashMap<>();
        for (HashMap.Entry<Drink, Double> element: catalogue.entrySet()){
            if(filter.filterThis(element.getKey(), element.getValue())){
                filteredCatalogue.put(element.getKey(), element.getValue());
            }
        }
        return filteredCatalogue;
    }
}
