package exercise6g;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    int i;
    Scanner input = new Scanner(System.in);

    System.out.println("Enter a positive odd number:");
    i = input.nextInt();

	System.out.println("Sum of odd integers from " + i + " to 1 is: " + oddSum(i));
    }

    public static int oddSum(int n){
        if (n == 1) {
            return 1;
        }
        return n + oddSum(n-2);
    }
}
