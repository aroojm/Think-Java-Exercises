package exercise10d;

import java.math.BigInteger;

public class Main {

    public static void main(String[] args) {
	System.out.println("Number \t\t\t\t Factorial");
	System.out.println("------              -----------");

	for(int j=0; j <=30 ; j++){
	    System.out.println(j + "\t\t\t\t\t" + factorial(j));
    }

    }

    public static BigInteger factorial(int n){
        BigInteger x = BigInteger.valueOf(n);
        int i;
        if (n == 0) {
            return BigInteger.valueOf(1);
        }
        else {
            for(i = n-1; i >= 1; i-- ){
                x = x.multiply(BigInteger.valueOf(i));
            }
            return x;
        }

    }
}
