package PACMAN2;

import PACMAN2.Exceptions.EatenExc;
import PACMAN2.Exceptions.OutOfBoundsExc;

public class Pacman {
    private Position position;
    private GameMap gameMap;
    private int points;
    private int lifes;

    public Pacman(Position position, GameMap gameMap, int lifes) {
        this.position = position;
        this.gameMap = gameMap;
        this.lifes = lifes;
    }

    public void moveUp(){
        try {
            position.moveUp();
            eat();
        } catch (OutOfBoundsExc exc){
            position.moveDown();
        }
    }

    public void moveDown(){
        try {
            position.moveDown();
            eat();
        } catch (OutOfBoundsExc exc){
            position.moveUp();
        }
    }

    public void moveRight(){
        try {
            position.moveRight();
            eat();
        } catch (OutOfBoundsExc exc){
            position.moveLeft();
        }
    }

    public void moveLeft(){
        try {
            position.moveLeft();
            eat();
        } catch (OutOfBoundsExc exc){
            position.moveRight();
        }
    }

    private void eat(){
        try {
            points += gameMap.getAllIn(position)
                    .stream()
                    .mapToInt(Unit::getEaten)
                    .sum();
        } catch (EatenExc exc){
            lifes--;
        }
    }

    public Position getPosition() {
        return position;
    }

    public int getPoints() {
        return points;
    }

    public int getLifes() {
        return lifes;
    }
}
