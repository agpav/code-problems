package org.code.hackerrank.java.bignumber;

import java.math.BigInteger;
import java.util.Scanner;

public class JavaBigInteger {
	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
		 * class should be named Solution.
		 */
		Scanner in = new Scanner(System.in);
		BigInteger int1 = new BigInteger(in.nextLine());
		BigInteger int2 = new BigInteger(in.nextLine());

		System.out.println(int1.add(int2));
		System.out.println(int1.multiply(int2));
		
		in.close();
	}
}
