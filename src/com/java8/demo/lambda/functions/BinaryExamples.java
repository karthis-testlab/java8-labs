package com.java8.demo.lambda.functions;

import java.util.function.BinaryOperator;

public class BinaryExamples {
	
	public BinaryExamples() {
		
		Employee employee = new Employee();
		employee.setSalary(100.00);
		
		BinaryOperator<Double> binOp = (empOneSal, empTwoSal) -> empOneSal + empTwoSal;
		Double result = binOp.apply(employee.getSalary(), employee.getSalary());
		System.out.println(result);
		
	}

	@SuppressWarnings("unused")
	public static void main(String[] args) {	
		BinaryExamples examples = new BinaryExamples();
	}

}
