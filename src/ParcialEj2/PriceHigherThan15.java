package ParcialEj2;

/**
 * Created by Tomas on 23-Sep-16.
 */
public class PriceHigherThan15 extends Filter {
    @Override
    public boolean filterThis(Drink drink, double price) {
        return price>15;
    }
}
