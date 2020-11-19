package dogovor.system.inheritance.system;

import java.sql.Date;

public class Contract {
    private String subject;
    private double cost;
    private Date dueTo;
    private String status;

    public void printInfo() {
        System.out.println("Contract{" +
                "subject='" + subject + '\'' +
                ", cost=" + cost +
                ", dueTo=" + dueTo +
                ", status='" + status + '\'' +
                '}');
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Contract(String subject, double cost, Date dueTo, String status) {
        this.subject = subject;
        this.cost = cost;
        this.dueTo = dueTo;
        this.status = status;
    }

    public Contract(double cost, Date dueTo) {
        this.subject = "Страховка";
        this.status = "Принято в работу";
        this.cost = cost;
        this.dueTo = dueTo;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public Date getDueTo() {
        return dueTo;
    }

    public void setDueTo(Date dueTo) {
        this.dueTo = dueTo;
    }
}
