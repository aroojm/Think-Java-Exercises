package exercise5d;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a, b, c, n;

        System.out.println("Checking Fermat's Theorem: a^n + b^n = c^n");

        System.out.println("Enter first number 'a':");
        a = input.nextInt();

        System.out.println("Enter second number 'b':");
        b = input.nextInt();

        System.out.println("Enter third number 'a':");
        c = input.nextInt();

        System.out.println("Enter power 'n':");
        n = input.nextInt();

        checkFermat(a, b, c, n);

    }

    public static void checkFermat(int a, int b, int c, int n){
        int x, y, z;
        x = (int) Math.pow(a,n);
        y = (int) Math.pow(b,n);
        z = (int) Math.pow(c,n);

        if (x + y == z && 2 < n){
            System.out.println("Holy smokes, Fermat was wrong!");
        }
        else {
            System.out.println("No, that doesn't work.");
        }

    }
}
