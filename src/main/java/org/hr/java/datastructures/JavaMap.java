package org.hr.java.datastructures;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class JavaMap {
	public static void main(String[] argh) {
		Map<String, Integer> map = new Hashtable<>();
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.nextLine();
		for (int i = 0; i < n; i++) {
			String name = in.nextLine();
			int phone = in.nextInt();
			in.nextLine();
			map.put(name, phone);
		}
		while (in.hasNext()) {
			String s = in.nextLine();
			find(map, s);
		}
		in.close();
	}

	static void find(Map<String, Integer> map, String name) {

		// not found
		if (!map.containsKey(name)) {
			System.out.println("Not found");
			return;
		}

		// found
		int phone = map.get(name);
		System.out.println(name + "=" + phone);
	}
}
