package dogovor.system.inheritance.system;

public class Person {
    private String fio;
    private String passportData;
    private String address;

    public Person(String fio, String passportData, String address) {
        this.fio = fio;
        this.passportData = passportData;
        this.address = address;
    }

    public String getFio() {
        return fio;
    }

    public String getPassportData() {
        return passportData;
    }

    public String getAddress() {
        return address;
    }
}