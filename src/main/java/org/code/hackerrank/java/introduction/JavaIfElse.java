package org.code.hackerrank.java.introduction;

import java.util.Scanner;

public class JavaIfElse {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		
		String ans = "";
		if (n % 2 == 1) {
			ans = "Weird";
		} else {
			if (n >= 2 && n <= 5) {
				ans = "Not Weird";
			} else if (n >= 6 && n <= 20) {
				ans = "Weird";
			} else if (n > 20) {
				ans = "Not Weird";
			}
		}
		System.out.println(ans);

	}
}
