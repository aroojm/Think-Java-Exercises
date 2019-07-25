package exercise8b;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	int[] a = {1,5,2,3,4,5,5,5,5,};

	System.out.println(banana(a));

	System.out.println(grapefruit(a,5));

	System.out.println(pineapple(a,5));

    }
// method that returns the product of all elements of an array
    public static int banana(int[] a) {
        int kiwi = 1;
        int i = 0;
        while (i < a.length) {
            kiwi = kiwi * a[i];
            i++;
        }
        return kiwi;
    }

// method that checks if an integer is present in an array
// If present (at the first instance), returns the index of the element
// If not present, returns -1
    public static int grapefruit(int[] a, int grape) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == grape) {
                return i;
            }
        }
        return -1;
    }
// method that counts how many times an integer is present in an array
    public static int pineapple(int[] a, int apple) {
        int pear = 0;
        for (int pine: a) {
            if (pine == apple) {
                pear++;
            }
        }
        return pear;
    }
}

