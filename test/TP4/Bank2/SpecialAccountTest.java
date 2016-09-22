package TP4.Bank2;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Toto on 01-Sep-16.
 */
public class SpecialAccountTest {
    @Test
    public void deposit() throws Exception {
        SpecialAccount account = new SpecialAccount("toto", 1000, 500005);
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
        SpecialAccount account = new SpecialAccount("toto", 1000, 500005);
        assertTrue(account.withdraw(600));
        assertEquals(400, account.getBalance(),0.1);
        assertTrue(account.withdraw(100));
        assertEquals(300, account.getBalance(),0.1);
        assertFalse(account.withdraw(720));
    }

    @Test
    public void getCbu() throws Exception {
        SpecialAccount account = new SpecialAccount("toto", 1000, 500005);
        assertEquals(500005, account.getCbu());
    }

    @Test
    public void getName() throws Exception {
        SpecialAccount account = new SpecialAccount("toto", 1000, 500005);
        assertTrue(account.getName().equals("toto"));
    }

    @Test
    public void equals() throws Exception {
        SpecialAccount account = new SpecialAccount("toto", 1000, 500005);
        SpecialAccount account2 = new SpecialAccount("toto", 1000, 500005);
        SpecialAccount account3 = new SpecialAccount("toto", 1000, 500006);
        assertTrue(account.equals(account2));
        assertFalse(account.equals(account3));
    }

    @Test
    public void issueCheck() throws Exception {
        SpecialAccount account = new SpecialAccount("toto", 1000, 500005);
        Check check = account.issueCheck(500);
        assertEquals(500005, check.getIssuerCbu());

    }

    @Test
    public void getPoints() throws Exception {
        SpecialAccount account = new SpecialAccount("toto", 1000, 500005);
        account.deposit(100);
        account.deposit(100);
        account.deposit(100);
        account.deposit(100);
        account.deposit(100);
        account.deposit(100);
        assertEquals(30, account.getPoints(),0.1);
    }

}