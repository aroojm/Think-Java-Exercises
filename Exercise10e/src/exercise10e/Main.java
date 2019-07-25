package exercise10e;
import java.math.BigInteger;

public class Main {

    public static void main(String[] args) {

        int x = 2, n = 32;

        System.out.println( x + " to power " + n + " = " + pow(x,n));
    }

    public static BigInteger pow(int x, int n){
        if (n == 0) return BigInteger.valueOf(1);

        // find x to the n/2 recursively
        BigInteger t = (pow(x,n/2));

        // if n is even, the result is t squared
        // if n i odd, the result is t squared times x
        if (n % 2 == 0){
            return t.multiply(t);
        }
        else
            {
            return t.multiply(t.multiply(BigInteger.valueOf(x)));
        }
    }
}
