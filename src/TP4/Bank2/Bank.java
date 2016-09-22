package TP4.Bank2;

/**
 * Created by Toto on 31-Aug-16.
 */
public class Bank {
    private BankAccount[] BankAccounts;

    public Bank(){
        BankAccounts = new BankAccount[10];
    }

    public boolean transfer(float amount, int senderCBU, int receiverCBU){
        for (int i = 0; i<BankAccounts.length; i++){
            if (senderCBU == BankAccounts[i].getCbu()){
                for (int j = 0; i<BankAccounts.length; j++){
                    if (BankAccounts[j] != null &&
                        receiverCBU == BankAccounts[j].getCbu() &&
                        BankAccounts[i].withdraw(amount)) {
                        return BankAccounts[j].deposit(amount);
                    }
                }
            }
        }
        return false;
    }

    public boolean depositCheck(Check check, int receiverCBU){
        if(!check.isUsed()) {
            if (transfer(check.getAmount(), check.getIssuerCbu(), receiverCBU)){
                check.useCheck();
                return true;
            }
        }
        return false;
    }

    public int newAccount(BankAccount account){
        for (int i = 0; i<BankAccounts.length; i++){
            if(BankAccounts[i] == null){
                BankAccounts[i] = account;
                return i;
            }
        }

        BankAccount[] newAccounts = new BankAccount[BankAccounts.length*2];

        for (int i = 0; i<BankAccounts.length; i++){
            newAccounts[i] = BankAccounts[i];
        }

        BankAccounts = newAccounts;
        return newAccount(account);
    }
}
