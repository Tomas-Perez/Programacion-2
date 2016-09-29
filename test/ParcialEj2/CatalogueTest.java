package ParcialEj2;

import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

/**
 * Created by Toto on 29-Sep-16.
 */
public class CatalogueTest {

    Catalogue catalogue = new Catalogue();
    Drink coke = new Drink(5000, "coke");
    Drink wine = new Drink(2000, "wine");
    Drink sprite = new Drink(200, "sprite");
    BiggerThan2Litres biggerThan2Litres = new BiggerThan2Litres();
    NameLongerThan5 nameLongerThan5 = new NameLongerThan5();
    PriceHigherThan15 priceHigherThan15 = new PriceHigherThan15();

    @Test
    public void isDrinkCatalogued() throws Exception {
        catalogue.catalogueDrink(coke, 10);
        assertTrue(catalogue.isDrinkCatalogued(coke));
    }

    @Test (expected = UncataloguedDrinkExc.class)
    public void isDrinkCataloguedExc() throws Exception {
        catalogue.isDrinkCatalogued(coke);
    }

    @Test
    public void catalogueDrink() throws Exception {
        assertTrue(catalogue.getCatalogue().isEmpty());
        catalogue.catalogueDrink(coke, 10);
        catalogue.catalogueDrink(wine, 20);
        assertFalse(catalogue.getCatalogue().isEmpty());
        assertTrue(catalogue.getCatalogue().size() == 2);
    }

    @Test
    public void filter() throws Exception {
        catalogue.catalogueDrink(coke, 10);
        catalogue.catalogueDrink(wine, 20);
        catalogue.catalogueDrink(sprite, 50);
        HashMap<Drink, Double> biggerThan2LitresList = catalogue.filter(biggerThan2Litres);
        HashMap<Drink, Double> nameLongerThan5List = catalogue.filter(nameLongerThan5);
        HashMap<Drink, Double> priceHigherThan15List = catalogue.filter(priceHigherThan15);
        assertEquals(1, biggerThan2LitresList.size());
        assertTrue(biggerThan2LitresList.containsKey(coke));
        assertEquals(1, nameLongerThan5List.size());
        assertTrue(nameLongerThan5List.containsKey(sprite));
        assertEquals(2, priceHigherThan15List.size());
        assertTrue(priceHigherThan15List.containsKey(sprite));
        assertTrue(priceHigherThan15List.containsKey(wine));
    }

}