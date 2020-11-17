package ru.kpfu.itis.java.introduction.inheritance.dogovor.system;

public class IndidualDogovor {
    private static int numberOfIndividualContract = 0;

    public static int getNumberOfIndividualContract() {
        return numberOfIndividualContract;
    }

    private String subject;
    private double cost;
    private Person person;
    private ResponsibleMan responsibleMan;


    public IndidualDogovor(Person person) {
        this(person, new ResponsibleMan("Алексей Алексеевич Алексеев"));
    }

    //этот конструктор отвечает только за инициализаю типовых договор
    private IndidualDogovor(Person person, ResponsibleMan responsibleMan) {
        this.subject = "страховка";
        this.cost = 50000d;
        this.person = person;
        this.responsibleMan = responsibleMan;
        numberOfIndividualContract++;
    }

    public ResponsibleMan getResponsibleManInfo() {
        return responsibleMan;
    }

    @Override
    public String toString() {
        return "IndidualDogovor{" +
                "subject='" + subject + '\'' +
                ", cost=" + cost +
                ", person=" + person +
                ", responsibleMan=" + responsibleMan +
                ", COUNT OF CONTRACTS FOR NOW=" + numberOfIndividualContract + " " + getNumberOfIndividualContract() +
                '}';
    }


    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public IndidualDogovor(String subjectToSet,
                           double cost,
                           Person person,
                           ResponsibleMan responsibleMan) {
        this.subject = subjectToSet;
        this.cost = cost;
        this.person = person;
        this.responsibleMan = responsibleMan;
        numberOfIndividualContract++;
    }

    public IndidualDogovor() {
        System.out.println("I am in empty constructor");
    }
}
