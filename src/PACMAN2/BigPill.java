package PACMAN2;

public class BigPill extends Unit {
    public BigPill(GameMap map, Position position) {
        super(map, position, 100);
    }

    @Override
    public int getEaten() {
        getMap().turnGhostsEdible();
        return super.getEaten();
    }
}
