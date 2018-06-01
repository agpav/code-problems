package org.hr.java.datastructures;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaList {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			int x = scan.nextInt();
			list.add(x);
		}

		n = scan.nextInt();
		for (int i = 0; i < n; i++) {
			String query = scan.next();
			switch (query) {
			case "Insert":
				int x = scan.nextInt();
				int y = scan.nextInt();
				list.add(x, y);
				break;
			case "Delete":
				x = scan.nextInt();
				list.remove(x);
			}
		}

		for (int i : list) {
			System.out.print(i + " ");
		}
		scan.close();
	}
}
