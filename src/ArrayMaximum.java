public class ArrayMaximum {
    public static void main(String[] args) {
        System.out.println(maxOfArray(new int[]{16, 27, 128, 13, 72}, 0));
    }

    public static int maxOfArray(int[] mas, int k) {
        for (int i = 0; i < 8000; i++){
            maxOfArray(mas,0);
        }
        if (k == mas.length - 1) {
            return mas[k];
        } else {
            int m = maxOfArray(mas, k + 1);
            return m > mas[k] ? m : mas[k];
        }
    }
}
