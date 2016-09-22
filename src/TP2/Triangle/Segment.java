package TP2.Triangle;

import TP1.Point2D.Point2D;

/**
 * Created by Toto on 12-Aug-16.
 */
public class Segment {
    private Point2D pointA;
    private Point2D pointB;

    public Segment(Point2D pointA, Point2D pointB) {
        this.pointA = pointA;
        this.pointB = pointB;
    }

    public double howLong(){
        return pointA.getDistance(pointB);
    }
}
