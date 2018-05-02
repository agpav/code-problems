package org.code.hackerrank.java.exceptionhandling;

import java.util.Scanner;

public class JavaExceptionHandlingTrycatch {
	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
		 * class should be named Solution.
		 */
		Scanner scan = new Scanner(System.in);
		String x = scan.next();
		String y = scan.next();

		try {
			int ix = Integer.parseInt(x);
			int iy = Integer.parseInt(y);
			System.out.println(ix / iy);
		} catch (NumberFormatException e) {
			System.out.println("java.util.InputMismatchException");
		} catch (Exception e) {
			System.out.println("java.lang.ArithmeticException: / by zero");
		}
		scan.close();
	}
}
