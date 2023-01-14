package com.java8.demo.method.reference;

import com.java8.demo.lambda.functions.Employee;

@FunctionalInterface
public interface TriFunction {
	
	public Employee create(int id, String orgName, double salary);

}