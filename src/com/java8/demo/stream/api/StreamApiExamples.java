package com.java8.demo.stream.api;

import java.util.ArrayList;
import java.util.List;

public class StreamApiExamples {

	public StreamApiExamples() {
		
		List<Employee> empList = new ArrayList<Employee>();
		Employee emp = new Employee(1, "Google", 22435.63);
		Employee emp1 = new Employee(2, "Meta", 32435.63);
		Employee emp2 = new Employee(3, "Google", 12435.63);
		Employee emp3 = new Employee(4, "Microsoft", 62435.63);
		Employee emp4 = new Employee(5, "Google", 25435.63);
		empList.add(emp);
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		empList.add(emp4);
		
		// Filter google employee and find sum of its salary
		double result = empList.stream().filter((empFilter) -> empFilter.getOrgName().equals("Google"))
				        .peek((empOrg) -> System.out.println(empOrg))
		                .mapToDouble((empMap) -> empMap.getSalary())
		                .peek((empSal) -> System.out.println(empSal))
		                .sum();
		
		System.out.println(result);
		
	}

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		StreamApiExamples examples = new StreamApiExamples();
	}

}