import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class ArraysX{
    public static void main(String[] args) {
        int[] numbersArray = new int[Integer.parseInt(args[0])];

        for(int i = 0; i < numbersArray.length; i++){
            numbersArray[i] = i;
        }
        System.out.println(Arrays.toString(numbersArray));
        int sum = 0;
        //переменная которая гуляет по всем значениям массива но при этом не ссылается ни на один его элемент
        //на каждом шаге цикла в неё будет копироваться значение ячейки массива
//        for (int i: numbersArray){
//            sum += i;
//            i = 50;
//            int z = i + sum;
//            int k = i + 2* sum;
//            System.out.println("i: " + i + "z = " + z + "k = " + k);
//        }
//        System.out.println(Arrays.toString(numbersArray));

//        System.out.println("Result sum is: " + sum);
//
//        for(int i = 0; i < numbersArray.length; i++){
//            System.out.print(numbersArray[i] + " ");
//        }
//        System.out.println();
//        System.out.println(Arrays.toString(numbersArray));

        for (int i: numbersArray){
            if (i % 2 == 0){
                System.out.println(i);
            }
        }


        //int [] b = numbersArray;
        //копирование одного массива в другой
        int[] с = Arrays.copyOf(numbersArray, numbersArray.length);
        int[] b = new int[numbersArray.length];
        for (int i = 0; i < numbersArray.length; i++){
            b[i] = numbersArray[i];
        }
        for (int i = 0; i < b.length; i++){
            System.out.print(b[i] + " ");
            b[i] = 100 - b[i];
        }
        System.out.println();

        for (int i = 0; i < numbersArray.length; i++){
            System.out.print(numbersArray[i] + "  ");
        }
        System.out.println(Arrays.toString(numbersArray));
        System.out.println(numbersArray);


        int[] arr1 = new int[]{4, 8, 15, 16, 23, 42};
        int[] arr2 = {4, 8, 15, 16, 23, 42};


        int n = 5;
        int m = 7;
        int[][] nmArray = new int[n][m];
        for(int i = 0; i < n; i++){
            for (int j = 1; j <= m; j++){
                nmArray[i][j] = i + j;
            }
        }

        System.out.println();
        for(int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                System.out.print(nmArray[i][j] + " ");
            }
            System.out.print("\n");
        }

        n = 3;
        int [][] a = new int[n][];
        a[0] = new int[n];
        a[1] = new int[n-1];
        a[2] = new int[n-2];

        Random random = new Random();

        for (int i = 0; i < a.length; i++){
            for(int j = 0; j < a[i].length; j++){
                a[i][j] = random.nextInt(100);
            }
        }
        for (int i = 0; i < a.length; i++){
            for(int j = 0; j < a[i].length; j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.print("\n");
        }
    }

}
