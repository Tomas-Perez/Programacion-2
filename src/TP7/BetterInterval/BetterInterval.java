package TP7.BetterInterval;

import java.util.ArrayList;
import java.util.Iterator;

public class BetterInterval implements Iterable<Integer>{
    private ArrayList<Integer> interval;

    public IntervalIterator iterator() {
        return new IntervalIterator(this);
    }

    public BetterInterval(int first, int last, int gap){
        interval = new ArrayList<>();
        for(int i = first; i<last; i+=gap){
            interval.add(i);
        }
    }

    public int first(){
        return interval.get(0);
    }

    public int last(){
        return interval.get(interval.size()-1);
    }

    public int at(int index){
        return interval.get(index);
    }

    public int size(){
        return interval.size();
    }

    public int remove(int index){
        return interval.remove(index);
    }
}
