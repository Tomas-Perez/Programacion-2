package TP1.Point2D;

/**
 * Created by Toto on 11-Aug-16.
 */
public class Point2D {
    private double x;
    private double y;

    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getDistance(Point2D point){
        double x2 = point.getX();
        double y2 = point.getY();

        return Math.sqrt(Math.pow((x-x2),2)+Math.pow((y-y2),2));
    }

    public Point2D add(Point2D point){
        x += point.getX();
        y += point.getY();

        return this;
    }

    public boolean equals(Point2D point){
        return x==point.x && y==point.y;
    }
}
