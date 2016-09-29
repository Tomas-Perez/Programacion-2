package ParcialEj2;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Toto on 29-Sep-16.
 */
public class CashierTest {
    Catalogue catalogue = new Catalogue();
    Drink coke = new Drink(500, "coke");
    Drink wine = new Drink(1500, "wine");
    Drink sprite = new Drink(750, "sprite");
    DrinkCart drinkCart = new DrinkCart();


    @Test
    public void checkout() throws Exception {
        catalogue.catalogueDrink(coke, 15);
        catalogue.catalogueDrink(wine, 50);
        catalogue.catalogueDrink(sprite, 20);
        Cashier cashier = new Cashier(catalogue);
        drinkCart.addDrink(coke);
        drinkCart.addDrink(coke);
        drinkCart.addDrink(coke);
        drinkCart.addDrink(sprite);
        drinkCart.addDrink(sprite);
        drinkCart.addDrink(wine);
        Invoice invoice = cashier.checkout(drinkCart);
        assertEquals(135, invoice.getTotal(), 0.1);
    }

    @Test
    public void checkoutExcs() throws Exception {
        Cashier cashier = new Cashier(catalogue);
        drinkCart.addDrink(coke);
        drinkCart.addDrink(coke);
        drinkCart.addDrink(coke);
        drinkCart.addDrink(sprite);
        drinkCart.addDrink(sprite);
        drinkCart.addDrink(wine);
        Invoice invoice = cashier.checkout(drinkCart);
        assertEquals(0, invoice.getTotal(), 0.1);
    }

    @Test
    public void getDrinkPrice() throws Exception {
        catalogue.catalogueDrink(coke, 15);
        catalogue.catalogueDrink(wine, 50);
        catalogue.catalogueDrink(sprite, 20);
        Cashier cashier = new Cashier(catalogue);
        assertEquals(15, cashier.getDrinkPrice(coke), 0.1);
        assertEquals(50, cashier.getDrinkPrice(wine), 0.1);
        assertEquals(20, cashier.getDrinkPrice(sprite), 0.1);
    }

    @Test
    public void getDrinkPriceExcs() throws Exception {
        Cashier cashier = new Cashier(catalogue);
        assertEquals(0, cashier.getDrinkPrice(coke), 0.1);
        assertEquals(0, cashier.getDrinkPrice(wine), 0.1);
        assertEquals(0, cashier.getDrinkPrice(sprite), 0.1);
    }

}