package TP4.HTML;

/**
 * Created by Toto on 02-Sep-16.
 */
public class Link extends Tag {
    public Link(String link) {
        super("a", "href = \"" + link + "\"");
    }
}
