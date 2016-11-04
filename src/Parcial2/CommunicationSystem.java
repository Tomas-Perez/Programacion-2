package Parcial2;

import Parcial2.Call.Call;
import Parcial2.Call.CallInProgress;

import java.util.ArrayList;
import java.util.Calendar;

public class CommunicationSystem {
    private ArrayList<PhoneNumber> phoneGuide;
    private ArrayList<CallInProgress> activeCalls;
    private ArrayList<Call> callHistory;

    public CommunicationSystem() {
        phoneGuide = new ArrayList<>();
    }
    
    public void call(PhoneNumber caller, PhoneNumber recipient){
        activeCalls.add(new CallInProgress(caller, recipient, Calendar.getInstance()));
    }

    public void endCall(PhoneNumber caller){
        for (CallInProgress callInProgress: activeCalls) {
            if(callInProgress.getCaller() == caller){
                callHistory.add(callInProgress.endCall());
            }
        }
    }

    private double calculateCallDuration(){
    }
}
