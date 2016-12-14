package RecuperatorioContainers;

import org.junit.Test;

import static org.junit.Assert.*;

public class ContainerDepotTest {

    @Test (expected = RuntimeException.class)
    public void put() throws Exception {
        ContainerDepot depot = new ContainerDepot(2,2,3);
        depot.put(1,1, new Container(125, "blabla", 12365));
        depot.put(1,1, new Container(125, "blabla", 12365));
        depot.put(1,1, new Container(125, "blabla", 12365));
        depot.put(1,1, new Container(125, "blabla", 12365));
    }

    @Test
    public void contains() throws Exception {
        ContainerDepot depot = new ContainerDepot(2,2,3);
        Container container = new Container(125, "blabla", 12365);
        depot.put(1,1, container);
        assertTrue(depot.contains(container));

    }

    @Test
    public void remove() throws Exception {
        ContainerDepot depot = new ContainerDepot(2,2,3);
        Container container = new Container(125, "blabla", 12365);
        depot.put(1, 1, container);
        assertTrue(depot.contains(container));
        depot.remove(container);
        assertFalse(depot.contains(container));
    }

    @Test
    public void log() throws Exception {
        ContainerDepot depot = new ContainerDepot(2,2,3);
        Container container1 = new Container(125, "blabla", 12365);
        Container container2 = new Container(125, "blabla", 12365);
        Container container3 = new Container(125, "blabla", 12365);
        depot.put(1, 1, container1);
        depot.put(1, 2, container2);
        depot.put(1, 1, container3);
        System.out.println(depot.log());
    }

    @Test
    public void move() throws Exception {
        ContainerDepot depot = new ContainerDepot(2,2,3);
        Container container1 = new Container(125, "blabla", 12365);
        Container container2 = new Container(125, "blabla", 12365);
        Container container3 = new Container(125, "blabla", 12365);
        depot.put(1, 1, container1);
        depot.put(1, 2, container2);
        depot.put(1, 1, container3);
        System.out.println(depot.log());
        depot.move(container1, 2, 2);
        System.out.println(depot.log());
    }
}

/**
 a.m1 = 8
 a.m2 = 16
 a.m3 = 10
 b.m1 = 8
 b.m2 = 16
 b.m3 = 10
 c.m1 = 10
 c.m2 = 10
 c.m3 = 10
 **/