package week1.day2.assignments.mandatory;

public class Palindrome {
	// Build a logic to find the given string is palindrome or not

	/*
	 * Pseudo Code
	 * 
	 * a) Declare A String value as"madam"
	 * 
	 * b) Declare another String rev value as "" c) Iterate over the String in
	 * reverse order d) Add the char into rev e) Compare the original String with
	 * the reversed String, if it is same then print palinDrome
	 * 
	 * Hint: Use .equals or .equalsIgnoreCase when you compare a String
	 */
	public static void main(String args[]) {

		String originalstring = "madam";
		String reverse = "";

		for (int i = originalstring.length() - 1; i >= 0; i--) {
			// System.out.println("Original string value is " +originalstring.charAt(i));
			char a = originalstring.charAt(i);
			reverse = reverse + a;
			System.out.println("The value of a is " + a);
			System.out.println("The value of reverse is " + reverse);
		}
		System.out.println(originalstring.equals(reverse));
		if (originalstring.equals(reverse)) {
			System.out.println("It is palindrome");
		} else {
			System.out.println("It is not a palindrome");
		}
	}
}
