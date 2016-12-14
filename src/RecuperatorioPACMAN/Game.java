package RecuperatorioPACMAN;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Game {
    private Pacman pacman;
    private ArrayList<Ghost> ghosts = new ArrayList<>();
    private ArrayList<Food> foods = new ArrayList<>();
    private int sizeX;
    private int sizeY;

    public Game(Pacman pacman, int sizeX, int sizeY) {
        this.pacman = pacman;
        this.sizeX = sizeX;
        this.sizeY = sizeY;
    }

    public void addFood(Food food){
        isValidPosition(food.getPosition());
        foods.add(food);
    }

    public void removeFood(Food food){
        foods.remove(food);
    }

    public void addGhost(Ghost ghost){
        isValidPosition(ghost.getPosition());
        ghosts.add(ghost);
    }

    public void removeGhost(Ghost ghost){
        ghosts.remove(ghost);
    }

    public List<GameUnit> getAllIn(Position position){
        isValidPosition(position);
        ArrayList<GameUnit> units = new ArrayList<>();
        units.addAll(ghosts);
        units.addAll(units);
        return units.stream()
                .filter(gameUnit -> gameUnit.getPosition().equals(position))
                .collect(Collectors.toList());
    }

    public Pacman getPacman() {
        return pacman;
    }

    private void isValidPosition(Position position){
        if(position.getX() > sizeX || position.getY() > sizeY) throw new RuntimeException();
    }

    public Pacman getPacmanIn(Position position){
        isValidPosition(position);
        if(pacman.getPosition().equals(position)) return pacman;
        else throw new RuntimeException();
    }

    public void makeGhostsEdible(){
        ghosts.forEach(Ghost::turnEdible);
    }

    public void makeGhostsUnedible(){
        ghosts.forEach(Ghost::turnUnedible);
    }
}
