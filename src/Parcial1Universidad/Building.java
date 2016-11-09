package Parcial1Universidad;

import java.util.ArrayList;

public class Building {

    private ArrayList<String> jobs = new ArrayList<>();
    private ArrayList<String> classes = new ArrayList<>();

    public boolean containsJob(String job){
        return jobs.contains(job);
    }

    public boolean containsClass(String aClass){
        return classes.contains(aClass);
    }
}
