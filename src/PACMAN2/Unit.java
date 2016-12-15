package PACMAN2;

public abstract class Unit {
    private GameMap map;
    private Position position;
    private int points;

    public Unit(GameMap map, Position position, int points) {
        this.map = map;
        this.position = position;
        this.points = points;
        map.add(this);
    }

    public int getEaten(){
        map.remove(this);
        return points;
    }

    public boolean samePosition(Position position){
        return this.position.equals(position);
    }

    public Position getPosition() {
        return position;
    }

    public int getPoints() {
        return points;
    }

    public GameMap getMap() {
        return map;
    }
}
