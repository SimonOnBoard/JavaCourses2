
public class CyclesExample {
    public static void main(String[] args) {
        int a = 5;
        int b = 8;
        while (a > 0 && b < 10) {
            System.out.println("" + a + " " + b);
            a--;
            b++;
        }

        // 3 10
        do {
            System.out.println("A " + a + " B " + b);
            a++;
            b--;
        } while (a < 5 && b != 9);

        System.out.println();
        char current = 'A';
        while (current > 'A' - 1 && current <= 'Z') {
            System.out.print(current);
            current++;
        }

        System.out.println();
        for (int i = 4, j = 7, z = 52; i < 7 && j < 10 &&
                z > 50; i++, j--) {
            System.out.println("" + i + " " + j + " " + z);
        }
        for (int i = 0; i < 50 ; i++) {
            System.out.print(i);

        }
    }
}
