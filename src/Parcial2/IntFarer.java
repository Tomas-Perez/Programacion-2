package Parcial2;

import java.util.HashMap;

public class IntFarer extends Farer {

    public IntFarer(HashMap<CallType, Float> catalogue) {
        super(catalogue, CallType.INTERNATIONAL);
    }
}
