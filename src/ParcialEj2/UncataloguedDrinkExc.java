package ParcialEj2;

/**
 * Created by Toto on 29-Sep-16.
 */
public class UncataloguedDrinkExc extends RuntimeException {
    public UncataloguedDrinkExc(String drinkName) {
        super(drinkName + " no esta en el catalogo");
    }
}
