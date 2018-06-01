package org.hr.algorithms.arrays;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class SparceArrays {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int N = in.nextInt();
		String[] strArr = new String[N];
		IntStream.range(0, N).forEach(i -> strArr[i] = in.next());

		int Q = in.nextInt();
		IntStream.range(0, Q).forEach($ -> {
			String s = in.next();
			long count = Arrays.stream(strArr).filter(j -> j.equals(s)).count();
			System.out.println(count);
		});
	}
}
