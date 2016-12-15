package PACMAN2;

import PACMAN2.Exceptions.OutOfBoundsExc;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class GameMap {
    private ArrayList<Unit> map = new ArrayList<>();
    private int sizeX;
    private int sizeY;
    private boolean ghostAreEdible = false;

    public GameMap(int sizeX, int sizeY) {
        this.sizeX = sizeX;
        this.sizeY = sizeY;
    }

    public void add(Unit unit){
        validPosition(unit.getPosition());
        map.add(unit);
    }

    public List<Unit> getAllIn(Position position){
        validPosition(position);
        return map.stream()
                  .filter(e -> e.samePosition(position))
                  .collect(Collectors.toList());
    }

    public void remove(Unit unit){
        map.remove(unit);
    }

    public void validPosition(Position position){
        if(position.getX() > sizeX || position.getY() > sizeY || position.getX() < 0 || position.getY() < 0)
            throw new OutOfBoundsExc("OutOfBounds");
    }

    public boolean AreGhostsEdible() {
        return ghostAreEdible;
    }

    public void turnGhostsEdible(){
        ghostAreEdible = true;
    }

    public void turnGhostsUnEdible(){
        ghostAreEdible = false;
    }
}
