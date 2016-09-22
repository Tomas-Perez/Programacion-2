package TP4.Bank;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Toto on 31-Aug-16.
 */
public class CheckingAccountTest {



    @Test
    public void withdraw() throws Exception {
        CheckingAccount account = new CheckingAccount("toto", 1000, 500005, 200);
        assertTrue(account.withdraw(1200));
        assertFalse(account.withdraw(1200));
    }

    @Test
    public void deposit() throws Exception {

    }

    @Test
    public void getBalance() throws Exception {
        CheckingAccount account = new CheckingAccount("toto", 1000, 500005, 200);
        assertEquals(1000, account.getBalance(),0.1);
    }

    @Test
    public void getCbu() throws Exception {

    }

    @Test
    public void getName() throws Exception {

    }

    @Test
    public void equals() throws Exception {

    }

    @Test
    public void issueCheck() throws Exception {

    }

}