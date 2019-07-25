package exercise6i;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    int n;
    double x;
    Scanner input = new Scanner(System.in);

    System.out.println("Enter a number x for x^n:");
    x = input.nextDouble();

    System.out.println("Enter an integer n for x^n:");
    n = input.nextInt();

    System.out.print(x + " to the power of " + n + " is ");
    System.out.println(power(n,x));

    }
    public static double power(int n, double x){
        if (n == 0){
            return 1;
        }
        if (n < 0) {
            n = -1 * n;
            return (1/x) * power(n - 1, (1/x));
        }
        else {
            return x * power(n - 1, x);
        }


    }
}
