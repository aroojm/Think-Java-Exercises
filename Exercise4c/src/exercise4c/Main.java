package exercise4c;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        String day, month ;
        int date, year;

        System.out.println("What is the day today?");
        day = in.nextLine();

        System.out.println("What is the date today?");
        date = in.nextInt();
        in.nextLine();

        System.out.println("What month is it?");
        month = in.nextLine();

        System.out.println("What year is it?");
        year = in.nextInt();


        printAmerican(day, date, month, year);
        printEuropean(day, date, month, year);

    }

    public static void printAmerican(String day, int date, String month, int year){
        System.out.println("American Format:");
        System.out.println(day + ", " + month +" "+ date + ", " + year);
    }

    public static void printEuropean (String day, int date, String month, int year){
        System.out.println("European Format:");
        System.out.println(day + " " + date + " " + month + " " + year);
    }
}
