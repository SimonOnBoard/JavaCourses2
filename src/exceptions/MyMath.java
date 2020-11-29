package exceptions;

class MyMath {
    public static int fact(int n) throws Exception {

        if (n < 0)
            throw new Exception("Can't take it!");
        if (n == 0) {
            return 1;
        } else {
            return n * fact(n - 1);
        }
    }
}