package org.code.hackerrank.java.introduction;

import java.util.Scanner;

public class JavaStdinandStdoutI {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		scan.close();

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}
