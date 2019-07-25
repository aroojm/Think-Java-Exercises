package exercise11b;

public class Main {

    public static void main(String[] args) {


        Time mytime = new Time(11, 59, 59.9) ;
        System.out.print(mytime); // print by over-riding toString

        System.out.println("Adding 300 seconds to this time:");

        // invoke the Modifier "increment"
        mytime.increment(300.0) ;
        System.out.print(mytime) ;
    }
}
