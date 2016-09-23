package ParcialEj2;

/**
 * Created by Tomas on 23-Sep-16.
 */
public class BiggerThan2Litres extends Filter {
    @Override
    public boolean filterThis(Drink drink, double price) {
        return drink.getSizeInMl()>2000;
    }
}
