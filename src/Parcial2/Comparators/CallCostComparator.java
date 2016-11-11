package Parcial2.Comparators;

import Parcial2.Call;
import Parcial2.CallType;
import Parcial2.Farer;

import java.util.Comparator;
import java.util.HashMap;

public class CallCostComparator implements Comparator<Call> {

    private HashMap<CallType, Float> catalogue;

    public CallCostComparator(HashMap<CallType, Float> catalogue) {
        this.catalogue = catalogue;
    }

    @Override
    public int compare(Call o1, Call o2) {
        return (int) (Farer.generalFare(catalogue, o1) - Farer.generalFare(catalogue, o2));
    }
}
