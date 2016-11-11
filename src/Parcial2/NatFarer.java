package Parcial2;

import java.util.HashMap;

public class NatFarer extends Farer {

    public NatFarer(HashMap<CallType, Float> catalogue) {
        super(catalogue, CallType.NATIONAL);
    }
}
