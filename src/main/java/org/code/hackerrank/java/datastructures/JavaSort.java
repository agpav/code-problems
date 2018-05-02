package org.code.hackerrank.java.datastructures;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class Student {
	private int id;
	private String fname;
	private double cgpa;

	public Student(int id, String fname, double cgpa) {
		super();
		this.id = id;
		this.fname = fname;
		this.cgpa = cgpa;
	}

	public int getId() {
		return id;
	}

	public String getFname() {
		return fname;
	}

	public double getCgpa() {
		return cgpa;
	}
}

public class JavaSort {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());

		List<Student> studentList = new ArrayList<Student>();
		while (testCases > 0) {
			int id = in.nextInt();
			String fname = in.next();
			double cgpa = in.nextDouble();

			Student st = new Student(id, fname, cgpa);
			studentList.add(st);

			testCases--;
		}

		Collections.sort(studentList, new Comparator<Student>() {
			public int compare(Student a, Student b) {
				int compare = -1 * Double.compare(a.getCgpa(), b.getCgpa());// reverse
				if (compare == 0) {
					compare = a.getFname().compareTo(b.getFname());
				}
				if (compare == 0) {
					compare = Integer.compare(a.getId(), b.getId());
				}
				return compare;
			}
		});

		for (Student st : studentList) {
			System.out.println(st.getFname());
		}
		
		in.close();
	}
}
