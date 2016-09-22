package TP3.Figure;

import TP2.Triangle.Segment;

/**
 * Created by Toto on 19-Aug-16.
 */
public class Ellipse extends Figure {
    private Segment radius1;
    private Segment radius2;

    public Ellipse(Segment radius1, Segment radius2) {
        this.radius1 = radius1;
        this.radius2 = radius2;
    }

    public double getRadius1() {
        return radius1.howLong();
    }

    public double getRadius2() {
        return radius2.howLong();
    }

    @Override
    public double getArea(){
        return Math.PI*getRadius1()*getRadius2();
    }

    @Override
    public double getPerimeter(){
        return 2*Math.PI*Math.sqrt((Math.pow(getRadius1(),2)+Math.pow(getRadius2(),2))/2);
    }
}
