package org.hr.ds.arrays;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class LeftRotation {
	static void rotateByOne(int[] arr) {
		int temp = arr[0];
		IntStream.range(0, arr.length - 1).forEach(i -> arr[i] = arr[i + 1]);
		arr[arr.length - 1] = temp;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int d = in.nextInt();
		int[] arr = Arrays.stream(new int[n]).map(i -> in.nextInt()).toArray();
		IntStream.range(0, d).forEach($ -> rotateByOne(arr));
		Arrays.stream(arr).forEach(s -> System.out.print(s + " "));
		in.close();
	}
}
