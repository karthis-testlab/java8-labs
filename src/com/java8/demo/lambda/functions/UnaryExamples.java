package com.java8.demo.lambda.functions;

import java.util.function.UnaryOperator;

public class UnaryExamples {
	
	public UnaryExamples() {
		
		UnaryOperator<Employee> addOrgName = (vEmp) -> {
			vEmp.setOrgName("PayPal");
			return vEmp;
		};
		
		Employee emp = addOrgName.apply(new Employee());
		System.out.println(emp);
		
	}

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		UnaryExamples examples = new UnaryExamples();
	}

}
