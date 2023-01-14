package com.java8.demo.optional;

import java.util.Optional;

import com.java8.demo.lambda.functions.Employee;

public class OptionalExamples {
	
	public OptionalExamples() {
		
		Employee emp = new Employee(10, "PayPal", 12000.00);
		
		Optional<Employee> optional = Optional.ofNullable(emp);
		
		if(optional.isPresent()) {
			System.out.println("Data is present.");
		} else {
			System.out.println("Data isn't present.");
		}
		
		Employee employee = optional.orElseGet(() -> new Employee());
		
	}

	@SuppressWarnings("unused")
	public static void main(String[] args) {	
		OptionalExamples examples = new OptionalExamples();
	}

}
