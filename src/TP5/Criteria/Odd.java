package TP5.Criteria;

/**
 * Created by Toto on 15-Sep-16.
 */
public class Odd extends Criteria{

    public boolean evaluate(int i) {
        return i%2 != 0;
    }
}
