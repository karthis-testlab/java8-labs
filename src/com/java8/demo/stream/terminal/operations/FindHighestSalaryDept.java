package com.java8.demo.stream.terminal.operations;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindHighestSalaryDept {

	public static void main(String[] args) {

		List<Employees> employees = Stream.of(
				  new Employees(1, "Basnat", "Dev", 50000), 
				  new Employees(2, "Santosh", "Dev", 80000),
				  new Employees(3, "Pratink", "QA", 60000), 
				  new Employees(4, "Dipak", "QA", 90000),
				  new Employees(5, "Biaksh", "DevOps", 40000)
				  ).collect(Collectors.toList());
				
		
		// Approach 1
		Comparator<Employees> compareBySalary = Comparator.comparing(Employees::getSalary);
		System.out.println(employees.stream().collect(Collectors.groupingBy(Employees::getDeptName)));
		
		Map<String, Optional<Employees>> approach1 = employees.stream().collect(
				          Collectors.groupingBy(Employees::getDeptName, 
				          Collectors.reducing(BinaryOperator.maxBy(compareBySalary))));
		
		System.out.println(approach1);
		
		// Approach 2
		Map<String, Employees> approach2 = employees.stream().collect(
				Collectors.groupingBy(Employees::getDeptName,
				Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparingLong(Employees::getSalary)), 
				Optional::get)));
		
		System.out.println(approach2);

	}

}