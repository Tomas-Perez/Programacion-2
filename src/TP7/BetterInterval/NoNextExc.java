package TP7.BetterInterval;

public class NoNextExc extends RuntimeException {
    public NoNextExc() {
        super("There're no more values on this list");
    }
}
