/*
 * Lena Hand
 * 
 * Lab 6 - from English to Pig Latin
 * October 27, 2017
 */

import java.util.Scanner;

public class EnglishToPigLatin {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String userWord = "y";

		userWord = getString(sc, "Please enter a word: ");
		
		userWord = userWord.toLowerCase();

		if (isVowel(userWord) == true) {
			userWord = appendLatin(userWord, "way");
		} else {
			 while (isVowel(userWord) == false) {
			userWord = appendC(userWord);
			 }
			userWord = appendLatin(userWord, "ay");
		}

		System.out.println("Your word is now: " + userWord);

		sc.close();

	}

	public static String getString(Scanner sc, String prompt) {
		System.out.print(prompt);
		String s = sc.next(); // read user entry
		sc.nextLine(); // discard any other data entered on the line
		return s;
	}

	public static boolean isVowel(String word) {

		boolean isVowel = false;
		char ch = '-';

		ch = word.charAt(0);

		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			isVowel = true;
		} else {
			isVowel = false;
		}
		return isVowel;
	}

	public static String appendLatin(String input, String fixed) {

		return input + fixed;
	}

	public static String appendC(String input) {

		String a = input.substring(0);
		String b = input.substring(1, input.length() - 1);
		input = b + a;

		return input;
	}

}
