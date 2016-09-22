package TP2.DrinkCart;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Toto on 18-Aug-16.
 */
public class InvoiceTest {
    @Test
    public void getTotal() throws Exception {
        DrinkCart cart = new DrinkCart(5);
        Drink drink = new Drink("coke", 500);
        Drink drink1 = new Drink("coke", 500);
        Drink drink2 = new Drink("sprite", 500);
        cart.AddDrink(drink);
        cart.AddDrink(drink1);
        cart.AddDrink(drink2);
        Invoice invoice = new Invoice(cart.getDrinks(), 30);
        assertEquals(30, invoice.getTotal(), 0.1);
    }

}