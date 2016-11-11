package Parcial2;

import org.junit.Test;

import java.util.Calendar;
import java.util.HashMap;

import static org.junit.Assert.*;

public class FarerTest {

    @Test
    public void generalFare() throws Exception {
        HashMap<CallType, Float> catalogue = new HashMap<>();
        catalogue.put(CallType.INTERNATIONAL, 1f);
        catalogue.put(CallType.NATIONAL, 0.5f);
        catalogue.put(CallType.LOCAL, 0.1f);

        PhoneNumber lujan = new PhoneNumber(023, 2646, 51368);
        PhoneNumber pilar = new PhoneNumber(023, 2620, 51368);
        PhoneNumber bolivia = new PhoneNumber(000, 2620, 51368);
        PhoneNumber lujan1 = new PhoneNumber(023, 2646, 55618);

        Call localCall = new Call(lujan, lujan1, Calendar.getInstance(), 102);
        Call natCall = new Call(lujan, pilar, Calendar.getInstance(), 102);
        Call intCall = new Call(lujan, bolivia, Calendar.getInstance(), 102);

        assertEquals(10.2, Farer.generalFare(catalogue, localCall), 0.1);
        assertEquals(51, Farer.generalFare(catalogue, natCall), 0.1);
        assertEquals(102, Farer.generalFare(catalogue, intCall), 0.1);
    }

}