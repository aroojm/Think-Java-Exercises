package exercise7d;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the positive integer \'n' for n! :");
        n = input.nextInt();

        System.out.println("The factorial of " + n + " is " + factorial(n));
    }

    public static int factorial(int n){
        int i;
        if (n == 0) {
            return 1;
        }
        else {
            for(i = n-1; i >= 1; i-- ){
            n = n * i;
        }
            return n;
        }

    }
}

