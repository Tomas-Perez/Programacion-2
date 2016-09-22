package TP4.HTML;

/**
 * Created by Toto on 02-Sep-16.
 */
public class List extends Tag {

    public List(String properties) {
        super("ul", properties);
    }

    public List() {
        super("ul", "");
    }

    public void addElement(Stringable singleStringable){
        ListElement element = new ListElement();
        element.addElement(singleStringable);
        Content.add(element);
    }
}
