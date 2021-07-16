package week1.day2.assignments.mandatory;

public class ChangeOddIndexToUpperCase {

	public static void main(String args[]) {

		String str1 = "changeme";
		String str2 = "";

		for (int i = 0; i < str1.length(); i++) {
			int r = i % 2;
			if (r == 0) {
				char c = str1.charAt(i);
				str2 = str2 + c;
				System.out.println("If index is odd " + str2);
			} else {
				char c = str1.charAt(i);
				char uppercase = Character.toUpperCase(str1.charAt(i));
				str2 = str2 + uppercase;
				System.out.println("If index is even " + str2);
			}
		}

	}

	/*
	 * Pseudo Code
	 * 
	 * Declare String Input as Follow
	 * 
	 * String test = "changeme";
	 * 
	 * a) Convert the String to character array
	 * 
	 * b) Traverse through each character (using loop)
	 * 
	 * c)find the odd index within the loop (use mod operator)
	 * 
	 * d)within the loop, change the character to uppercase, if the index is odd
	 * else don't change
	 * 
	 */
}
