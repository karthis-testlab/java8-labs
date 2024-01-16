package com.java8.interview.qa;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StudentApplication {

	public static void main(String[] args) {

		List<Student> students = Stream.of(
				new Student(1, "Rohit", 30, "Male", "Mechanical Engineering", "Mumbai", 122, Arrays.asList("+919876543210")),
				new Student(2, "Pulkit", 56, "Male", "Computer Engineering", "Delhi", 67, Arrays.asList("+919876543211")),
				new Student(3, "Ankit", 25, "Female", "Mechanical Engineering", "Kerala", 164, Arrays.asList("+919876543212")),
				new Student(4, "Satish Ray", 30, "Male", "Mechanical Engineering", "Kerala", 26, Arrays.asList("+919876543213")),
				new Student(5, "Roshan", 23, "Male", "Biotech Engineering", "Mumbai", 12, Arrays.asList("+919876543214")),
				new Student(6, "Chetan", 24, "Male", "Mechanical Engineering", "Karnataka", 90, Arrays.asList("+919876543215")),
				new Student(7, "Arun", 26, "Male", "Electronics Engineering", "Karnataka", 324, Arrays.asList("+919876543216")),
				new Student(8, "Nam", 31, "Male", "Computer Engineering", "Karnataka", 433, Arrays.asList("+919876543217")),
				new Student(9, "Sonu", 27, "Female", "Computer Engineering", "Karnataka", 7, Arrays.asList("+919876543218")),
				new Student(10, "Shubham", 26, "Male", "Instrumentation Engineering", "Mumbai", 98, Arrays.asList("+919876543219")),
				new Student(11, "Tharika", 22, "Female", "Information Technology", "Tamil Nadu", 1, Arrays.asList("+919876543220"))
				).collect(Collectors.toList());
		
		System.out.println(students);
		
		// 1. Find the list of students whose rank is in between 50 and 100
		
		List<Student> rankBetween50And100 = students.stream().filter(student -> student.getRank() > 50 && student.getRank() < 100)
		                                                     .collect(Collectors.toList());
		
		System.out.println(rankBetween50And100);
		
		// 2. Find the students who stays in the Karnataka and sort them by their name
		
		List<Student> studentByCity = students.stream().filter(student -> student.getCity().equals("Karnataka"))
		                                               .sorted(Comparator.comparing(Student::getFirstName))
		                                               .collect(Collectors.toList());
		
		System.out.println(studentByCity);

	}

}
