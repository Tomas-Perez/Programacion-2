package TP4.HTML;

/**
 * Created by Toto on 02-Sep-16.
 */
public class HtmlString implements Stringable{
    private String string;

    public HtmlString(String string) {
        this.string = string;
    }

    public String toString() {
        return string;
    }
}
