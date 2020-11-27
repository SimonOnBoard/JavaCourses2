package ru.kpfu.itis.java.introduction.inheritance.dogovor;

import dogovor.system.inheritance.system.IndividualContract;
import ru.kpfu.itis.java.introduction.inheritance.dogovor.system.*;

import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) {
        ResponsibleMan responsibleMan = new ResponsibleMan("Иванов Иван Иванович");
        Person person = new Person("Алексей Алексеевич Алексеев","1234 567890","г.Казань");
        IndidualDogovor dogovor = new IndidualDogovor("Страховка",
                42352.0d,person, responsibleMan);
//        System.out.println("Dogovor:" + " " + ru.kpfu.itis.java.introduction.inheritance.dogovor.date + " "
//                + ru.kpfu.itis.java.introduction.inheritance.dogovor.cost + " " + ru.kpfu.itis.java.introduction.inheritance.dogovor.subject + " " + ru.kpfu.itis.java.introduction.inheritance.dogovor.responsibleMan + " " + ru.kpfu.itis.java.introduction.inheritance.dogovor.person);

        IndidualDogovor anotherIndividualContract = new IndidualDogovor(new Person("A A A","B B B","C C C"));
        System.out.println(anotherIndividualContract.getCost());
        anotherIndividualContract.setCost(423432d);
        System.out.println(anotherIndividualContract.toString());
        System.out.println(anotherIndividualContract.getResponsibleManInfo());
        System.out.println(IndidualDogovor.getNumberOfIndividualContract());
    }

}
