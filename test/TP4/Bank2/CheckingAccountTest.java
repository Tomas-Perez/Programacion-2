package TP4.Bank2;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Toto on 01-Sep-16.
 */
public class CheckingAccountTest {
    @Test
    public void deposit() throws Exception {
        CheckingAccount account = new CheckingAccount("toto", 1000, 500005, 200);
        assertTrue(account.withdraw(1100));
        assertEquals(-100, account.getBalance(),0.1);
        assertTrue(account.deposit(100));
        assertEquals(0, account.getBalance(),0.1);
        assertTrue(account.deposit(500));
        assertEquals(500, account.getBalance(),0.1);
    }

    @Test
    public void withdraw() throws Exception {
        CheckingAccount account = new CheckingAccount("toto", 1000, 500005, 200);
        assertTrue(account.withdraw(1100));
        assertEquals(-100, account.getBalance(),0.1);
        assertTrue(account.withdraw(100));
        assertEquals(-200, account.getBalance(),0.1);
        assertFalse(account.withdraw(100));
    }

    @Test
    public void getCbu() throws Exception {
        CheckingAccount account = new CheckingAccount("toto", 1000, 500005, 200);
        assertEquals(500005, account.getCbu());
    }

    @Test
    public void getName() throws Exception {
        CheckingAccount account = new CheckingAccount("toto", 1000, 500005, 200);
        assertTrue(account.getName().equals("toto"));
    }

    @Test
    public void equals() throws Exception {
        CheckingAccount account = new CheckingAccount("toto", 1000, 500005, 200);
        CheckingAccount account2 = new CheckingAccount("toto", 1000, 500005, 200);
        CheckingAccount account3 = new CheckingAccount("toto", 1000, 500004, 200);
        assertTrue(account.equals(account2));
        assertFalse(account.equals(account3));
    }

    @Test
    public void issueCheck() throws Exception {
        CheckingAccount account = new CheckingAccount("toto", 1000, 500005, 200);
        Check check = account.issueCheck(500);
        assertEquals(500005, check.getIssuerCbu());

    }

}