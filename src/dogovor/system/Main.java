package dogovor.system;

import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        ResponsibleMan responsibleMan = new ResponsibleMan("Иванов Иван Иванович");
        Person person = new Person("Алексей Алексеевич Алексеев","1234 567890","г.Казань");
        IndidualDogovor dogovor = new IndidualDogovor("Страховка",
                42352.0d, Date.valueOf(LocalDate.now()),person, responsibleMan);
//        System.out.println("Dogovor:" + " " + dogovor.date + " "
//                + dogovor.cost + " " + dogovor.subject + " " + dogovor.responsibleMan + " " + dogovor.person);

        IndidualDogovor anotherIndividualContract = new IndidualDogovor(new Person("A A A","B B B","C C C"));
        System.out.println(anotherIndividualContract.getCost());
        anotherIndividualContract.setCost(423432d);
        System.out.println(anotherIndividualContract.toString());
        System.out.println(anotherIndividualContract.getResponsibleManInfo());
        System.out.println(IndidualDogovor.getNumberOfIndividualContract());
    }
}
