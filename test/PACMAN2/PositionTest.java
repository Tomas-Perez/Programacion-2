package PACMAN2;

import org.junit.Test;

import static org.junit.Assert.*;

public class PositionTest {
    Position pos1 = new Position(1,2);
    Position pos2 = new Position(1,2);
    Position pos3 = new Position(1,5);
    Position pos0 = new Position(0,0);

    @Test
    public void equals() throws Exception {
        assertTrue(pos1.equals(pos2));
        assertFalse(pos1.equals(pos3));
    }

    @Test
    public void moveUp() throws Exception {
        pos0.moveUp();
        assertEquals(1, pos0.getY());
    }

    public void moveDown() throws Exception {
        pos1.moveDown();
        assertEquals(0, pos1.getY());
    }

    @Test
    public void moveRight() throws Exception {
        pos0.moveRight();
        assertEquals(1, pos0.getX());
    }

    public void moveLeft() throws Exception {
        pos1.moveLeft();
        assertEquals(0, pos1.getX());
    }

}