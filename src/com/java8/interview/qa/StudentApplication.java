package com.java8.interview.qa;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
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
		
		// 3. Find the students who stays in the Karnataka and sort them by their name in descending order
		
		List<Student> studentByCity_descendingOrder = students.stream().filter(student -> student.getCity().equals("Karnataka"))
                .sorted(Comparator.comparing(Student::getFirstName, Comparator.reverseOrder()))
                .collect(Collectors.toList());
		
		System.out.println(studentByCity_descendingOrder);
		
		// 4. Find all departments names
		
		List<String> departments = students.stream().map(Student::getDept)
				                                    .collect(Collectors.toList());
		
		System.out.println(departments);
		
		// 5. Find unique departments name using distinct method
		
		List<String> departments_distinct = students.stream().map(Student::getDept)
				                                           .distinct()
                                                           .collect(Collectors.toList());
		
		System.out.println(departments_distinct);
		
		// 6. Find unique departments name using Set collection
		
		Set<String> departments_set = students.stream().map(Student::getDept)
                                                        .collect(Collectors.toSet());
		
		System.out.println(departments_set);
		
		// 7. Find all contact number from the students list
		
		List<String> contacts = students.stream().flatMap(student -> student.getContacts().stream())
				                                 .collect(Collectors.toList());
		                  
		System.out.println(contacts);
		
		// one to one relationship -> map
		// one to many relationship -> flatMap
		
		// 8. Group the student by department name
		
		Map<String, List<Student>> groupByDeptName = students.stream()
				                                     .collect(Collectors.groupingBy(Student::getDept));
		
		System.out.println(groupByDeptName);
		
		// 9. Group and count the number of students by department name
		
		Map<String, Long> groupByDeptName_count = students.stream()
                .collect(Collectors.groupingBy(Student::getDept, Collectors.counting()));
		
		System.out.println(groupByDeptName_count);
		
		// 10. Get Maximum student department name and count
		
		Entry<String, Long> entry = students.stream()
        .collect(Collectors.groupingBy(Student::getDept, Collectors.counting()))
        .entrySet().stream().max(Map.Entry.comparingByValue()).get();
		
		System.out.println(entry);
		
		// 11. Find the average age of male and female students
		
		Map<String, Double> averageAgeByGender = students.stream().collect(Collectors
				        .groupingBy(Student::getGender, Collectors.averagingDouble(Student::getAge)));
		
		System.out.println(averageAgeByGender);
		
		// 12. Find the highest rank in each department
		
		Map<String, Optional<Student>> rankByDept = students.stream().collect(Collectors
				.groupingBy(Student::getDept, Collectors.maxBy(Comparator.comparing(Student::getRank))));
		
		System.out.println(rankByDept);
		

	}

}
