package org.hr.algorithms.arrays;

import java.util.Scanner;

public class ArrayManipulation {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int N = in.nextInt();
		long[] arr = new long[N + 1];
		int M = in.nextInt();
		for (int i = 0; i < M; i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			long k = in.nextLong();

			arr[a] = arr[a] + k;
			if (b + 1 <= N) {
				arr[b + 1] -= k;
			}
		}

		long max = 0;
		long diff = 0;
		for (int i = 1; i <= N; i++) {
			diff = diff + arr[i];
			max = max < diff ? diff : max;
		}

		System.out.println(max);
	}
}
