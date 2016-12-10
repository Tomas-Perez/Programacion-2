package Recuperatorio;

public class Pacman {
    private int points;
    private int lifes;
    private Position position;
    private Game game;

    public Pacman(int points, int lifes, Position position, Game game) {
        this.points = points;
        this.lifes = lifes;
        this.position = position;
        this.game = game;
    }

    public void moveUp(){
        position.moveUp();
        try{
            eat();
        } catch (OutOfBoundsExc exc){
            position.moveDown();
        }
    }

    public void moveDown(){
        position.moveDown();
        try{
            eat();
        } catch (OutOfBoundsExc exc){
            position.moveUp();
        }
    }

    public void moveRight(){
        position.moveRight();
        try{
            eat();
        } catch (OutOfBoundsExc exc){
            position.moveLeft();
        }
    }

    public void moveLeft(){
        position.moveLeft();
        try{
            eat();
        } catch (OutOfBoundsExc exc){
            position.moveRight();
        }
    }

    private void eat() throws OutOfBoundsExc{
        game.getAllIn(position).forEach(GameUnit::getEaten);
    }

    public void die(){
        lifes--;
    }

    public int getPoints() {
        return points;
    }

    public int getLifes() {
        return lifes;
    }

    public Position getPosition() {
        return position;
    }

    public Game getGame() {
        return game;
    }

    public void addPoints(int points){
        this.points += points;
    }
}
