package dogovor.system.inheritance.system;

import java.sql.Date;

public class IndividualDogovor extends Contract{
    private static int numberOfIndividualContract = 0;
    public static int getNumberOfIndividualContract() {
        return numberOfIndividualContract;
    }


    private Person owner;
    private ResponsibleMan responsibleMan;

    public IndividualDogovor(String subject, double cost, Date dueTo, String status, ResponsibleMan responsibleMan, Person person) {
        super(subject, cost, dueTo, status);
        this.responsibleMan = responsibleMan;
        this.owner = person;
    }

    public IndividualDogovor(double cost, Date dueTo, ResponsibleMan responsibleMan, Person person) {
        super(cost, dueTo);
        this.responsibleMan = responsibleMan;
        this.owner = person;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    public ResponsibleMan getResponsibleMan() {
        return responsibleMan;
    }

    public void setResponsibleMan(ResponsibleMan responsibleMan) {
        this.responsibleMan = responsibleMan;
    }

    @Override
    public void printInfo() {
        System.out.println("IndidualDogovor{" +
                "owner=" + owner +
                ", responsibleMan=" + responsibleMan +
                "} ");
        super.printInfo();
    }


}
