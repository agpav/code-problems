package org.code.hackerrank.java.datastructures;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaSubarray {
	static int getCount(int[] arr) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			List<Integer> list = new ArrayList<>();
			for (int j = i; j < arr.length; j++) {
				list.add(arr[j]);
				int sum = list.stream().mapToInt(Integer::intValue).sum();
				if (sum < 0) {
					count++;
				}
			}
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
		}
		System.out.println(getCount(arr));
		in.close();
	}
}
