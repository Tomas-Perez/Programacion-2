package RecuperatorioPACMAN;

public class Position {
    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Position)) return false;

        Position position = (Position) o;

        if (getX() != position.getX()) return false;
        return getY() == position.getY();

    }

    public void moveUp(){
        y++;
    }

    public void moveDown(){
        y--;
    }

    public void moveRight(){
        x++;
    }

    public void moveLeft(){
        x--;
    }

}
