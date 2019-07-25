package exercise7b;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    double number;
    Scanner input = new Scanner(System.in);

    System.out.println("Enter a rational number to find its square root: ");
    number = input.nextDouble();

	System.out.printf("The square root of " + number + " is: %f",squareRoot(number));
    }

    public static double squareRoot(double a) {
        double x, y, delta;
        x = a / 2; // first estimate is half of given number

        delta = Math.abs(a - x); //initialize while parameter (difference between two consecutive estimates)

        y = 0; // initialize y

        while(delta > 0.0001){
            y = (x + a/x)/2;  // estimation formula for square root
            delta = Math.abs(y - x); // difference between two consecutive estimates
            x = y; // update x
        }
        return y;
    }
}
