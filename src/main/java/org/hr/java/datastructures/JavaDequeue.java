package org.hr.java.datastructures;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class JavaDequeue {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Deque<Integer> deque = new ArrayDeque<>();
		Set<Integer> set = new HashSet<>();

		int n = in.nextInt();
		int m = in.nextInt();

		int max = 0;
		for (int i = 0; i < n; i++) {
			int num = in.nextInt();
			deque.add(num);
			set.add(num);

			if (deque.size() == m) {
				int newMax = set.size();
				max = max < newMax ? newMax : max;
				int first = deque.pop();
				if (!deque.contains(first)) {
					set.remove(first);
				}
			}
		}

		System.out.println(max);
		in.close();
	}
}
