package exercise7c;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    double x;
    int n;
    Scanner input = new Scanner(System.in);
    System.out.println("Enter any rational number \'x' in x^n:");
    x = input.nextDouble();

    System.out.println("Enter any integer \'n' in x^n:");
    n = input.nextInt();

	System.out.println(power(x, n));
    }

    public static double power(double x, int n){
        int  i;
        double y;

        if (n == 0)  {
            return 1;
        }
        else if (n > 0) {
            y = x;
            for (i = 1; i <= n-1; i = i+1) {
                y = x * y;
            }
            return y;
        }
        else {
            y = 1/x;
            n = -1 * n;
            for (i = 1; i <= n-1; i = i+1) {
                y = (1/x) * y;
            }
            return y;
        }

    }
}
