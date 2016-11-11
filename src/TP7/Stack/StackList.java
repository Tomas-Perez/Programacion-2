package TP7.Stack;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

public class StackList<T extends Comparable> implements Stack<T>, Iterable<T> {

    private ArrayList<T> stack = new ArrayList<>();

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private int index = stack.size()-1;

            @Override
            public boolean hasNext() {
                return -1 != index;
            }

            @Override
            public T next() {
                if(hasNext()) return stack.get(index--);
                else throw new IndexOutOfBoundsException();
            }
        };
    }

    @Override
    public void push(T element) {
        stack.add(element);
    }

    @Override
    public T pop() {
        return stack.remove(stack.size()-1);
    }

    @Override
    public boolean isEmpty() {
        return stack.size() == 0;
    }

    public void sort(){
        for(int i = 0; i<stack.size(); i++){
            for (int j = i+1; j<stack.size(); j++){
                int compareValue = stack.get(i).compareTo(stack.get(j));
                if(compareValue < 0){
                    T temp = stack.get(i);
                    stack.set(i, stack.get(j));
                    stack.set(j, temp);
                }
            }
        }
    }

    public boolean isSorted(){
        for(int i = 0; i<stack.size(); i++){
            for (int j = i+1; j<stack.size(); j++){
                int compareValue = stack.get(i).compareTo(stack.get(j));
                if(compareValue < 0) return false;
            }
        }
        return true;
    }


    public void sort(Comparator<T> comparator){
        for(int i = 0; i<stack.size(); i++){
            for (int j = i+1; j<stack.size(); j++){
                int compareValue = comparator.compare(stack.get(i), stack.get(j));
                if(compareValue < 0){
                    T temp = stack.get(i);
                    stack.set(i, stack.get(j));
                    stack.set(j, temp);
                }
            }
        }
    }

    public boolean isSorted(Comparator<T> comparator){
        for(int i = 0; i<stack.size(); i++) {
            for (int j = i + 1; j < stack.size(); j++) {
                if(comparator.compare(stack.get(i), stack.get(j)) < 0) return false;
            }
        }
        return true;
    }
}
