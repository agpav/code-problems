package org.code.hackerrank.java.strings;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class JavaAnagrams {

	static boolean isAnagram(String a, String b) {
		// Complete the function
		Map<Character, Integer> firstMap = parse(a);
		Map<Character, Integer> secondMap = parse(b);

		boolean result1 = checkFromMap(firstMap, secondMap);
		boolean result2 = checkFromMap(secondMap, firstMap);

		return result1 && result2;
	}

	static boolean checkFromMap(Map<Character, Integer> firstMap, Map<Character, Integer> secondMap) {
		for (char ch : firstMap.keySet()) {

			// if does not exists in second map
			if (secondMap.get(ch) == null) {
				return false;
			}

			// exists but count is greater
			if (firstMap.get(ch) > secondMap.get(ch)) {
				return false;
			}
		}

		return true;
	}

	static Map<Character, Integer> parse(String input) {
		Map<Character, Integer> map = new Hashtable<>();
		for (char ch : input.toLowerCase().toCharArray()) {
			Integer count = map.get(ch);
			if (count == null) {
				map.put(ch, 1);
			} else {
				map.put(ch, ++count);
			}
		}

		return map;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String b = scan.next();
		scan.close();
		boolean ret = isAnagram(a, b);
		System.out.println(ret ? "Anagrams" : "Not Anagrams");
	}
}
