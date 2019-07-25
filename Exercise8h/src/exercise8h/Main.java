package exercise8h;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

	int[] c = {0,11,12,13,4,5,6,7,8,9,10};
	int high = 7;
	int low = 10;
	System.out.println(maxInRange(c, high, low)); // find max value in given range
	System.out.println(max(c)); // find max value in the whole array
    }

    public static int maxInRange(int[] a, int low, int high) {
        int max;
        int l = low;
// Base Case
        if (low == high){
            return a[low];
        }
        else
            {max = maxInRange(a, l+1, high); // Recursive call, returned value is assigned to max
                                                  // then compared with new lower range element
                if (max < a[low]){
                    max = a[low];
                }
                return max;
        }
    }

    public static int max(int[] b){
        int largest;
        largest = maxInRange(b, 0, b.length-1);
        return largest;
    }
}
