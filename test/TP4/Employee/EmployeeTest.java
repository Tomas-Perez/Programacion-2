package TP4.Employee;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Toto on 01-Sep-16.
 */
public class EmployeeTest {
    Employee tato = new Employee(1000, "tato");
    Employee tito = new Employee(1000, "tito");

    @Test
    public void getSalary() throws Exception {
        assertEquals(1000,tato.getSalary());
    }

    @Test
    public void getName() throws Exception {
        assertTrue(tato.getName().equals("tato"));
    }

}