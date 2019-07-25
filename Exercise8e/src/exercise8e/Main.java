package exercise8e;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sieve(20)));
    }

// method that returns a boolean array which indicates whether integers from 0 to n-1 are prime or not

    public static boolean[] sieve(int n) {

        boolean[] b = new boolean[n]; //one array with boolean elements
        //index of boolean array are used for testing "primality"

        // by default boolean array elements are initialized to false
        // changing all except first two to true, because 0 & 1 are not prime

        for (int i = 2; i < n; i++) {
            b[i] = true;
        }

        // sieve algorithm condition: prime^2 > n  --> stop, rest of numbers are prime

        for (int i = 2; i < Math.sqrt(n); i++) {
            if (b[i] == true) {
                int j;
                j = i + i;    // 2*i = j is not prime
                while (j < n) {
                    b[j] = false;
                    j = i + j;
                }
            }
        }
        return b;
    }
}


