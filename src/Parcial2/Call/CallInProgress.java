package Parcial2.Call;

import Parcial2.PhoneNumber;

import java.util.Calendar;

public class CallInProgress extends Call {

    public CallInProgress(PhoneNumber caller, PhoneNumber recipient, Calendar start) {
        super(caller, recipient, start);
    }

    public Call endCall(){
        if(getCaller().getCountryCode() != getRecipient().getCountryCode()) return new InternationalCall(this, Calendar.getInstance());
        else if(getCaller().getAreaCode() != getRecipient().getAreaCode()) return new LongDistanceCall(this, Calendar.getInstance());
        else return new LocalCall(this, Calendar.getInstance());
    }


}
