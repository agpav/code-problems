package org.hr.java.strings;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TagContentExtractor {

	static void printWithoutTags(String line) {
		Pattern pattern = Pattern.compile("<(.+?)>([^<>]+)</\\1>");
		Matcher m = pattern.matcher(line);

		if (!m.find()) {
			System.out.println("None");
			return;
		}

		m.reset();
		while (m.find()) {
			System.out.println(m.group(2));
		}
	}

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while (testCases > 0) {
			String line = in.nextLine();

			// Write your code here
			printWithoutTags(line);

			testCases--;
		}
		in.close();
	}
}
