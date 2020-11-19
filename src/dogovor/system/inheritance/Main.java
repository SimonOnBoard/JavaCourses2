package dogovor.system.inheritance;

import dogovor.system.inheritance.system.*;

import java.sql.Date;
import java.time.LocalDate;


public class Main {
    public static void main(String[] args) {
        ResponsibleMan responsibleMan = new ResponsibleMan("Иванов Иван Иванович");
        Person person = new Person("Алексей Алексеевич Алексеев", "1234 567890", "г.Казань");
        Company company = new Company("Крутая компания", "Казань", "1234 654665");
        CompanyDogovor companyDogovor = new CompanyDogovor(33242d, Date.valueOf(LocalDate.now()), company);
        IndividualDogovor individualDogovor = new IndividualDogovor(6436345d, Date.valueOf(LocalDate.now()), responsibleMan, person);
        Storage storage = new Storage();
        storage.save(companyDogovor);
        storage.save(individualDogovor);

        storage.printAllInfo();
    }

}
