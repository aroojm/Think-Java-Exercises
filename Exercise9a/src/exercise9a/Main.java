package exercise9a;

public class Main {

    public static void main(String[] args) {
	String s1, s2;
	char c1, c2;
	int i1, i2;
	double d1, d2;
	boolean b1, b2;

	s1 = "pple";
	s2 = "";
	c1 = 'A';
	c2 = 'B';
	i1 = 1;
	i2 = 2;
	d1 = 0.5;
	d2 = 1.5;
	b1 = true;
	b2 = false;


//Question part 2
	// print & then check types for: variable1 + variable2 (of same or different types)
	System.out.println(s1+b2);
    System.out.println(((Object)(s1+b2)).getClass().getName());

//Question part 3
        c2 ++;
        System.out.println(c2);

//Question part 4
        System.out.println(s2+i2);
    }
}
