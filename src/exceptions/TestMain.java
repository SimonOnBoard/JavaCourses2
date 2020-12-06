package exceptions;

public class TestMain {
    public static boolean f() {
        try {
            return true;
        } finally {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(f());
    }

}
