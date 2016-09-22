package TP4.HTML;

import java.util.ArrayList;

/**
 * Created by Toto on 02-Sep-16.
 */
public abstract class Tag implements Stringable{
    protected String tagCode;
    protected String properties;
    protected ArrayList<Stringable> Content = new ArrayList<>();

    public Tag(String tagCode, String properties) {
        this.tagCode = tagCode;
        this.properties = properties;
    }

    public String toString(){
        String result = "<" + tagCode + " " + properties + ">\n";
        for (Stringable singleStringable: Content) {
            result += singleStringable.toString() + "\n";
        }
        result += "</" + tagCode + ">";
        return result;
    }

    public void addElement(Stringable singleStringable){
        Content.add(singleStringable);
    }
}
