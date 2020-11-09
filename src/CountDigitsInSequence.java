import java.util.Arrays;
import java.util.Scanner;

public class CountDigitsInSequence {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int[] result = getResultArray();
        System.out.println(Arrays.toString(result));
        System.out.println(isDigit(scanner.next().charAt(0)));
    }

    private static boolean isDigit(char charAt) {
        if ('1' <= charAt && charAt <= '9'){
            return true;
        }
        //посмотреть код числа в таблице unicode ( 1 и 9) и сравнить что заданный char лежит в данном диапазоне
        return false;
    }

    private static int[] getResultArray() {
        int result[] = new int[9];
        int current = scanner.nextInt();
        while (current != 0){
            result[current - 1]++;
            current = Integer.parseInt(scanner.next());
        }
        return result;
    }
}
