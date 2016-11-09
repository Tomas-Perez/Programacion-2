package TP7.BetterInterval;

import java.util.Iterator;

public class IntervalIterator implements Iterator<Integer> {

    private BetterInterval interval;
    private int index = 0;

    public IntervalIterator(BetterInterval interval) {
        this.interval = interval;
    }

    public boolean hasNext() {
        return index<interval.size();
    }

    public Integer next() {
        if(hasNext()) return interval.at(index++);
        throw new NoNextExc();
    }
    public void remove() {
        interval.remove(index++);
    }

}
