package exceptions;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println(MyMath.fact(5));
        } catch (Exception e) {
            System.out.println("The error is:" + e.getMessage());
        } finally {
            System.out.println("So i really tried");
        }
    }
}
