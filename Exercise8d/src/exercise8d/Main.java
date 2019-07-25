package exercise8d;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

// creating an int array with 10 random integers 0 to 99
	int[] a = new int[10];
	Random rndm = new Random();

	for (int i = 0; i < a.length; i++){
	    a[i] = rndm.nextInt(100);
        }
    System.out.println(Arrays.toString(a));

    System.out.println(indexOfMax(a));
    }

// method that returns index of largest element from an array
   public static int indexOfMax(int[] b){
        int index = 0; //initializing
        int element = 0;

        for (int n=0; n < b.length; n++){

            if (b[n] > element){
                element = b[n];
                index = n;
            }
        }
       return index;
   }
}
