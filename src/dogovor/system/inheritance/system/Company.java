package dogovor.system.inheritance.system;

public class Company {
    private String name;
    private String address;
    private String requisites;

    public Company(String name, String address, String requisites) {
        this.name = name;
        this.address = address;
        this.requisites = requisites;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getRequisites() {
        return requisites;
    }

    public void setRequisites(String requisites) {
        this.requisites = requisites;
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", requisites='" + requisites + '\'' +
                '}';
    }
}
