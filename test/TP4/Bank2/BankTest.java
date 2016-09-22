package TP4.Bank2;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Toto on 01-Sep-16.
 */
public class BankTest {
    Bank bank = new Bank();
    CheckingAccount account = new CheckingAccount("toto", 1000, 500005, 200);
    SavingsAccount account2 = new SavingsAccount("toto", 1000, 123456, 30);
    SpecialAccount account3 = new SpecialAccount("toto", 1000, 800085);


    @Test
    public void transfer() throws Exception {
        bank.newAccount(account);
        bank.newAccount(account2);
        bank.newAccount(account3);
        bank.transfer(500, 500005, 123456);
        assertEquals(500, account.getBalance(),0.1);
        assertEquals(1500, account2.getBalance(),0.1);
    }

    @Test
    public void depositCheck() throws Exception {
        bank.newAccount(account);
        bank.newAccount(account2);
        bank.newAccount(account3);
        Check check = account.issueCheck(500);
        bank.depositCheck(check, 123456);
        assertEquals(500, account.getBalance(),0.1);
        assertEquals(1500, account2.getBalance(),0.1);
        assertFalse(bank.depositCheck(check, 123456));
        assertEquals(500, account.getBalance(),0.1);
        assertEquals(1500, account2.getBalance(),0.1);
    }



}