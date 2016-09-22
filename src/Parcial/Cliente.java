package Parcial;

/**
 * Created by Tomas on 16-Sep-16.
 */
public class Cliente {
    Portfolio portfolio = new Portfolio();
    double funds;

    public Cliente(double funds) {
        this.funds = funds;
    }

    public double getFunds() {
        return funds;
    }

    public void invest(double investment, PlazoFijo plazoFijo){
        if(investment<funds) {
            Inversion inversion = new Inversion(investment, plazoFijo);
            portfolio.addInversion(inversion);
            funds -= investment;
        }

        throw new NoMoneyExc();
    }

    public void withdrawInvestment(Inversion inversion){
        try{
        funds += portfolio.withdrawInversion(inversion);
        }

        catch (NoSuchInversionExc e){
            System.out.println(e.getMessage());
        }
    }

    public double getProyectedFunds(int daysAfterDeposit){
        return portfolio.getProyectedFunds(daysAfterDeposit) + funds;
    }
}
