package Parcial1Universidad;

import java.util.ArrayList;


public class Student extends Person {

    private ArrayList<String> classes = new ArrayList<>();

    public Student(){
        super();
    }

    public boolean enter(Building building) {
        for (String aClass: classes) {
            if(building.containsClass(aClass)) return true;
        }
        return false;
    }
}
