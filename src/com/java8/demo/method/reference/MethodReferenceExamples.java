package com.java8.demo.method.reference;

import java.util.ArrayList;
import java.util.Collections;
import static java.util.Comparator.comparing;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.DoubleFunction;
import java.util.function.Supplier;

import com.java8.demo.lambda.functions.Employee;

public class MethodReferenceExamples {
	
	public MethodReferenceExamples() {
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
		
		System.out.println(empList);
		Collections.sort(empList, comparing(Employee::getSalary));
		System.out.println(empList);
		
		BinaryOperator<Double> sum = this::add;
		System.out.println(sum.apply(200.00, 100.00));
		
		DoubleFunction<Double> sqrt = Math::sqrt;
		System.out.println(sqrt.apply(2));
		
		// Using Lambda Expression
		BiFunction<Employee, Double, Employee> biFunc = (empObj, sal) -> {
			empObj.setSalary(sal);
			return empObj;
		};
		
		//Using Method References
		BiFunction<Employee, Double, Employee> biFunc1 = this::setEmpSalary;
		System.out.println(biFunc1.apply(new Employee(), 32444.90));
		
		// Constructor Method Reference
		Supplier<Employee> supplier = Employee::new;
		supplier.get();
		
		// Lambda for Tri function
		TriFunction triFunc = (id, org, salary) -> new Employee(id, org, salary);
		triFunc.create(6, "RTL", 132346.90);
		
		TriFunction triFunc1 = Employee::new;
		triFunc1.create(6, "RTL", 132346.90);
		
	}
	
	public Employee setEmpSalary(Employee emp, Double salary) {
		emp.setSalary(salary);
		return emp;
	}
	
	public Double add (Double a, Double b) {
		return a + b;
	}
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		MethodReferenceExamples examples = new MethodReferenceExamples();
	}	

}