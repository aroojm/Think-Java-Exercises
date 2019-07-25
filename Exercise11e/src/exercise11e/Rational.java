package exercise11e;

public class Rational {
    private int num;
    private int denom;

    // Constructor - no arguments
    public Rational(){
        this.num = 1;
        this.denom = 2;
    }
    // Constructor - arguments
    public Rational(int num, int denom){
        this.num = num;
        this.denom = denom;
    }
    // method to print Rational object in a reasonable format
    public static void printRational(Rational r){
        System.out.println(r.num +"/" + r.denom);
    }

    // toString method
    public  String toString(){
        return String.format("%d / %d \n",this.num,this.denom);
    }

    // modifier - to reverse sign of a rational number
    public void negate(){
        this.denom = -1 * this.denom;
    }

    // modifier - to reciprocate (invert the fraction) a rational number
    public void invert(){
        int x = this.num; // to temporarily save initial value of numerator
        this.num = this.denom;
        this.denom = x;
    }
    // pure method - to convert fraction to a double
    public double toDouble(){
        return ((double)this.num)/((double)this.denom); // data type conversion - num & denom are integers
    }
    // pure method - to reduce a rational number to its lowest terms
    public Rational reduce(){
        int div = gcd(this.num, this.denom);
        return new Rational(this.num/div, this.denom/div);
    }
    // Euclidean algorithm to find gcd of two numbers
    // n = numerator, d = denominator, r = remainder
    public static int gcd(int n, int d){
        int r;
        r = n % d;
        if (r == 0){
            return d;
        } else {
            while (r > 0){
                n = d;
                d = r;
                r = n % d;
            }
            return d;
        }
    }
    // method to add two rational numbers
    public Rational add(Rational that){
        Rational r = new Rational();
        r.denom = this.denom * that.denom;
        r.num = (this.num * that.denom) + (that.num * this.denom);
        return r.reduce();
    }
}
