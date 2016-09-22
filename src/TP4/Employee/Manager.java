package TP4.Employee;

/**
 * Created by Toto on 01-Sep-16.
 */
public class Manager extends Employee {
    private Employee[] employees;
    private int $employees;

    public Manager(int salary, String name){
        super(salary, name);
        employees = new Employee[10];
    }

    public void addEmployee(Employee employee){
        if($employees == employees.length){
            Employee[] employeesAux = new Employee[$employees*2];
            for (int i = 0; i<$employees; i++) {
                employeesAux[i] = employees[i];
            }
            employees = employeesAux;
        }
        employees[++$employees] = employee;
        updateSalary();
    }

    private void updateSalary(){
        super.salary += employees[$employees].getSalary()*(0.01);
    }
}
