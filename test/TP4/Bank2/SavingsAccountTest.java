package TP4.Bank2;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Toto on 01-Sep-16.
 */
public class SavingsAccountTest {
    @Test
    public void deposit() throws Exception {
        SavingsAccount account = new SavingsAccount("toto", 1000, 500005, 30);
        assertFalse(account.withdraw(1100));
        assertTrue(account.withdraw(1000));
        assertEquals(0, account.getBalance(),0.1);
        assertTrue(account.deposit(100));
        assertEquals(100, account.getBalance(),0.1);
        assertTrue(account.deposit(500));
        assertEquals(600, account.getBalance(),0.1);
    }

    @Test
    public void withdraw() throws Exception {
        SavingsAccount account = new SavingsAccount("toto", 1000, 500005, 30);
        assertTrue(account.withdraw(600));
        assertEquals(400, account.getBalance(),0.1);
        assertTrue(account.withdraw(100));
        assertEquals(300, account.getBalance(),0.1);
        assertFalse(account.withdraw(720));
    }

    @Test
    public void getCbu() throws Exception {
        SavingsAccount account = new SavingsAccount("toto", 1000, 500005, 30);
        assertEquals(500005, account.getCbu());
    }

    @Test
    public void getName() throws Exception {
        SavingsAccount account = new SavingsAccount("toto", 1000, 500005, 30);
        assertTrue(account.getName().equals("toto"));
    }

    @Test
    public void equals() throws Exception {
        SavingsAccount account = new SavingsAccount("toto", 1000, 500005, 30);
        SavingsAccount account2 = new SavingsAccount("toto", 1000, 500005, 30);
        SavingsAccount account3 = new SavingsAccount("toto", 1000, 500006, 30);
        assertTrue(account.equals(account2));
        assertFalse(account.equals(account3));
    }

    @Test
    public void issueCheck() throws Exception {
        SavingsAccount account = new SavingsAccount("toto", 1000, 500005, 30);
        Check check = account.issueCheck(500);
        assertEquals(500005, check.getIssuerCbu());

    }

    @Test
    public void getFreeMovementsLeft() throws Exception {
        SavingsAccount account = new SavingsAccount("toto", 1000, 500005, 3);
        account.withdraw(100);
        account.withdraw(100);
        account.withdraw(100);
        assertEquals(0, account.getFreeMovementsLeft());
        account.withdraw(100);
        assertEquals(599, account.getBalance(),0.1);
        account.deposit(1);
        account.deposit(1);
        account.deposit(1);
        account.deposit(1);
        account.deposit(1);
        account.deposit(1);
        account.deposit(1);
        account.deposit(1);
        assertEquals(599, account.getBalance(),0.1);
    }
}