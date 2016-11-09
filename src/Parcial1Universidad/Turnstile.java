package Parcial1Universidad;

public class Turnstile {

    private Building building;

    public Turnstile(Building building) {
        this.building = building;
    }

    public boolean validateCard(AccessCard card){
        return card.validate(building);
    }
}
