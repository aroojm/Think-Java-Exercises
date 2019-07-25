package exercise6d;

public class Main {

    public static void main(String[] args) {
	double n;

	// invoke multAdd for simple input
	n = multAdd(1.0,2.0,3.0);
	System.out.print("The multadditionization of 1.0, 2.0 and 3.0 is ");
	System.out.printf("%.3f", n);
	System.out.println(); System.out.println();

	// invoke multAdd to compute (sin pi/4) +(cos pi/4)/2
	n = multAdd(0.5, Math.cos(Math.PI/4.0), Math.sin(Math.PI/4.0));
	System.out.print("sin (pi/4) + (1/2) cos (pi/4) = ");
	System.out.printf("%.3f", n);
	System.out.println(); System.out.println();

	// invoke multAdd to compute log 10 + log 20
	n = multAdd(1.0, Math.log(10.0), Math.log(20.0));
	System.out.print("log 10 + log 20 = ");
	System.out.printf("%.3f",n);
	System.out.println(); System.out.println();

	// invoke expSum to compute xe^(-x) + sqrt(1-e^(-x))
	n = expSum(1.0);
	System.out.print("When x = 1,  xe^(-x) + sqrt(1-e^(-x)) = ");
	System.out.printf("%.3f ",n);
    }
    // a method that returns a*b+c where a,b,c are double
    public static double multAdd(double a, double b, double c){
       double result;
       result = (a*b+c);
       return result;
    }
    // a method that uses multAdd to compute xe^(-x) + sqrt(1-e^(-x))
    public static double expSum (double x){
        double a, b, c, result;
        a = x;
        b = Math.exp(-x);
        c = Math.sqrt(1-b);
        result = multAdd(a, b,c);
        return result;
    }
}
