package Parcial2;

public class PhoneNumber {
    private int countryCode;
    private int areaCode;
    private int number;

    public PhoneNumber(int countryCode, int areaCode, int number) {
        this.countryCode = countryCode;
        this.areaCode = areaCode;
        this.number = number;
    }

    public int getCountryCode() {
        return countryCode;
    }

    public int getAreaCode() {
        return areaCode;
    }

    public int getNumber() {
        return number;
    }
}
