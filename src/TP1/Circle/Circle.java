package TP1.Circle;
import TP1.Point2D.Point2D;
/**
 * Created by Toto on 11-Aug-16.
 */
public class Circle {
    private Point2D center;
    private double radius;

    public Circle(float centerX, float centerY, float radius) {
        this.center = new Point2D(centerX, centerY);
        this.radius = radius;
    }

    public Point2D getCenter() {
        return center;
    }

    public double getArea(){
        return Math.PI*Math.pow(radius,2);
    }

    public boolean contains(Point2D point){
        double pointX = point.getX();
        double pointY = point.getY();

        return (Math.pow((pointX - center.getX()),2) + Math.pow((pointY - center.getY()),2)) < Math.pow(radius,2);
    }

    public double perimeter(){
        return Math.PI*radius*2;
    }

    public boolean equals(Circle circle) {
        return circle.equals(circle.center)&&radius==circle.radius;
    }
}
