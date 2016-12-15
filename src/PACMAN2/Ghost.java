package PACMAN2;

import PACMAN2.Exceptions.EatenExc;
import PACMAN2.Exceptions.OutOfBoundsExc;

public class Ghost extends Unit{

    public Ghost(GameMap map, Position position) {
        super(map, position, 200);
    }

    public void moveUp(){
        try {
            getPosition().moveUp();
            getMap().validPosition(getPosition());
        } catch (OutOfBoundsExc exc){
            getPosition().moveDown();
        }
    }

    public void moveDown(){
        try {
            getPosition().moveDown();
            getMap().validPosition(getPosition());
        } catch (OutOfBoundsExc exc){
            getPosition().moveUp();
        }
    }

    public void moveRight(){
        try {
            getPosition().moveRight();
            getMap().validPosition(getPosition());
        } catch (OutOfBoundsExc exc){
            getPosition().moveLeft();
        }
    }

    public void moveLeft(){
        try {
            getPosition().moveLeft();
            getMap().validPosition(getPosition());
        } catch (OutOfBoundsExc exc){
            getPosition().moveRight();
        }
    }

    @Override
    public int getEaten() {
        if(getMap().AreGhostsEdible()) return super.getEaten();
        else throw new EatenExc("eaten");
    }
}
