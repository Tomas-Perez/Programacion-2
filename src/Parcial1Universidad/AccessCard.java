package Parcial1Universidad;

public class AccessCard {
    private Person person;

    public AccessCard(Person person) {
        this.person = person;
    }

    public boolean validate(Building building){
        return person.enter(building);
    }
}
