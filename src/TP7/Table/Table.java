package TP7.Table;

import java.util.ArrayList;
import java.util.NoSuchElementException;

/**
 * Created by Tomas on 07-Oct-16.
 */
public class Table <KeyA, KeyB, Value> {
    private ArrayList<TableElement<KeyA, KeyB, Value>> tableElements = new ArrayList<>();

    public void add(KeyA newKeyA, KeyB newKeyB, Value newValue){
        TableElement<KeyA, KeyB, Value> newElement = new TableElement<KeyA, KeyB, Value>(newKeyA, newKeyB, newValue);
        for (int i = 0; i<tableElements.size(); i++) {
            if(tableElements.get(i).sameKeyAs(newElement)) return;
        }
        tableElements.add(newElement);
    }

    public void remove(KeyA givenKeyA, KeyB givenKeyB){
        for (int i = 0; i<tableElements.size(); i++) {
            if(tableElements.get(i).sameKey(givenKeyA, givenKeyB)) tableElements.remove(i);
        }

        throw new NoSuchElementException("El elemento no existe");
    }

    public Value get(KeyA givenKeyA, KeyB givenKeyB){
        for (int i = 0; i<tableElements.size(); i++) {
            if(tableElements.get(i).sameKey(givenKeyA, givenKeyB)) return tableElements.get(i).getValue();
        }

        throw new NoSuchElementException("El elemento no existe");
    }

    public int size(){
        return tableElements.size();
    }

    public void removeDimensionA(KeyA givenKeyA){
        for(int i = tableElements.size(); i<=0; i--){
            if(tableElements.get(i).getKeyA().equals(givenKeyA)) tableElements.remove(i);
        }

    }

}
