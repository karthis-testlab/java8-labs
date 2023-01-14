package com.java8.demo.lambda.functions;

import java.util.function.Supplier;

public class SupplierExamples {
	
	public SupplierExamples() {
		
		Supplier<Employee> supplier = () -> new Employee(6, "EPAM Systems", 43222.09);
		System.out.println(supplier.get());
		
	}

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		SupplierExamples examples = new SupplierExamples();
	}

}
