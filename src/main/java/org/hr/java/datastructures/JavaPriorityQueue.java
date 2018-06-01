package org.hr.java.datastructures;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

class Student1 {
	private int token;
	private String fname;
	private double cgpa;

	public Student1(int id, String fname, double cgpa) {
		super();
		this.token = id;
		this.fname = fname;
		this.cgpa = cgpa;
	}

	public int getToken() {
		return token;
	}

	public String getFname() {
		return fname;
	}

	public double getCgpa() {
		return cgpa;
	}
}

public class JavaPriorityQueue {
	public static void main(String[] args) {

		PriorityQueue<Student1> list = new PriorityQueue<>(Comparator.comparing(Student1::getCgpa).reversed()
				.thenComparing(Student1::getFname).thenComparing(Student1::getToken));

		Scanner in = new Scanner(System.in);
		int totalEvents = Integer.parseInt(in.nextLine());
		while (totalEvents > 0) {
			String event = in.next();
			switch (event) {
			case "ENTER":
				String fname = in.next();
				double cgpa = in.nextDouble();
				int token = in.nextInt();
				Student1 s = new Student1(token, fname, cgpa);
				list.add(s);
				break;
			case "SERVED":
				if (!list.isEmpty()) {
					list.remove();
				}
				break;
			}
			totalEvents--;
		}

		if (list.isEmpty()) {
			System.out.println("EMPTY");
		} else {
			while (!list.isEmpty()) {
				System.out.println(list.remove().getFname());
			}
		}
		in.close();
	}
}
