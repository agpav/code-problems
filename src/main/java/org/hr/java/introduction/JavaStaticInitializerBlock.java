package org.hr.java.introduction;

import java.util.Scanner;

public class JavaStaticInitializerBlock {

	static boolean flag = true;
	static int B;
	static int H;

	static {
		Scanner scan = new Scanner(System.in);
		B = scan.nextInt();
		H = scan.nextInt();

		if (B <= 0 || H <= 0) {
			flag = false;
			System.out.print("java.lang.Exception: Breadth and height must be positive");
		}
		scan.close();
	}

	public static void main(String[] args) {
		if (flag) {
			int area = B * H;
			System.out.print(area);
		}

	}// end of main

}// end of class
