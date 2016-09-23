package ParcialEj2;

/**
 * Created by Tomas on 23-Sep-16.
 */
public class NameLongerThan5 extends Filter {
    @Override
    public boolean filterThis(Drink drink, double price) {
        return drink.getType().length()>5;
    }
}
