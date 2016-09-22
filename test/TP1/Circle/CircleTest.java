package TP1.Circle;

import TP1.Point2D.Point2D;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Toto on 11-Aug-16.
 */
public class CircleTest {
    @Test
    public void getCenter() throws Exception {
        Circle circle = new Circle(5,2,3);
        double circleX = circle.getCenter().getX();
        double circleY = circle.getCenter().getY();
        assertEquals(5,circleX,0.1);
        assertEquals(2,circleY,0.1);
    }

    @Test
    public void getArea() throws Exception {
        Circle circle = new Circle(5,2,3);
        assertEquals(28.27, circle.getArea(), 0.01);
    }

    @Test
    public void contains() throws Exception {
        Circle circle = new Circle(5,2,3);
        Point2D point = new Point2D(5,3);
        assertEquals(true, circle.contains(point));
    }

    @Test
    public void perimeter() throws Exception {
        Circle circle = new Circle(5,2,3);
        assertEquals(18.85,circle.perimeter(),0.01);
    }

}