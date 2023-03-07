package _01_algorithms._3_goofy_names;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 0
 */

import javax.swing.JOptionPane;

public class GoofyNames {
	public static void main(String[] args) {
		String Name = "";

		// 1. Ask the user to enter their name
		
		String goofyname = JOptionPane.showInputDialog("Enter your name");
		int goofy = 1;
		int lenght = goofyname.length();
		int times= 0;
		// 2. Print upper case name to the console using .toUpperCase()
		//    Run your program to see that this works.
		
		// 3. Loop through each character of the name (steps 4 - 7).
		//    HINT: Use .length() to determine the number of characters in the String.

				// 4. Create a char variable to store the next character of the name
				//    use .charAt()
		
		while(times<lenght) {
			if(times % 2 == 0) {
				char c = goofyname.charAt(times);
				Name = Name+Character.toUpperCase(c);
				}
			else {
				char c = goofyname.charAt(times);
				Name = Name+Character.toLowerCase(c);
			}
			times+=1;
			// 5. Use MODULO operator (%) to identify if it is an EVEN or ODD character.
			
			
				// 6. Even characters should be made uppercase and odd characters made lowercase
				//    HINT: use Character.toUpperCase() or Character.toLowerCase()
	
			
				// 7. ADD the char to the end of the goofyName String
		}
			JOptionPane.showMessageDialog(null, Name);
		// 8. Use pop-up to show user their Goofy name

	}
}

