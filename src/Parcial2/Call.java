package Parcial2;

import java.util.Calendar;

public class Call {

    private PhoneNumber recipient;
    private PhoneNumber caller;
    private Calendar date;
    private int duration;
    private CallType type;

    public Call(PhoneNumber recipient, PhoneNumber caller, Calendar date, int duration) {
        this.recipient = recipient;
        this.caller = caller;
        this.date = date;
        this.duration = duration;
        if(caller.getCountryCode() != recipient.getCountryCode()) type = CallType.INTERNATIONAL;
        else if(caller.getAreaCode() != recipient.getAreaCode()) type = CallType.NATIONAL;
        else type = CallType.LOCAL;
    }

    public PhoneNumber getRecipient() {
        return recipient;
    }

    public PhoneNumber getCaller() {
        return caller;
    }

    public Calendar getDate() {
        return date;
    }

    public int getDuration() {
        return duration;
    }

    public CallType getType() {
        return type;
    }



}
