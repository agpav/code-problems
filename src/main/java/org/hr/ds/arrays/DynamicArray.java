package org.hr.ds.arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DynamicArray {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int Q = in.nextInt();

		List<Integer>[] seqList = new ArrayList[N];
		for (int i = 0; i < N; i++) {
			seqList[i] = new ArrayList<>();
		}

		int lastAnswer = 0;

		for (int i = 0; i < Q; i++) {
			int n = in.nextInt();
			int x = in.nextInt();
			int y = in.nextInt();

			int seq = (x ^ lastAnswer) % N;
			List<Integer> list = seqList[seq];

			if (n == 1) {
				list.add(y);
			} else {
				lastAnswer = list.get(y % list.size());
				System.out.println(lastAnswer);
			}
		}
	}
}
