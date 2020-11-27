package dogovor.system.inheritance.system;

import java.sql.Date;

public class CompanyContract extends Contract {
    private Company company;

    public CompanyContract(String subject, double cost, Date dueTo, String status, Company company) {
        super(subject, cost, dueTo, status);
        this.company = company;
    }

    public CompanyContract(double cost, Date dueTo, Company company) {
        super(cost, dueTo);
        this.company = company;
    }


    @Override
    public void printInfo() {
        System.out.println( "CompanyDogovor{" +
                "company=" + company +
                "} ");
        super.printInfo();
    }
}
