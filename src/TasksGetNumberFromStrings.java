import java.util.Scanner;

public class TasksGetNumberFromStrings {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = getN();
        String[] strings = getArrayOfStringsByN(n);
        System.out.println(getNumberFromStringsArray(strings));
        System.out.println(getReverseNumberFromStringsArray(strings));
    }

    private static long getReverseNumberFromStringsArray(String[] strings) {
        long result = 0;
        for (int i = strings.length - 1; i >= 0; i--){
            result += Integer.parseInt(strings[i]);
            result *= 10;
        }
        return result / 10;
    }

    private static long getNumberFromStringsArray(String[] strings) {
        long result = 0;
        for (String string: strings){
            result += Integer.parseInt(string);
            result *= 10;
        }
        return result / 10;
    }

    private static String[] getArrayOfStringsByN(int n) {
        String[] strings = new String[n];
        for (int i = 0; i < n; i++){
            strings[i] = scanner.next();
        }
        return strings;
    }

    private static int getN() {
        return scanner.nextInt();
    }
}
