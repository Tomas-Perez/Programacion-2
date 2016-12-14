package RecuperatorioContainers;

import java.util.ArrayList;

public class DepotElement {
    private int x;
    private int y;
    private int maxSize;
    private ArrayList<Container> containers;

    public DepotElement(int x, int y, int maxSize) {
        this.x = x;
        this.y = y;
        this.maxSize = maxSize;
        this.containers = new ArrayList<>();
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public ArrayList<Container> getContainers() {
        return containers;
    }

    public boolean sameKey(int x, int y) {
        if (this.x != x) return false;
        return this.y == y;
    }

    public void put(Container container){
        if(maxSize > containers.size()) containers.add(container);
        else throw new RuntimeException();
    }

    public boolean contains(Container container){
        return containers.contains(container);
    }

    public void remove(Container container){
        containers.remove(container);
    }

    @Override
    public String toString() {
        String result = "[" + x + "]" + "[" + y + "]" + "\n";
        for (int i = 0; i < containers.size(); i++) {
            result += "[" + (i+1) + "]" + containers.get(i) + "\n";
        }

        return result;
    }
}
