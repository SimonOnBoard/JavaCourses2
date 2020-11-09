public class MethodsExample {
    public static void main(String[] args) {
        printStringKNumbers("abc");
    }

    public static void printStringKNumbers(String toPrint, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(toPrint);
        }
        int x = 5;
        System.out.println( x / 0);
    }

    public static void printStringKNumbers(String toPrint){
        for (int i = 0; i < 5 ; i++) {
            System.out.println(toPrint);
        }
    }
}
