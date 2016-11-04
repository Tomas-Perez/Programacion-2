package Parcial2;

public class Client {
    private String name;
    private PhoneNumber phoneNumber;
    private CommunicationSystem communicationSystem;

    public Client(Long number, String name, CommunicationSystem communicationSystem){
        this.name = name;
        phoneNumber = new PhoneNumber(number);
        this.communicationSystem = communicationSystem;
    }

    public void call(PhoneNumber recipient){

    }

    public void endCall(){

    }

}
