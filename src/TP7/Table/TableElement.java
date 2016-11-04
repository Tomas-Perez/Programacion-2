package TP7.Table;

/**
 * Created by Tomas on 07-Oct-16.
 */
public class TableElement <KeyA, KeyB, Value> {
    private KeyA keyA;
    private KeyB keyB;
    private Value value;

    public TableElement(KeyA keyA, KeyB keyB, Value value) {
        this.keyA = keyA;
        this.keyB = keyB;
        this.value = value;
    }

    public KeyA getKeyA() {
        return keyA;
    }

    public KeyB getKeyB() {
        return keyB;
    }

    public Value getValue() {
        return value;
    }

    public boolean sameKeyAs(TableElement <KeyA, KeyB, Value> element){
        return element.getKeyA().equals(keyA) && element.getKeyB().equals(keyB);
    }

    public boolean sameKey(KeyA givenKeyA, KeyB givenKeyB){
        return givenKeyA.equals(keyA) && givenKeyB.equals(keyB);
    }
}
