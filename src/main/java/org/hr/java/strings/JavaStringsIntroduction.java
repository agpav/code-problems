package org.hr.java.strings;

import java.util.Scanner;

public class JavaStringsIntroduction {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		String B = sc.next();
		/* Enter your code here. Print output to STDOUT. */
		System.out.println(A.length() + B.length());

		int i = A.compareTo(B);
		System.out.println(i > 0 ? "Yes" : "No");

		String s = Character.toUpperCase(A.charAt(0)) + A.substring(1);
		s += " " + Character.toUpperCase(B.charAt(0)) + B.substring(1);
		System.out.println(s);
		sc.close();
	}
}
