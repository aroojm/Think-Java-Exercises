package exercise8f;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
    int k = 30;
    int[] b = {2,3,5,10,15};

    System.out.println(areFactors(k,b));

    if(areFactors(k,b)){
        System.out.println("The numbers "+ Arrays.toString(b)+" ARE factors of " + k);
    }
    else{
        System.out.println("The numbers "+ Arrays.toString(b)+" ARE NOT factors of " + k);
    }
    }

    public static boolean areFactors(int n, int[] a){
        boolean flag;
        flag = false;

        for(int i = 0; i < a.length; i++){
            if (n % a[i] == 0){
                flag = true;
            }
            else{
                flag = false;
                return flag;
            }
        }
        return flag;
    }
}
