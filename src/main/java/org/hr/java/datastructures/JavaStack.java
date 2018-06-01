package org.hr.java.datastructures;

import java.util.Scanner;
import java.util.Stack;

public class JavaStack {
	static boolean check(String s) {
		Stack<String> stk = new Stack<>();

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == '{' || c == '(' || c == '[') {
				stk.push(c + "");
			}

			if (c == '}' || c == ')' || c == ']') {
				if (stk.isEmpty()) {
					return false;
				}

				String str = stk.pop();

				if (c == '}' && !str.equals("{")) {
					return false;
				}

				if (c == ')' && !str.equals("(")) {
					return false;
				}

				if (c == ']' && !str.equals("[")) {
					return false;
				}
			}
		}

		return stk.isEmpty();

	}

	public static void main(String[] argh) {
		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {
			String input = sc.next();
			// Complete the code
			System.out.println(check(input));
		}
		sc.close();
	}
}
