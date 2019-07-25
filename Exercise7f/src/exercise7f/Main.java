package exercise7f;

public class Main {

    public static void main(String[] args) {
        System.out.println(gauss(0.2,5));
    }
    //  method to estimate e^(-x^2) using infinite series
// parameter x is power in e^(-x^2), parameter n is number of terms in series
    public static double gauss(double x, int n){
        double y, z; // calculator variables in loop
        y = 1; //initializing
        z = 1; //initializing
        for (int i=1; i<n; i++){
            y = y * (-(x*x)/i);
            z = z + y;
        }
        return z;
    }
}


