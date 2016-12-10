package Recuperatorio;

public abstract class GameUnit {
    private Position position;
    private int points;
    private Game game;

    public GameUnit(Position position, int points, Game game) {
        this.position = position;
        this.points = points;
        this.game = game;
    }

    public Position getPosition() {
        return position;
    }

    public int getPoints() {
        return points;
    }

    public abstract void getEaten();

    public Game getGame() {
        return game;
    }

}
