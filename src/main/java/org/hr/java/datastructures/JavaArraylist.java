package org.hr.java.datastructures;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaArraylist {
	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
		 * class should be named Solution.
		 */
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.nextLine();
		List<Integer>[] arr = new ArrayList[n];

		for (int i = 0; i < n; i++) {
			arr[i] = new ArrayList<>();
			String[] inputLine = in.nextLine().split(" ");
			for (String s : inputLine) {
				arr[i].add(Integer.parseInt(s));
			}
		}

		int d = in.nextInt();
		in.nextLine();

		for (int i = 0; i < d; i++) {
			int x = in.nextInt() - 1;// 0 based
			int y = in.nextInt();
			try {
				n = arr[x].get(y);
				System.out.println(n);
			} catch (Exception e) {
				System.out.println("ERROR!");
			}
			in.nextLine();
		}
		
		in.close();
	}
}
