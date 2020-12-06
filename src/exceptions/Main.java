package exceptions;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println(MyMath.fact(5));
        } catch (FileNotFoundException e) {
            System.out.println("The error is:" + e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("So i really tried");
        }
    }
}
