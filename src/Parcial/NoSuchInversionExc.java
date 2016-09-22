package Parcial;

/**
 * Created by Tomas on 16-Sep-16.
 */
public class NoSuchInversionExc extends RuntimeException {
    public NoSuchInversionExc() {
        super("La inversion no existe");
    }
}
