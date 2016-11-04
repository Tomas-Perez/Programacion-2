package Parcial2.Call;

import Parcial2.PhoneNumber;

import java.util.Calendar;

public class InternationalCall extends Call{

    public InternationalCall(CallInProgress callInProgress, Calendar end) {
        super(callInProgress.getCaller(), callInProgress.getRecipient(), callInProgress.getStart(), end);
    }

    @Override
    public double getPricePerMinute() {
        return 1;
    }

    @Override
    public int compareTo(Call o) {
        return 0;
    }
}
