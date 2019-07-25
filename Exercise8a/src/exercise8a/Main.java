package exercise8a;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
// for part 1 of question
    double[] a = {1,2,3,4,5,6,7,8,9,10};

    System.out.println(Arrays.toString(powArray(a, 3)));

// for part 2 of question
// create an array of 25 random scores from 0 to 100 (not included)
    Random rndm = new Random();
    int[] b = new int[25];
    for (int i=0; i<b.length; i++){
        b[i] = rndm.nextInt(100);
    }
    System.out.println("Scores of 25 students are:");
    System.out.println(Arrays.toString(b));

    System.out.println("Histogram for scores:");
    System.out.println(Arrays.toString(histogram(b,100)));
    }
// method for part 1 of question
// method that takes an array & integer n --> retruns an array with elements raised to n of original array
    public static double[] powArray(double[] a, int n){
        for (int i=0; i<a.length; i++){
            a[i] = Math.pow(a[i],n);
        }
        return a;
    }
// method for part 2 of quesion
// method that returns a histogram for 100 scores

    public static int[] histogram(int[] scores, int counter){
        int[] count = new int[counter];
        for (int score: scores){
            count[score]++;
        }
        return count;
    }
}
