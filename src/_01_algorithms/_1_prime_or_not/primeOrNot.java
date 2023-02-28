package _01_algorithms._1_prime_or_not;

import javax.swing.JOptionPane;

public class primeOrNot {
	public static void main(String[] args) {
String primeString = JOptionPane.showInputDialog("Give me a number");
int primeNum = Integer.parseInt(primeString);
int startNum = primeNum-=1;
while(startNum>1) {
if(primeNum%startNum == 0) {
	JOptionPane.showMessageDialog(null,"Your number is not prime");
	primeNum-=1;
	System.exit(1);
}
else {
	JOptionPane.showMessageDialog(null, "Your number is prime");
	System.exit(1);
}




}
















}
}