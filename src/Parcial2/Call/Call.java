package Parcial2.Call;

import Parcial2.Call.CallExc.InvalidDurationExc;
import Parcial2.PhoneNumber;

import java.util.Calendar;

public abstract class Call implements Comparable<Call>{
    private PhoneNumber caller;
    private PhoneNumber recipient;
    private Calendar start;
    private Calendar end;


    public Call(PhoneNumber caller, PhoneNumber recipient, Calendar start, Calendar end) {
        this.caller = caller;
        this.recipient = recipient;
        this.start = start;
        this.end = end;
    }

    public Call(PhoneNumber caller, PhoneNumber recipient, Calendar start) {
        this.caller = caller;
        this.recipient = recipient;
        this.start = start;
    }

    public abstract double getPricePerMinute();

    public double getDurationInMinutes(){
        if(end.compareTo(start)!= -1) throw new InvalidDurationExc();
        double duration;
        duration += end.get(Calendar.YEAR) - start.get(Calendar.)
    }

    public PhoneNumber getCaller() {
        return caller;
    }

    public PhoneNumber getRecipient() {
        return recipient;
    }

    public Calendar getStart() {
        return start;
    }

    public Calendar getEnd() {
        return end;
    }

    public int compareCountryCode()
}
