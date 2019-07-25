package exercise6e;

public class Main {

    public static void main(String[] args) {
	boolean flag1 = isHoopy(202);
	boolean flag2 = isFrabjuous(202);
	System.out.println(flag1);
	System.out.println(flag2);
	if (flag1 && flag2){
	    System.out.println("ping!");
    }
    if (flag1 || flag2) {
	    System.out.println("pong!");
    }
    }
    // method that returns "true" if input integer is even, else returns "false"
    public static boolean isHoopy(int x){
        boolean hoopyFlag;
        if (x % 2 == 0) {
           hoopyFlag = true;
        }
        else {
            hoopyFlag = false;
        }
        return hoopyFlag;
    }
    // method that returns "true" if input integer is greater than 0, else returns "false"
    public static boolean isFrabjuous (int x){
        boolean frabjuousFlag;
        if (x > 0) {
            frabjuousFlag = true;
        }
        else {
            frabjuousFlag = false;
        }
        return frabjuousFlag;
    }
}
