package Recuperatorio;

public abstract class Food extends GameUnit{

    public Food(Position position, int points, Game game) {
        super(position, points, game);
    }

    @Override
    public void getEaten() {
        getGame().getPacman().addPoints(getPoints());
        getGame().removeFood(this);
    }
}
