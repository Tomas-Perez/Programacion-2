package TP2.Triangle;

import TP1.Point2D.Point2D;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Toto on 12-Aug-16.
 */
public class TriangleTest {
    @Test
    public void area() throws Exception {
        Point2D point1 = new Point2D(2,5);
        Point2D point2 = new Point2D(3,9);
        Point2D point3 = new Point2D(6,1);

        Triangle triangle = new Triangle(point1, point2, point3);

        assertEquals(10, triangle.area(),0.1);
    }

    @Test
    public void perimeter() throws Exception {
        Point2D point1 = new Point2D(2,5);
        Point2D point2 = new Point2D(3,9);
        Point2D point3 = new Point2D(6,1);

        Triangle triangle = new Triangle(point1, point2, point3);

        assertEquals(18.32396362042757, triangle.perimeter(), 0.0000000001);
    }

    @Test
    public void isIsoceles() throws Exception {
        Point2D point1 = new Point2D(2,5);
        Point2D point2 = new Point2D(3,9);
        Point2D point3 = new Point2D(6,1);

        Triangle triangle = new Triangle(point1, point2, point3);

        assertEquals(false, triangle.isIsoceles());
    }

    @Test
    public void isEquilateral() throws Exception {
        Point2D point1 = new Point2D(2,5);
        Point2D point2 = new Point2D(3,9);
        Point2D point3 = new Point2D(6,1);

        Triangle triangle = new Triangle(point1, point2, point3);

        assertEquals(false, triangle.isEquilateral());
    }

    @Test
    public void isScalane() throws Exception {
        Point2D point1 = new Point2D(2,5);
        Point2D point2 = new Point2D(3,9);
        Point2D point3 = new Point2D(6,1);

        Triangle triangle = new Triangle(point1, point2, point3);

        assertEquals(true, triangle.isScalane());
    }

}