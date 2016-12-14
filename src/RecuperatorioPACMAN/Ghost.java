package RecuperatorioPACMAN;

public class Ghost extends GameUnit {

    private boolean isEdible = false;

    public Ghost(Position position, int points, Game game) {
        super(position, points, game);
    }

    public void moveUp(){
        getPosition().moveUp();
        try{
            kill();
        } catch (OutOfBoundsExc exc){
            getPosition().moveDown();
        }
    }

    public void moveDown(){
        getPosition().moveDown();
        try{
            kill();
        } catch (OutOfBoundsExc exc){
            getPosition().moveUp();
        }
    }

    public void moveRight(){
        getPosition().moveRight();
        try{
            kill();
        } catch (OutOfBoundsExc exc){
            getPosition().moveLeft();
        }
    }

    public void moveLeft(){
        getPosition().moveLeft();
        try{
            kill();
        } catch (OutOfBoundsExc exc){
            getPosition().moveRight();
        }
    }

    @Override
    public void getEaten() {
        if(isEdible){
            getGame().getPacman().addPoints(getPoints());
            getGame().removeGhost(this);
        }
        else getGame().getPacman().die();
    }

    private void kill() throws OutOfBoundsExc{
        if(isEdible) {
            getGame().getPacmanIn(getPosition()).addPoints(getPoints());
            getGame().removeGhost(this);
        }
        else getGame().getPacmanIn(getPosition()).die();
    }

    public void turnEdible(){
        isEdible = true;
    }

    public void turnUnedible(){
        isEdible = false;
    }

}
