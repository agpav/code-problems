package org.hr.java.strings;

import java.util.Scanner;

public class ValidUsernameRegularExpression {
	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		int n = Integer.parseInt(scan.nextLine());
		while (n-- != 0) {
			String userName = scan.nextLine();

			if (userName.matches(UsernameValidator.regularExpression)) {
				System.out.println("Valid");
			} else {
				System.out.println("Invalid");
			}
		}
	}
}

class UsernameValidator {
	public static String regularExpression = "^[aA-zZ]\\w{7,29}$";
}