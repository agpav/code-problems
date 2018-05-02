package org.code.hackerrank.java.introduction;

import java.util.Scanner;

public class JavaLoopsI {
	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
		 * class should be named Solution.
		 */
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();
		for (int i = 1; i <= 10; i++) {
			System.out.println(n + " x " + i + " = " + n * i);
		}
	}
}
