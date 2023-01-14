package com.java8.demo.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import static java.util.Comparator.comparing;
import java.util.List;

public class EmployeeExample {
	
	public EmployeeExample() {		
		List<Employee> empList = new ArrayList<Employee>();
		Employee emp = new Employee(1, "Google", 22435.63);
		Employee emp1 = new Employee(2, "Meta", 32435.63);
		Employee emp2 = new Employee(3, "Twitter", 12435.63);
		Employee emp3 = new Employee(4, "Microsoft", 62435.63);
		Employee emp4 = new Employee(5, "IBM", 25435.63);
		empList.add(emp);
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		empList.add(emp4);
		
		//Before Sort
		System.out.println(empList);
		
		//Before Java8
		/*Collections.sort(empList, new Comparator<Employee>() {
			//Logic for Ascending Order
			/*@Override
			public int compare(Employee emp1, Employee emp2) {
				if(emp1.getSalary() > emp2.getSalary())
					return 1;
				if(emp1.getSalary() < emp2.getSalary())
					return -1;
				return 0;
			}*/
			//Login for Descending Order
			/*@Override
			public int compare(Employee emp1, Employee emp2) {
				if(emp1.getSalary() > emp2.getSalary())
					return -1;
				if(emp1.getSalary() < emp2.getSalary())
					return 1;
				return 0;
			}
		});*/
		
		//Change sort logic based on the Java8 -> Ascending Order
		//Collections.sort(empList, (employee1, employee2) -> Double.compare(employee1.getSalary(), employee2.getSalary()));
		
		//Change sort logic based on the Java8 -> Ascending Order
		//Collections.sort(empList, (employee1, employee2) -> Double.compare(employee2.getSalary(), employee1.getSalary()));
		
		//Change sort logic based on the Java8 using method references 
		Collections.sort(empList, comparing(Employee::getSalary));
		
		//After Sort
		System.out.println(empList);
	}

	public static void main(String[] args) {
		EmployeeExample example = new EmployeeExample();
	}

}
