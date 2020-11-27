package educational;

import educational.system.*;

public class Main {
    public static void main(String[] args) {
        People people = new People("Alex alex alex", 30, 250);
        Group group = new Group("11-801", 15, null, null);
        Direction direction = new Direction("2520-2345-32", "Программная инженерия",
                new Type(0, "бакалавриат"));
        People anotherPeople = new Student("BBB", 30,
                280, (byte) 4, group, direction, null);
        String result = anotherPeople.toString();
        System.out.println(result);
        Student outStudent = (Student) anotherPeople;
        outStudent.shoutBattleCry();
    }
}
