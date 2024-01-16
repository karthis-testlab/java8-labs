package com.java8.demo.stream.api;

import java.util.ArrayList;
import java.util.List;

public class StreamApiExamples {

	public StreamApiExamples() {
		
		List<Employees> empList = new ArrayList<Employees>();
		Employees emp = new Employees(1, "Google", 22435.63);
		Employees emp1 = new Employees(2, "Meta", 32435.63);
		Employees emp2 = new Employees(3, "Google", 12435.63);
		Employees emp3 = new Employees(4, "Microsoft", 62435.63);
		Employees emp4 = new Employees(5, "Google", 25435.63);
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