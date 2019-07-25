package exercise6c;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
	boolean b;
	int l, m, n;

	JOptionPane.showMessageDialog(null,"Checking if three integer lengths can make a triangle.");

	l = Integer.parseInt(JOptionPane.showInputDialog("Enter first integer:"));
	m = Integer.parseInt(JOptionPane.showInputDialog("Enter second integer:"));
	n = Integer.parseInt(JOptionPane.showInputDialog("Enter third integer:"));

	b = isTriangle(l, m, n); // assign the return value of isTriangle method to "b"

	JOptionPane.showMessageDialog(null,b);

	System.exit(0);

    }
    // a method that tests if three integers can form a triangle or not
    // Test: If any of the three lengths is greater than the sum of the other two, you cannot form a triangle.
    public static boolean isTriangle (int x, int y, int z){
        if (x+y < z || x+z < y ||  y+z < x) {
            return false;
        }
        else {
            return true;
        }
    }
}
