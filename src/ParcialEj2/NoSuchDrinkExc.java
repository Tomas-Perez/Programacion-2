package ParcialEj2;

/**
 * Created by Tomas on 23-Sep-16.
 */
public class NoSuchDrinkExc extends RuntimeException {
    public NoSuchDrinkExc() {
        super("Esta bebida no esta aqui");
    }
}
