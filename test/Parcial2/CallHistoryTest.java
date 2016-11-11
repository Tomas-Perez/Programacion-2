package Parcial2;

import Parcial2.Comparators.CallCostComparator;
import Parcial2.Comparators.CallDurationComparator;
import Parcial2.Comparators.CallTypeComparator;
import org.junit.Test;

import java.util.Calendar;
import java.util.HashMap;

import static org.junit.Assert.*;

public class CallHistoryTest {

    CallHistory callHistory = new CallHistory();
    PhoneNumber lujan = new PhoneNumber(023, 2646, 51368);
    PhoneNumber pilar = new PhoneNumber(023, 2620, 51368);
    PhoneNumber bolivia = new PhoneNumber(000, 2620, 51368);
    PhoneNumber lujan1 = new PhoneNumber(023, 2646, 55618);

    @Test
    public void getCalls() throws Exception {
        Calendar april20 = Calendar.getInstance();
        april20.set(2016, Calendar.APRIL, 20);

        Calendar december25 = Calendar.getInstance();
        december25.set(2016, Calendar.DECEMBER, 25);

        Calendar may1 = Calendar.getInstance();
        may1.set(2016, Calendar.MAY, 1);

        Call localCallApril = new Call(lujan, lujan1, april20, 102);
        Call natCallDec = new Call(lujan, pilar, december25, 260);
        Call intCallMay = new Call(lujan, bolivia, may1, 150);

        callHistory.addCall(localCallApril);
        callHistory.addCall(natCallDec);
        callHistory.addCall(intCallMay);

        Calendar march = Calendar.getInstance();
        march.set(2016, Calendar.MARCH, 1);

        Calendar november = Calendar.getInstance();
        november.set(2016, Calendar.NOVEMBER, 2);

        Calendar january = Calendar.getInstance();
        january.set(2017, Calendar.JANUARY, 1);

        CallHistory callsMarchNov = callHistory.getCalls(march, november);
        assertEquals(2, callsMarchNov.getCalls().size());
        assertTrue(callsMarchNov.getCalls().get(0) == localCallApril);
        assertTrue(callsMarchNov.getCalls().get(1) == intCallMay);

        CallHistory callsNovJan = callHistory.getCalls(november, january);
        assertEquals(1, callsNovJan.getCalls().size());
        assertTrue(callsNovJan.getCalls().get(0) == natCallDec);
    }

    @Test
    public void sortPrice() throws Exception {
        Calendar april20 = Calendar.getInstance();
        april20.set(2016, Calendar.APRIL, 20);

        Calendar december25 = Calendar.getInstance();
        december25.set(2016, Calendar.DECEMBER, 25);

        Calendar may1 = Calendar.getInstance();
        may1.set(2016, Calendar.MAY, 1);

        Call localCallApril = new Call(lujan, lujan1, april20, 102);
        Call natCallDec = new Call(lujan, pilar, december25, 260);
        Call intCallMay = new Call(lujan, bolivia, may1, 150);

        callHistory.addCall(natCallDec);
        callHistory.addCall(localCallApril);
        callHistory.addCall(intCallMay);

        HashMap<CallType, Float> catalogue = new HashMap<>();
        catalogue.put(CallType.INTERNATIONAL, 1f);
        catalogue.put(CallType.NATIONAL, 0.5f);
        catalogue.put(CallType.LOCAL, 0.1f);

        callHistory.sort(new CallCostComparator(catalogue));

        assertTrue(callHistory.getCalls().get(0) == localCallApril);
        assertTrue(callHistory.getCalls().get(1) == natCallDec);
        assertTrue(callHistory.getCalls().get(2) == intCallMay);
    }

    @Test
    public void sortDuration() throws Exception {
        Calendar april20 = Calendar.getInstance();
        april20.set(2016, Calendar.APRIL, 20);

        Calendar december25 = Calendar.getInstance();
        december25.set(2016, Calendar.DECEMBER, 25);

        Calendar may1 = Calendar.getInstance();
        may1.set(2016, Calendar.MAY, 1);

        Call localCallApril = new Call(lujan, lujan1, april20, 102);
        Call natCallDec = new Call(lujan, pilar, december25, 260);
        Call intCallMay = new Call(lujan, bolivia, may1, 150);

        callHistory.addCall(natCallDec);
        callHistory.addCall(localCallApril);
        callHistory.addCall(intCallMay);

        HashMap<CallType, Float> catalogue = new HashMap<>();
        catalogue.put(CallType.INTERNATIONAL, 1f);
        catalogue.put(CallType.NATIONAL, 0.5f);
        catalogue.put(CallType.LOCAL, 0.1f);

        callHistory.sort(new CallDurationComparator());

        assertTrue(callHistory.getCalls().get(0) == localCallApril);
        assertTrue(callHistory.getCalls().get(1) == intCallMay);
        assertTrue(callHistory.getCalls().get(2) == natCallDec);
    }

    @Test
    public void sortType() throws Exception {
        Calendar april20 = Calendar.getInstance();
        april20.set(2016, Calendar.APRIL, 20);

        Calendar december25 = Calendar.getInstance();
        december25.set(2016, Calendar.DECEMBER, 25);

        Calendar may1 = Calendar.getInstance();
        may1.set(2016, Calendar.MAY, 1);

        Call localCallApril = new Call(lujan, lujan1, april20, 102);
        Call natCallDec = new Call(lujan, pilar, december25, 260);
        Call intCallMay = new Call(lujan, bolivia, may1, 150);

        callHistory.addCall(natCallDec);
        callHistory.addCall(localCallApril);
        callHistory.addCall(intCallMay);

        HashMap<CallType, Float> catalogue = new HashMap<>();
        catalogue.put(CallType.INTERNATIONAL, 1f);
        catalogue.put(CallType.NATIONAL, 0.5f);
        catalogue.put(CallType.LOCAL, 0.1f);

        callHistory.sort(new CallTypeComparator());

        assertTrue(callHistory.getCalls().get(0) == localCallApril);
        assertTrue(callHistory.getCalls().get(1) == natCallDec);
        assertTrue(callHistory.getCalls().get(2) == intCallMay);
    }
}