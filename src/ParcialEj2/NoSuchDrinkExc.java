package ParcialEj2;

/**
 * Created by Tomas on 23-Sep-16.
 */
public class NoSuchDrinkExc extends RuntimeException {
    public NoSuchDrinkExc(String drinkName) {
        super(drinkName + " no esta en el aqui");
    }
}
