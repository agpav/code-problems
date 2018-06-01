package org.hr.algorithms.arrays;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Scanner;

public class TwoDArray_DS {

	static int hourglass(int[][] matrix) {
		int[] sum = new int[16];

		sum[0] = getSum(matrix, 0, 2, 0, 2);
		sum[1] = getSum(matrix, 1, 3, 0, 2);
		sum[2] = getSum(matrix, 2, 4, 0, 2);
		sum[3] = getSum(matrix, 3, 5, 0, 2);

		sum[4] = getSum(matrix, 0, 2, 1, 3);
		sum[5] = getSum(matrix, 1, 3, 1, 3);
		sum[6] = getSum(matrix, 2, 4, 1, 3);
		sum[7] = getSum(matrix, 3, 5, 1, 3);

		sum[8] = getSum(matrix, 0, 2, 2, 4);
		sum[9] = getSum(matrix, 1, 3, 2, 4);
		sum[10] = getSum(matrix, 2, 4, 2, 4);
		sum[11] = getSum(matrix, 3, 5, 2, 4);

		sum[12] = getSum(matrix, 0, 2, 3, 5);
		sum[13] = getSum(matrix, 1, 3, 3, 5);
		sum[14] = getSum(matrix, 2, 4, 3, 5);
		sum[15] = getSum(matrix, 3, 5, 3, 5);

		OptionalInt oi = Arrays.stream(sum).max();
		return oi.getAsInt();
	}

	static int getSum(int[][] matrix, int r1, int r2, int c1, int c2) {
		int sum = 0;

		for (int i = r1; i <= r2; i++) {
			for (int j = c1; j <= c2; j++) {
				sum += matrix[i][j];
			}
		}

		sum -= matrix[r1 + 1][c1];
		sum -= matrix[r1 + 1][c2];

		return sum;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = 6;
		int[][] matrix = new int[n][n];
		for (int i = 0; i < n; i++) {
			String[] inputLine = scan.nextLine().split(" ");
			for (int j = 0; j < n; j++) {
				matrix[i][j] = Integer.parseInt(inputLine[j]);
			}
		}

		int sum = hourglass(matrix);

		System.out.println(sum);
	}
}
