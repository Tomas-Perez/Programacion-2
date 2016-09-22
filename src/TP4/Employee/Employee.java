package TP4.Employee;

/**
 * Created by Toto on 01-Sep-16.
 */
public class Employee {
    protected int salary;
    protected String name;

    public Employee(int salary, String name) {
        this.salary = salary;
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }
}
