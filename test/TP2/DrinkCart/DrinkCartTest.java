package TP2.DrinkCart;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Toto on 18-Aug-16.
 */
public class DrinkCartTest {
    @Test
    public void addDrink() throws Exception {
        DrinkCart cart = new DrinkCart(5);
        Drink drink = new Drink("coke", 500);
        assertEquals(1, cart.AddDrink(drink));
        assertEquals(2, cart.AddDrink(drink));
        assertEquals(3, cart.AddDrink(drink));
        assertEquals(4, cart.AddDrink(drink));
        assertEquals(5, cart.AddDrink(drink));
        assertEquals(-1, cart.AddDrink(drink));
        assertEquals(true, cart.getDrinks()[0].equals(drink));
    }

    @Test
    public void removeDrink() throws Exception {
        DrinkCart cart = new DrinkCart(5);
        Drink drink = new Drink("coke", 500);
        cart.AddDrink(drink);
        assertEquals(0, cart.RemoveDrink(drink));
        assertEquals(-1, cart.RemoveDrink(drink));
        assertEquals(-1, cart.RemoveDrink(drink));
    }

    @Test
    public void getDrinks() throws Exception {
        DrinkCart cart = new DrinkCart(5);
        Drink drink = new Drink("coke", 500);
        Drink drink1 = new Drink("coke", 500);
        Drink drink2 = new Drink("sprite", 500);
        cart.AddDrink(drink);
        cart.AddDrink(drink1);
        cart.AddDrink(drink2);
        assertEquals(true, cart.getDrinks()[0].equals(drink));
        assertEquals(true, cart.getDrinks()[1].equals(drink));
        assertEquals(false, cart.getDrinks()[2].equals(drink));
        assertEquals(true, cart.getDrinks()[2].equals(drink2));
    }

    @Test
    public void getDrinksAmount() throws Exception {
        DrinkCart cart = new DrinkCart(5);
        Drink drink = new Drink("coke", 500);
        Drink drink1 = new Drink("coke", 500);
        Drink drink2 = new Drink("sprite", 500);
        cart.AddDrink(drink);
        cart.AddDrink(drink1);
        cart.AddDrink(drink2);
        assertEquals(3, cart.getDrinksAmount());
    }

}