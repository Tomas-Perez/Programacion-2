package Parcial2;

import java.util.HashMap;

public abstract class Farer {

    private HashMap<CallType, Float> catalogue;
    private CallType type;

    public Farer(HashMap<CallType, Float> catalogue, CallType type) {
        this.catalogue = catalogue;
        this.type = type;
    }

    public static float generalFare(HashMap<CallType, Float> catalogue, Call aCall){
        IntFarer intFarer = new IntFarer(catalogue);
        NatFarer natFarer = new NatFarer(catalogue);
        LocalFarer localFarer = new LocalFarer(catalogue);
        if(intFarer.canFare(aCall)) return intFarer.fare(aCall);
        else if(natFarer.canFare(aCall)) return natFarer.fare(aCall);
        else return localFarer.fare(aCall);
    }

    public float fare(Call aCall){
        return (catalogue.get(type)*aCall.getDuration());
    }

    public boolean canFare(Call aCall){
        return type == aCall.getType();
    }

}
