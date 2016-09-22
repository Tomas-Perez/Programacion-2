package Parcial;

/**
 * Created by Tomas on 16-Sep-16.
 */
public class NoMoneyExc extends RuntimeException {
    public NoMoneyExc() {
        super("No dispone de suficiente dinero para realizar esta transacción");
    }
}
