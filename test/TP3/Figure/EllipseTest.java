package TP3.Figure;

import TP1.Point2D.Point2D;
import TP2.Triangle.Segment;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Toto on 25-Aug-16.
 */
public class EllipseTest {
    Point2D point1 = new Point2D(2,5);
    Point2D point2 = new Point2D(2,0);
    Point2D point3 = new Point2D(5,3);
    Point2D point4 = new Point2D(-1,6);
    Segment segment1 = new Segment(point1,point2);
    Segment segment2 = new Segment(point3,point4);
    Ellipse ellipse = new Ellipse(segment1, segment2);

    @Test
    public void getArea() throws Exception {
        assertEquals(105.19,ellipse.getArea(),1);
    }

    @Test
    public void getPerimeter() throws Exception {
        assertEquals(37.12,ellipse.getPerimeter(),0.1);
    }
}