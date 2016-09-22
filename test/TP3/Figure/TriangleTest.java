package TP3.Figure;

import TP1.Point2D.Point2D;
import TP2.Triangle.Segment;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Toto on 25-Aug-16.
 */
public class TriangleTest {
    Point2D point1 = new Point2D(2,5);
    Point2D point2 = new Point2D(2,0);
    Point2D point3 = new Point2D(5,3);
    Point2D point4 = new Point2D(-1,6);
    Segment segment1 = new Segment(point1,point2);
    Segment segment2 = new Segment(point3,point4);
    Triangle triangle = new Triangle(segment1, segment2);

    @Test
    public void getBase() throws Exception {
        assertEquals(segment1.howLong(), triangle.getBase(), 0.1);
    }

    @Test
    public void getHeight() throws Exception {
        assertEquals(segment2.howLong(), triangle.getHeight(), 0.1);
    }

    @Test
    public void getDiagonal() throws Exception {
        assertEquals(8.36, triangle.getDiagonal(),0.01);
    }

    @Test
    public void getArea() throws Exception {
        assertEquals(16.75, triangle.getArea(),0.1);
    }

    @Test
    public void getPerimeter() throws Exception {
        assertEquals(20.06, triangle.getPerimeter(),0.1);
    }

}