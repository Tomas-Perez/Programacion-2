package TP1.BankAccount;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Tomas on 8/5/2016.
 */
public class BankAccountTest {
    @Test
    public void deposit() throws Exception {
        BankAccount account = new BankAccount("toto", 0, 202156);
        account.deposit(500);
        assertEquals(500, account.getBalance(), 0.1);
    }

    @Test
    public void withdraw() throws Exception {
        BankAccount account = new BankAccount("toto", 1000, 202156);
        account.withdraw(500);
        assertEquals(500, account.getBalance(), 0.1);
    }

    @Test
    public void getBalance() throws Exception {
        BankAccount account = new BankAccount("toto", 1000, 202156);
        assertEquals(1000, account.getBalance(), 0.1);
    }

    @Test
    public void getCbu() throws Exception {
        BankAccount account = new BankAccount("toto", 1000, 202156);
        assertEquals(202156, account.getCbu(), 0.1);
    }

}