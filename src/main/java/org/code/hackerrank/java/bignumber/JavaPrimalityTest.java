package org.code.hackerrank.java.bignumber;

import java.math.BigInteger;
import java.util.Scanner;

public class JavaPrimalityTest {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		BigInteger n = in.nextBigInteger();
		in.close();
		// Write your code here.

		if (n.isProbablePrime(100)) {
			System.out.println("prime");
		} else {
			System.out.println("not prime");
		}
	}
}
