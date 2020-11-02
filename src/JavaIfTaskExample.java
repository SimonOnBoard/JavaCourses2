import java.util.Locale;
import java.util.Scanner;

public class JavaIfTaskExample {
    public static void main(String[] args) {
        //считать данные
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.UK);
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        //проверить условие абсциссы
        //проверить условие прямой
        //проверить условие окржуности

        if(x - 2d < 1e-8 && y - x < 1e-8 && x*x + y * y - 4d > 1e-8 && x > 0 && y > 0){
            //вывести результат на экран
            System.out.println("YES");
        }else {
            //вывести результат на экран
            System.out.println("NO");
        }
    }
}
