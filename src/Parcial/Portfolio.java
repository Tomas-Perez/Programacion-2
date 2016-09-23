package Parcial;

import java.util.ArrayList;

/**
 * Created by Tomas on 16-Sep-16.
 */
public class Portfolio {
    private ArrayList<Inversion> inversions = new ArrayList<Inversion>();

    public void addInversion(Inversion inversion){
        inversions.add(inversion);
    }

    public double withdrawInversion(Inversion inversionToWithdraw){
        for (Inversion inversion : inversions) {
            if(inversion == inversionToWithdraw){
                inversions.remove(inversion);
                return inversion.getFunds();
            }
        }
        throw new NoSuchInversionExc();
    }

    public double getRentability(Inversion anInversion){
        for(Inversion inversion: inversions){
            if(inversion == anInversion){
                double funds = inversion.getFunds();
                int interest = inversion.getFixedTerm().getInterest();
                return funds*(interest/100);
            }
        }
        throw new NoSuchInversionExc();
    }

    public double getProjectedFunds(int daysAfterDeposit) {
        double projectedFunds = 0;
        for (Inversion inversion : inversions) {
            projectedFunds += getRentability(inversion) * (daysAfterDeposit / 365);
            projectedFunds += inversion.getFunds();
        }
        return projectedFunds;
    }
}
