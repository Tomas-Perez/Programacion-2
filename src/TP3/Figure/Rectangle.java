package TP3.Figure;

import TP1.Point2D.Point2D;
import TP2.Triangle.Segment;

/**
 * Created by Toto on 19-Aug-16.
 */
public class Rectangle extends Figure {
    private Segment base;
    private Segment height;

    public Rectangle(Segment base, Segment height) {
        this.base = base;
        this.height = height;
    }

    public double getBase() {
        return base.howLong();
    }

    public double getHeight() {
        return height.howLong();
    }

    public double getDiagonal(){
        return Math.sqrt(Math.pow(getBase(),2)+Math.pow(getHeight(),2));
    }

    @Override
    public double getArea(){
        return getBase()*getHeight();
    }

    @Override
    public double getPerimeter(){
        return 2*(getHeight()+getBase());
    }
}
