package TP1.Interval;

import TP5.Criteria.Criteria;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Toto on 11-Aug-16.
 */
public class Interval {
    private ArrayList<Integer> interval = new ArrayList<>();
    private int first;
    private int last;
    private int gap;

    public Interval(int first, int last, int gap){
        this.first = first;
        this.last = last;
        this.gap = gap;
        for(int number = first; number<last; number += gap){
            interval.add(number);
        }
    }

    public int getFirst() {
        return first;
    }

    public int getLast() {
        return last;
    }

    public int getGap() {
        return gap;
    }

    public int at(int i){
        return interval.get(i);
    }

    public boolean equals(Interval interval2){
        return interval2.getFirst() == first &&
                interval2.getLast() == last &&
                interval2.getGap() == gap;
    }

    public double findFirst(Criteria evaluator){
        for (int number: interval) {
            if(evaluator.evaluate(number))
                return number;
        }
        return -1;
    }

    public ArrayList<Integer> findAll(Criteria evaluator){
        ArrayList<Integer> sortedList = new ArrayList<>();
        for (int number: interval) {
            if(evaluator.evaluate(number))
                sortedList.add(number);
        }
        return sortedList;
    }
}
