package Parcial1Universidad;

public class Employee extends Person {

    private String job;

    public Employee(String job) {
        super();
        this.job = job;
    }

    @Override
    public boolean enter(Building building) {
        return building.containsJob(job);
    }
}
