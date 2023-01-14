package com.java8.demo.lambda.functions;

import java.util.ArrayList;
import java.util.List;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class PredicateExamples {

	public PredicateExamples() {
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
		
		// Get Google employees details
		printEmp(empList, (vEmp) -> vEmp.getOrgName().equals("Google"));
		
		// Get employees details those salary are greater than 40000.00
		printEmp(empList, (vEmp) -> vEmp.getSalary() > 40000.00);
		
		// Get employees details whose emp_id is  3
		printEmp(empList, (vEmp) -> vEmp.getId() == 3);
		
		// Get employees details those how're in Google and salary greater than 25000.00
		Predicate<Employee> predicateOne = (vEmp) -> vEmp.getOrgName().equals("Google");
		Predicate<Employee> predicateTwo = (vEmp) -> vEmp.getSalary() > 20000.00;
		printEmp(empList, predicateOne.and(predicateTwo));
		
		// Get employees details whose emp_id is  3 using IntPredicate
		printEmpInt(empList, (id) -> id == 3);
		
	}

	public void printEmp(List<Employee> employees, Predicate<Employee> predicate) {
		for (Employee employee : employees) {
			if (predicate.test(employee)) {
				System.out.println(employee);
			}
		}
		System.out.println("#######################END###########################");
	}
	
	public void printEmpInt(List<Employee> employees, IntPredicate predicate) {
		for (Employee employee : employees) {
			if (predicate.test(employee.getId())) {
				System.out.println(employee);
			}
		}
		System.out.println("#######################END###########################");
	}

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		PredicateExamples examples = new PredicateExamples();
	}

}