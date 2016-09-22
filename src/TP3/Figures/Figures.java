package TP3.Figures;

import TP3.Figure.*;


/**
 * Created by Toto on 25-Aug-16.
 */
public class Figures {
    private Figure[] figures;

    public Figures(int length) {
        figures = new Figure[length];
    }

    public double getFigureArea(int index){
        if(figures[index]!=null){
            return figures[index].getArea();
        }
        return -1;
    }

    public double getFigurePerimeter(int index){
        if(figures[index]!=null){
            return figures[index].getPerimeter();
        }
        return -1;
    }

    public double getFigureDiagonal(int index){
        if(figures[index] instanceof Rectangle){
            Rectangle rectangle = (Rectangle) figures[index];
            return rectangle.getDiagonal();
        }
        else if(figures[index] instanceof Triangle){
            Triangle triangle = (Triangle) figures[index];
            return triangle.getDiagonal();
        }
        else return -1;
    }

    public Figure[] getFigures() {
        return figures;
    }
}
