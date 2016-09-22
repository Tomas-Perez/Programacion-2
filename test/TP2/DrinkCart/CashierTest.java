package TP2.DrinkCart;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Toto on 18-Aug-16.
 */
public class CashierTest {
    @Test
    public void checkout() throws Exception {
        DrinkCart cart = new DrinkCart(5);
        Drink drink = new Drink("coke", 500);
        Drink drink1 = new Drink("coke", 500);
        Drink drink2 = new Drink("sprite", 500);
        cart.AddDrink(drink);
        cart.AddDrink(drink1);
        cart.AddDrink(drink2);
        Cashier roberto = new Cashier("Roberto");
        Invoice invoice = roberto.Checkout(cart);
        assertEquals(30, invoice.getTotal(), 0.1);
    }

    @Test
    public void getName() throws Exception {
        Cashier roberto = new Cashier("Roberto");
        assertEquals("Roberto", roberto.getName());
    }

}