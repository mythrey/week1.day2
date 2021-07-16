package week1.day2.assignments.optional;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {

		String text1 = "cat";
		String text2 = "act";

		int text1length = text1.length();
		System.out.println("text1 length is " + text1length);

		int text2length = text2.length();
		System.out.println("text2 length is " + text2length);

		if (text1length == text2length) {
			char[] c = text1.toCharArray();
			char[] d = text2.toCharArray();
			for (int i = 0; i < c.length; i++) {
				System.out.println("text1 Character of " + i + " is: " + c[i]);
			}
			System.out.println("************************");

			for (int i = 0; i < d.length; i++) {

				System.out.println("text1 Character of " + i + " is: " + d[i]);
			}

			System.out.println("************************");

			Arrays.sort(c);
			for (int i = 0; i < c.length; i++) {
				System.out.println("Sorted array of text1 is " + c[i]);
			}

			System.out.println("************************");
			int flag = 0;
			Arrays.sort(d);
			for (int i = 0; i < d.length; i++) {
				System.out.println("Sorted array of text2 is " + d[i]);

			}
			for (int j = 0; j < c.length; j++) {
				if (c[j] != d[j]) {
					System.out.println("Not an Anagram");
					flag = 1;
					break;
				}

			}
			if (flag == 0) {
				System.out.println("The given string: " + text1 + " is an anagram");
			}

			// System.out.println("The given string values are not equal");

			// TODO Auto-generated method stub
			/*
			 * Pseudo Code
			 * 
			 * Declare a String String text1 = "stops"; Declare another String String text2
			 * = "potss"; a) Check length of the strings are same then (Use A Condition) b)
			 * Convert both Strings in to characters c) Sort Both the arrays d) Check both
			 * the arrays has same value
			 * 
			 */
		} else {
			System.out.println("The given string values are not equal");
		}
	}
}
