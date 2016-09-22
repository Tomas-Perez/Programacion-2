package TP2.DrinkCart;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Toto on 18-Aug-16.
 */
public class DrinkTest {
    @Test
    public void getType() throws Exception {
        Drink drink = new Drink("coke", 500);
        assertEquals("coke", drink.getType());
    }

    @Test
    public void getPrice() throws Exception {
        Drink drink = new Drink("coke", 500);
        assertEquals(10, drink.getPrice(),0.1);
    }

    @Test
    public void getSize() throws Exception {
        Drink drink = new Drink("coke", 500);
        assertEquals(500, drink.getSize(),0.1);
    }

    @Test
    public void equals() throws Exception {
        Drink drink = new Drink("coke", 500);
        Drink drink1 = new Drink("coke", 500);
        assertEquals(true, drink.equals(drink1));

        Drink drink2 = new Drink("sprite", 500);
        assertEquals(false, drink2.equals(drink1));
    }

}