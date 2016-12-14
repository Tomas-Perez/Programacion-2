package RecuperatorioContainers;

import java.util.ArrayList;

public class ContainerDepot {
    private int rows;
    private int cols;
    private int level;
    private ArrayList<DepotElement> elements = new ArrayList<>();


    public ContainerDepot(int rows, int cols, int level) {
        this.rows = rows;
        this.cols = cols;
        this.level = level;
    }

    public void put(int row, int cols, Container container){
        if(row > this.rows || cols > this.cols) throw new RuntimeException("IndexOutOfBounds");
        for (DepotElement element: elements) {
            if(element.sameKey(row, cols)){
                element.put(container);
                return;
            }
        }
        DepotElement newElement = new DepotElement(row, cols, level);
        newElement.put(container);
        elements.add(newElement);
    }

    public boolean contains(Container container){
        return elements.stream()
                       .anyMatch(e -> e.contains(container));
    }

    public void remove(Container container){
        elements.stream()
                .filter(e -> e.contains(container))
                .findFirst()
                .ifPresent(e -> e.remove(container));
    }

    public String log() {
        String result = "";
        for (DepotElement element: elements) {
            result += element;
        }
        return result;
    }

    public void move(Container container, int x, int y){
        remove(container);
        put(x, y, container);
    }


}
