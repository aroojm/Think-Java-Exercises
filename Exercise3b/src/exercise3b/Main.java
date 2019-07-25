package exercise3b;


import java.util.Scanner ;

public class Main {

    public static void main(String[] args) {
        double Celsius, Fahrenheit;
        Scanner in = new Scanner(System.in) ;

        System.out.println("Type in the temperature in Celsius:");
        Celsius = in.nextDouble();
        in.nextLine();  // read newline (to avoid Scanner Bug)

        Fahrenheit = (Celsius * (9.0/5.0))+32 ;

        System.out.printf(" %.1f C = %.1f F", Celsius, Fahrenheit);

    }
}