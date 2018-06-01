package org.hr.java.introduction;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class JavaDateandTime {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String month = in.next();
		String day = in.next();
		String year = in.next();
		in.close();
		System.out.println(getDay(day, month, year));
	}

	private static String getDay(String day, String month, String year) {
		LocalDate localDate = LocalDate.of(Integer.parseInt(year), Integer.parseInt(month), Integer.parseInt(day));
		DayOfWeek dayOfWeek = localDate.getDayOfWeek();
		return dayOfWeek.name();
	}
}
