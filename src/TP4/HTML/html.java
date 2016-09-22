package TP4.HTML;

/**
 * Created by Toto on 02-Sep-16.
 */
public class html extends Tag {
    private Head head;
    private Body body;


    public html(String properties, Head head, Body body) {
        super("html", properties);
        this.head = head;
        this.body = body;
        Content.add(head);
        Content.add(body);
    }

    public html(Head head, Body body) {
        super("html", "");
        this.head = head;
        this.body = body;
        Content.add(head);
        Content.add(body);
    }

    public Head getHead() {
        return head;
    }

    public Body getBody() {
        return body;
    }

    @Override
    public String toString() {
        return "<!DOCTYPE html>\n" + super.toString();
    }
}
