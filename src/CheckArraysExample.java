public class CheckArraysExample {
    public static void newArray(int [] a) {
        int [] b = new int[]{1,2,3};
        a = b;
    }
    public static void main(String[] args) {
        int [] a = new int[]{1,1,1};
        newArray(a);
        System.out.println(a[2]);
    }
}
