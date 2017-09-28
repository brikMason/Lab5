package lab5;

import java.util.Scanner;

public class Palindrome {
	
	/**
	 * This method tests if an input is a palindrome.
	 * 
	 * @author wesmaxwell
	 * @param args
	 * @since 2017-09-28
	 */
	
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter a word, sentence, or number: ");
		String pal = input.nextLine();
		input.close();
		if (isaPalindrome(pal))
			System.out.println("'" + pal +  "'" + " is a palindrome.");
		else
			System.out.println("'" + pal +  "'"  + " is not a palindrome.");

	}

	public static boolean isaPalindrome(String expr) {

		// Ignores punctuation and sets everything to lower case.
		expr = expr.replaceAll("[^a-zA-Z ]", "").toLowerCase();
		// Adds ability to test sentences. Removes the spaces...
		expr = expr.replaceAll("\\s+","");

		// Considering any string length 0 or 1 to be a palindrome.
		if (expr.length() == 0 || expr.length() == 1)
			return true;
		// Test first == last character, return substring if true
		if (expr.charAt(0) == expr.charAt(expr.length() - 1)) {
			return isaPalindrome(expr.substring(1, expr.length() - 1));
		}
		//
		else {
			return false;
		}

	}
}
