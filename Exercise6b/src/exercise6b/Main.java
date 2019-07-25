package exercise6b;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
	int x, y;
	boolean b;

	//System.out.println("Testing whether integer 'n' is divisible by integer 'm'.");

	JOptionPane.showMessageDialog(null, "Testing whether integer 'n' is divisible by integer 'm'.");

	x = Integer.parseInt(JOptionPane.showInputDialog("Enter first integer:"));

	y = Integer.parseInt(JOptionPane.showInputDialog("Enter second integer:"));

	b = isDivisible(x, y);

	JOptionPane.showMessageDialog(null, b);

	//System.out.println(b);


	System.exit(0);
    }
    public static boolean isDivisible (int n, int m) {
        if (n % m == 0){
            return true;
        }
        else {
            return false;
        }
    }
}
