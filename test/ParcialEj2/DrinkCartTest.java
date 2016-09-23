package ParcialEj2;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Tomas on 23-Sep-16.
 */
public class DrinkCartTest {
    DrinkCart drinkCart = new DrinkCart();
    Coke coke = new Coke(500);

    @Test
    public void addDrink() throws Exception {
        assertTrue(drinkCart.getDrinks().isEmpty());
        drinkCart.addDrink(coke);
        assertFalse(drinkCart.getDrinks().isEmpty());
    }

    @Test
    public void removeDrink() throws Exception {
        drinkCart.addDrink(coke);
        assertFalse(drinkCart.getDrinks().isEmpty());
        drinkCart.removeDrink(coke);
        assertTrue(drinkCart.getDrinks().isEmpty());
    }

    @Test
    public void removeDrinkExc() throws Exception{

    }

    @Test
    public void getDrinks() throws Exception {

    }

}