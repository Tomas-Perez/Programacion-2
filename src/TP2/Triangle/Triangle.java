package TP2.Triangle;
import TP1.Point2D.Point2D;
/**
 * Created by Toto on 12-Aug-16.
 */
public class Triangle {
    private Segment segmentAB;
    private Segment segmentBC;
    private Segment segmentCA;
    private Point2D pointA;
    private Point2D pointB;
    private Point2D pointC;

    public Triangle(Point2D pointA, Point2D pointB, Point2D pointC){
        this.pointA = pointA;
        this.pointB = pointB;
        this.pointC = pointC;

        segmentAB = new Segment(pointA,pointB);
        segmentBC = new Segment(pointB,pointC);
        segmentCA = new Segment(pointC,pointA);
    }

    public double area(){
        double x1 = pointA.getX();
        double x2 = pointB.getX();
        double x3 = pointC.getX();
        double y1 = pointA.getY();
        double y2 = pointB.getY();
        double y3 = pointC.getY();

        double area = (0.5)*(x1*(y2-y3)+x2*(y3-y1)+x3*(y1-y2)); //Triangle Area Equation

        if(area<0) return -area;
        else return area;
    }

    public double perimeter(){
        return segmentAB.howLong()+segmentBC.howLong()+segmentCA.howLong();
    }

    public boolean isIsoceles(){
        if(!isEquilateral()) {
            double longAB = segmentAB.howLong();
            double longBC = segmentBC.howLong();
            double longCA = segmentCA.howLong();
            return (longAB == longBC || longAB == longCA || longBC == longCA);
        }

        return false;
    }

    public boolean isEquilateral(){
        double longAB = segmentAB.howLong();
        double longBC = segmentBC.howLong();
        double longCA = segmentCA.howLong();
        return (longAB == longBC && longBC == longCA);
    }

    public boolean isScalane(){
        return !isIsoceles();
    }
}

