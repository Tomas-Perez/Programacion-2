package PACMAN2;

import PACMAN2.Exceptions.OutOfBoundsExc;
import org.junit.Test;
import static org.junit.Assert.*;

public class PacmanTest {
    GameMap gameMap = new GameMap(5,3);
    Pacman pacman = new Pacman(new Position(0,0), gameMap, 3);
    Fruit fruit = new Fruit(gameMap, new Position(2, 1));
    Pill pill = new Pill(gameMap, new Position(4, 3));
    Ghost ghost = new Ghost(gameMap, new Position(2,0));
    BigPill bigPill = new BigPill(gameMap, new Position(1,0));

    @Test
    public void moveUp() throws Exception {
        pacman.moveUp();
        pacman.moveRight();
        pacman.moveRight();
        assertEquals(150, pacman.getPoints());
    }

    @Test
    public void moveDown() throws Exception {
        pacman.moveDown();
        assertTrue(pacman.getPosition().equals(new Position(0,0)));
    }

    @Test
    public void moveRight() throws Exception {
        pacman.moveRight();
        pacman.moveRight();
        assertTrue(pacman.getPosition().equals(new Position(2,0)));
        assertEquals(2, pacman.getLifes());
    }

    @Test
    public void moveLeft() throws Exception {
        pacman.moveLeft();
        assertTrue(pacman.getPosition().equals(new Position(0,0)));
    }

    @Test
    public void eatEdibleGhost() throws Exception {
        pacman.moveRight();
        assertEquals(100, pacman.getPoints());
        pacman.moveRight();
        assertEquals(300, pacman.getPoints());
        pacman.moveLeft();
        assertEquals(300, pacman.getPoints());
    }
}