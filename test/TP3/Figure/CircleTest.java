package TP3.Figure;

import TP1.Point2D.Point2D;
import TP2.Triangle.Segment;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Toto on 25-Aug-16.
 */
public class CircleTest {
    Point2D point1 = new Point2D(2,5);
    Point2D point2 = new Point2D(2,0);
    Segment segment1 = new Segment(point1,point2);
    Circle circle = new Circle(segment1);
    @Test
    public void getArea() throws Exception {
        assertEquals(78.5, circle.getArea(),0.1);
    }

    @Test
    public void getPerimeter() throws Exception {
        assertEquals(31.4, circle.getPerimeter(),0.1);
    }

}