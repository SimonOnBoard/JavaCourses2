package exceptions;

import java.io.FileNotFoundException;

class MyMath {
    public static int fact(int n) throws Exception {
        if (n < 0)
            //так делать не нужно это учебный пример
            throw new FileNotFoundException("Can't take it!");
        if (n == 0) {
            return 1;
        } else {
            throw new Exception();
//            return n * fact(n - 1);
        }
    }
}