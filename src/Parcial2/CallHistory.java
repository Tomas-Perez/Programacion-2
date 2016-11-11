package Parcial2;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Comparator;

public class CallHistory {
    private ArrayList<Call> calls = new ArrayList<>();

    public void addCall(Call aCall){
        calls.add(aCall);
    }

    public CallHistory(ArrayList<Call> calls) {
        this.calls = calls;
    }

    public CallHistory() {
    }

    public CallHistory getCalls(Calendar from, Calendar to){
        ArrayList<Call> selectedCalls = new ArrayList<>();
        for (Call call: calls) {
            if(call.getDate().after(from) && call.getDate().before(to))
                selectedCalls.add(call);
        }
        return new CallHistory(selectedCalls);
    }

    public void sort(Comparator<Call> comparator){
        calls.sort(comparator);
    }

    public ArrayList<Call> getCalls() {
        return calls;
    }
}
