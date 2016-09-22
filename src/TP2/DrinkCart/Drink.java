package TP2.DrinkCart;

/**
 * Created by Toto on 17-Aug-16.
 */
public class Drink {
    private String type;
    private double price;
    private double size;

    public Drink(String type, double size) {
        this.type = type;
        this.size = size;
        setPrice();
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public double getSize() {
        return size;
    }

    public boolean equals(Drink drink){
        return (drink.getType().equals(getType())&&drink.getSize()==getSize());
    }

    private void setPrice(){
        switch (type){
            case "coke":
            case "sprite":
                price = size*0.02;
                break;
            case "water":
                price = size*0.01;
                break;
            case "soda":
                price = size*0.012;
                break;
            default:
                price = size*0.015;
                break;
        }
    }

    public String toString(){
        return type + "\t" + size + "\t" + price;
    }
}
