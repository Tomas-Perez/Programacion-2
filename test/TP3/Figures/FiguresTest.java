package TP3.Figures;

import TP1.Point2D.Point2D;
import TP2.Triangle.Segment;
import TP3.Figure.Circle;
import TP3.Figure.Ellipse;
import TP3.Figure.Rectangle;
import TP3.Figure.Triangle;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Toto on 25-Aug-16.
 */
public class FiguresTest {

    Point2D point1 = new Point2D(2,5);
    Point2D point2 = new Point2D(2,0);
    Point2D point3 = new Point2D(5,3);
    Point2D point4 = new Point2D(-1,6);
    Segment segment1 = new Segment(point1,point2);
    Segment segment2 = new Segment(point3,point4);
    Ellipse ellipse = new Ellipse(segment1, segment2);
    Circle circle = new Circle(segment1);
    Triangle triangle = new Triangle(segment1, segment2);
    Rectangle rectangle = new Rectangle(segment1, segment2);
    Figures figures = new Figures(6);

    @Test
    public void getFigureArea() throws Exception {
        figures.getFigures()[0] = ellipse;
        figures.getFigures()[1] = circle;
        figures.getFigures()[2] = rectangle;
        figures.getFigures()[3] = triangle;

        assertEquals(-1, figures.getFigureArea(4),0.1);
        assertEquals(-1, figures.getFigureArea(5),0.1);
        assertEquals(78.5, figures.getFigureArea(1),0.1);
        assertEquals(33.5, figures.getFigureArea(2),0.1);

    }

    @Test
    public void getFigurePerimeter() throws Exception {
        figures.getFigures()[0] = ellipse;
        figures.getFigures()[1] = circle;
        figures.getFigures()[2] = rectangle;
        figures.getFigures()[3] = triangle;

        assertEquals(-1, figures.getFigurePerimeter(4),0.1);
        assertEquals(-1, figures.getFigurePerimeter(5),0.1);
        assertEquals(37.12, figures.getFigurePerimeter(0),0.1);
        assertEquals(20.06, figures.getFigurePerimeter(3),0.1);
    }

    @Test
    public void getFigureDiagonal() throws Exception {
        figures.getFigures()[0] = ellipse;
        figures.getFigures()[1] = circle;
        figures.getFigures()[2] = rectangle;
        figures.getFigures()[3] = triangle;

        assertEquals(-1, figures.getFigureDiagonal(0),0.1);
        assertEquals(-1, figures.getFigureDiagonal(1),0.1);
        assertEquals(8.36, figures.getFigureDiagonal(2),0.1);
        assertEquals(8.36, figures.getFigureDiagonal(3),0.1);
    }

}