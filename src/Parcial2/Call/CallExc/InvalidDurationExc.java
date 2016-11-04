package Parcial2.Call.CallExc;

public class InvalidDurationExc extends RuntimeException{
    public InvalidDurationExc() {
        super("Duración de llamada invalida");
    }
}
