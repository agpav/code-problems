package org.hr.java.strings;

import java.util.Scanner;

public class JavaStringTokens {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine().trim();
		// Write your code here.

		if (s.length() <= 400000) {
			if (s.length() < 1) {
				System.out.println(0);
			} else {
				String[] arr = s.split("[ !,?._'@]+");
				System.out.println(arr.length);

				for (String token : arr) {
					System.out.println(token);
				}
			}
		}
		scan.close();
	}
}
