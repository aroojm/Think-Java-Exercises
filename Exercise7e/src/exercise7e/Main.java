package exercise7e;

public class Main {

    public static void main(String[] args) {
     for (double i = 0.1; i <= 100.0; i = i*10.0){
         check(i);
     }
     for (double i = -0.1; i >= -100.0; i = i*10.0){
            check(i);
     }
    }
// method to estimate e^x using infinite series
// parameter x is power in e^x, parameter n is number of terms in series
    public static double myExp(double x, int n){
        double y, z; // calculator variables in loop
        y = 1; //initializing
        z = 1; //initializing
        for (int i=1; i<n; i++){
            y = y * (x/i);
            z = z + y;
        }
        return z;
    }
// method to compare Math.exp and myExp
    public static void check(double x){
        double a, b;
        a = myExp(x, 18); // n chosen manually so that 'a' & 'b' match for x = 1
        b = Math.exp(x);
        System.out.println(x + "\t \t" + a + "\t \t" + b);
    }

}

//// e^x using infinite series ---> two methods - Math.pow & factorial

//    public  static double myExp(double x, int n){
//        double y = 0; // initialize loop calculator variable
//
//        for (int i=0; i<=n; i++){
//            y = y + (Math.pow(x,i))/factorial(i);
//        }
//        return y;
//    }
//// recursive method for factorial - example Ch 6
//    public static int factorial(int n){
//        if (n == 0){
//            return 1;
//        }
//        return n * factorial(n-1);
//    }

