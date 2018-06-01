package org.hr.java.datastructures;

import java.util.BitSet;
import java.util.Scanner;

public class JavaBitSet {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int M = in.nextInt();

		BitSet B1 = new BitSet(N);
		BitSet B2 = new BitSet(N);

		for (int i = 0; i < M; i++) {
			String op = in.next();
			int x = in.nextInt();
			int y = in.nextInt();

			BitSet left = x == 1 ? B1 : B2;
			BitSet right = y == 1 ? B1 : B2;

			switch (op) {
			case "AND":
				left.and(right);
				break;
			case "OR":
				left.or(right);
				break;
			case "XOR":
				left.xor(right);
				break;
			case "SET":
				left.set(y);
				break;
			case "FLIP":
				left.flip(y);
				break;
			}

			System.out.println(B1.cardinality() + " " + B2.cardinality());
		}
		
		in.close();
	}
}
