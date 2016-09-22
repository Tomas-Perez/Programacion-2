package TP4.Employee;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Toto on 01-Sep-16.
 */
public class ManagerTest {
    Employee tato = new Employee(1000, "tato");
    Employee tito = new Employee(1000, "tito");
    Manager tuto = new Manager(1000, "tuto");

    @Test
    public void addEmployee() throws Exception {
        tuto.addEmployee(tato);
        tuto.addEmployee(tito);
        assertEquals(1020, tuto.getSalary());
    }
}