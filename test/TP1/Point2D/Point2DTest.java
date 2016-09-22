package TP1.Point2D;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Toto on 11-Aug-16.
 */
public class Point2DTest {
    @Test
    public void getX() throws Exception {
        Point2D point = new Point2D(2,5);
        assertEquals(2, point.getX(), 0.1);
    }

    @Test
    public void getY() throws Exception {
        Point2D point = new Point2D(2,5);
        assertEquals(5, point.getY(), 0.1);
    }

    @Test
    public void getDistance() throws Exception {
        Point2D point1 = new Point2D(2,5);
        Point2D point2 = new Point2D(2,5);
        assertEquals(0, point1.getDistance(point2), 0.1);
    }

    @Test
    public void add() throws Exception {
        Point2D point1 = new Point2D(2,5);
        Point2D point2 = new Point2D(2,5);
        point1 = point1.add(point2);
        assertEquals(4,point1.getX(),0.1);
        assertEquals(10,point1.getY(),0.1);
    }

}