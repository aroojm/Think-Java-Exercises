package exercise8g;

public class Main {

    public static void main(String[] args) {
	int k = 24;
	int[] b = {2,3,2,2};
	System.out.println(arePrimeFactors(k, b));
    }

    // method that checks whether a number is prime or not
    public static boolean isPrime(int number){
        for(int i = 2; i < number; i ++){
            if (number % i == 0){
                return false;
            }
        }
        return true;
    }
    // method that checks whether all numbers in an array are prime or not
    public static boolean arePrime(int[] a){
        for(int i = 0; i < a.length; i++) {
            if (!isPrime(a[i])) {
                return false;
            }
        }
        return true;
    }

    // method that returns the product of elements of an array
    public static int product(int[] a){
        int p = 1;
        for(int i = 0; i < a.length; i++){
            p = p * a[i];
        }
        return p;
    }
    // method that returns true if a list of integers are prime & factors of another integer
    public static boolean arePrimeFactors(int n, int[] a){
        int p = product(a);

        if (arePrime(a) && (p == n)){
            return true;
        }
        else {
            return false;
        }
    }
}
