import java.util.Scanner;

public class PetyasHeight {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        int n = getN();
        int[] height = getHeightArrayByN(n);
        int heightOfPetya = getN();
        System.out.println(calculatePosition(height, heightOfPetya));
    }

    private static int calculatePosition(int[] height, int heightOfPetya) {
        int result = 1;
        for (int currentHeight: height){
            if(heightOfPetya > currentHeight){
                return result;
            }
            result++;
        }
        return result;
    }

    private static int[] getHeightArrayByN(int n) {
        int [] result = new int[n];
        for (int i = 0; i < n; i++){
            result[i] = Integer.parseInt(scanner.next());
        }
        return result;
    }

    private static int getN() {
        return scanner.nextInt();
    }
}
