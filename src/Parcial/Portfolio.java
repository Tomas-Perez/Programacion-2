package Parcial;

import java.util.ArrayList;

/**
 * Created by Tomas on 16-Sep-16.
 */
public class Portfolio {
    private ArrayList<Inversion> inversiones = new ArrayList<Inversion>();

    public void addInversion(Inversion inversion){
        inversiones.add(inversion);
    }

    public double withdrawInversion(Inversion inversionToWithdraw){
        for (Inversion inversion : inversiones) {
            if(inversion == inversionToWithdraw){
                inversiones.remove(inversion);
                return inversion.getFunds();
            }
        }
        throw new NoSuchInversionExc();
    }

    public double getProyectedFunds(int daysAfterDeposit){
        double rentabilidadTotal = 0;
        for (Inversion inversion: inversiones) {
            rentabilidadTotal += inversion.getRentabilidad();
        }
        return rentabilidadTotal*(daysAfterDeposit/365);
    }


}
