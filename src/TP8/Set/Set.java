package TP8.Set;

import java.util.HashMap;
import java.util.Iterator;

public class Set<T> implements Iterable<T>{

    private HashMap<Integer, T> set = new HashMap<>();
    private int index = 0;

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private int itIndex = 0;

            @Override
            public boolean hasNext() {
                return itIndex != index;
            }

            @Override
            public T next() {
                if(hasNext()) return set.get(itIndex++);
                throw new IndexOutOfBoundsException();
            }
        };
    }

    public void add(T element){
        if(!set.containsValue(element)) set.put(index++, element);
    }

    public boolean contains(T element){
        return set.containsValue(element);
    }
}
