package Parcial2;

import java.util.HashMap;

public class LocalFarer extends Farer {

    public LocalFarer(HashMap<CallType, Float> catalogue) {
        super(catalogue, CallType.LOCAL);
    }
}
