import java.util.Scanner;

public class Lesenka {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int i = 1;
        //инициализируем номер шага
        //считываем данные
        //внешний цикл содержит n итераций
        //внутренний цикл будет зависеть от текущего номера шага
        while (i <= n){
            for (int j = 1; j <= i; j++){
                System.out.print(j);
            }
            System.out.print("\n");
            i++;
        }
    }
}
