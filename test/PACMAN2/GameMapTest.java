package PACMAN2;

import PACMAN2.Exceptions.OutOfBoundsExc;
import org.junit.Test;

import static org.junit.Assert.*;

public class GameMapTest {
    GameMap map = new GameMap(5,3);

    @Test (expected = OutOfBoundsExc.class)
    public void add() throws Exception {
        Unit unit = new Fruit(map, new Position(6, 2));
    }

    @Test
    public void getAllIn() throws Exception {
        Unit unit = new Fruit(map, new Position(4, 2));
        assertTrue(map.getAllIn(new Position(4, 2)).size() == 1);
        assertFalse(map.getAllIn(new Position(0, 0)).size() == 1);
        Unit unit2 = new Fruit(map, new Position(4, 2));
        Unit unit3 = new Fruit(map, new Position(4, 2));
        assertTrue(map.getAllIn(new Position(4, 2)).size() == 3);
    }

    @Test
    public void remove() throws Exception {
        Unit unit = new Fruit(map, new Position(4, 2));
        assertTrue(map.getAllIn(new Position(4, 2)).size() == 1);
        map.remove(unit);
        assertTrue(map.getAllIn(new Position(4, 2)).size() == 0);
    }

}