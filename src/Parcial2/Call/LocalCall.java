package Parcial2.Call;

import java.util.Calendar;

public class LocalCall extends Call{

    public LocalCall(CallInProgress callInProgress, Calendar end) {
        super(callInProgress.getCaller(), callInProgress.getRecipient(), callInProgress.getStart(), end);
    }

    @Override
    public double getPricePerMinute() {
        return 0.1;
    }

    @Override
    public int compareTo(Call o) {
        return 1;
    }
}
