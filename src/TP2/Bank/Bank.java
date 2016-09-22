package TP2.Bank;

import TP1.BankAccount.BankAccount;

/**
 * Created by Toto on 12-Aug-16.
 */
public class Bank {
    private BankAccount[] BankAccounts;

    public Bank(){
        BankAccounts = new BankAccount[10];
    }

    public boolean Transfer(int amount, int senderCBU, int receiverCBU){
        for (int i = 0; i<BankAccounts.length; i++){
            if (senderCBU == BankAccounts[i].getCbu()){
                for (int j = 0; i<BankAccounts.length; j++){
                    if (BankAccounts[j] != null && receiverCBU == BankAccounts[j].getCbu()) {
                        BankAccounts[i].withdraw(amount);
                        BankAccounts[j].deposit(amount);
                        return true;
                    }
                }
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
