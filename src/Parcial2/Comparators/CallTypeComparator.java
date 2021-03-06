package Parcial2.Comparators;

import Parcial2.Call;

import java.util.Comparator;

public class CallTypeComparator implements Comparator<Call>{

    @Override
    public int compare(Call o1, Call o2) {
        return o1.getType().compareTo(o2.getType());
    }

}
