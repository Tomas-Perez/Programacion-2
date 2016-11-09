package Parcial2;

public class Call {

    private PhoneNumber recipient;
    private PhoneNumber caller;
    private String date;
    private int duration;

    public Call(PhoneNumber recipient, PhoneNumber caller, String date, int duration) {
        this.recipient = recipient;
        this.caller = caller;
        this.date = date;
        this.duration = duration;
    }

    public PhoneNumber getRecipient() {
        return recipient;
    }

    public PhoneNumber getCaller() {
        return caller;
    }

    public String getDate() {
        return date;
    }

    public int getDuration() {
        return duration;
    }
}
