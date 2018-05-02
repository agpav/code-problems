package org.code.hackerrank.java.strings;

import java.util.Scanner;

public class JavaStringReverse {

	public static boolean isPalindrome(String s) {
		String reverse = new StringBuilder(s).reverse().toString();
		return s.equals(reverse);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		sc.close();
		/* Enter your code here. Print output to STDOUT. */
		System.out.println(isPalindrome(A) ? "Yes" : "No");
	}
}
