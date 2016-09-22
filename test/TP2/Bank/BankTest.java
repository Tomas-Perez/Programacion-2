package TP2.Bank;

import TP1.BankAccount.BankAccount;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Toto on 12-Aug-16.
 */
public class BankTest {
    @Test
    public void transfer() throws Exception {
        Bank frances = new Bank();
        BankAccount toto = new BankAccount("toto", 1000, 202365);
        BankAccount juanga = new BankAccount("juanga", 0, 105364);
        frances.newAccount(toto);
        frances.newAccount(juanga);
        frances.Transfer(1000, 202365, 105364);
        assertEquals(1000, juanga.getBalance(), 0.1);
        assertEquals(0, toto.getBalance(), 0.1);
    }
}