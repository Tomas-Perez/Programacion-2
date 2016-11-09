package Parcial1Universidad;

public abstract class Person {

    private AccessCard accessCard;

    public Person() {
        this.accessCard = new AccessCard(this);
    }

    public abstract boolean enter(Building building);

    public AccessCard getAccessCard() {
        return accessCard;
    }

}
