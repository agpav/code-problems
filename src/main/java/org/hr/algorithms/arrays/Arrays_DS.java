package org.hr.algorithms.arrays;

import java.util.Scanner;

public class Arrays_DS {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.nextLine());
		String[] inputLine = scan.nextLine().split(" ");
		for (int i = n - 1; i >= 0; i--) {
			System.out.print(inputLine[i] + " ");
		}
		scan.close();
	}

}
