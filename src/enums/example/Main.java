package enums.example;

public class Main {
    public static void main(String[] args) {
        Season s = Season.SPRING;
        System.out.println(s);
        System.out.println("Printing enums");
        for (Season season: Season.values()) {
            System.out.println(season);
        }

        if(s == Season.SPRING){
            System.out.println("Ok 1");
        }
        if(s.equals(Season.SPRING)){
            System.out.println("Ok 2");
        }

        System.out.println(Season.valueOf("WINTER"));
    }
}
