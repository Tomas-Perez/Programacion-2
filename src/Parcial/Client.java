package Parcial;

/**
 * Created by Tomas on 16-Sep-16.
 */
public class Client {
    private Portfolio portfolio = new Portfolio();
    private double funds;

    public Client(double funds) {
        this.funds = funds;
    }

    public double getFunds() {
        return funds;
    }

    public void invest(double investment, FixedTerm fixedTerm){
        if(investment<=funds) {
            Inversion inversion = new Inversion(investment, fixedTerm);
            portfolio.addInversion(inversion);
            funds -= investment;
        }
        else throw new NoMoneyExc();
    }

    public void withdrawInvestment(Inversion inversion){
        try{
            funds += portfolio.withdrawInversion(inversion);
        }

        catch (NoSuchInversionExc e){
            System.out.println(e.getMessage());
        }
    }

    public double getProjectedFunds(int daysAfterDeposit){
        return portfolio.getProjectedFunds(daysAfterDeposit) + funds;
    }

    public Portfolio getPortfolio() {
        return portfolio;
    }
}
