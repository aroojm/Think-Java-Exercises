package exercise3c;

import java.util.Scanner ;

public class Main {

    public static void main(String[] args) {
	int seconds, hours, minutes, totalSec;
	Scanner in = new Scanner(System.in);

	System.out.println("How many seconds?");
	totalSec = in.nextInt();

	hours = totalSec / (3600);

	minutes = (totalSec % 3600) / 60 ;

	seconds = (totalSec % 3600) % 60 ;

	System.out.printf("%d seconds = %d hours, %d minutes, %d seconds", totalSec,hours,minutes,seconds);

    }
}
