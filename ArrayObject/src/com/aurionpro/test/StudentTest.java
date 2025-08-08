package com.aurionpro.test;

import java.util.Scanner;

import com.aurionpro.model.Student;

public class StudentTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of students");
		int number = scanner.nextInt();
		scanner.nextLine();
		Student[] students = new Student[number];
		for(int i = 0; i<number; i++) {
			System.out.println("Enter student name");
			String name = scanner.nextLine();
			System.out.println("Enter student roll number");
			int rollnum = scanner.nextInt();
			scanner.nextLine();
			System.out.println("Enter student marks");
			double marks = scanner.nextDouble();
			scanner.nextLine();
			students[i] = new Student(name, rollnum, marks);
		}
		for(Student info: students) {
		info.display();	
		}
	}

}
