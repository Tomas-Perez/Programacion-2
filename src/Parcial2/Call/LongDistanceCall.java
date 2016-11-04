package Parcial2.Call;

import java.util.Calendar;

public class LongDistanceCall extends Call{

    public LongDistanceCall(CallInProgress callInProgress, Calendar end) {
        super(callInProgress.getCaller(), callInProgress.getRecipient(), callInProgress.getStart(), end);
    }

    @Override
    public double getPricePerMinute() {
        return 0.5;
    }

    @Override
    public int compareTo(Call o) {
        return 0;
    }
}
