package Recuperatorio;

public class OutOfBoundsExc extends RuntimeException {
    public OutOfBoundsExc() {
        super("Posicion invalida");
    }
}
