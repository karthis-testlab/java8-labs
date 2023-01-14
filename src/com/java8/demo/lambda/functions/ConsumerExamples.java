package com.java8.demo.lambda.functions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class ConsumerExamples {

	public ConsumerExamples() {
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

		// Get employees details whose emp_id is 3
		printEmp(empList, (vEmp) -> vEmp.getId() == 3);

		// Get employees details those how're in Google and salary greater than 25000.00
		Predicate<Employee> predicateOne = (vEmp) -> vEmp.getOrgName().equals("Google");
		Predicate<Employee> predicateTwo = (vEmp) -> vEmp.getSalary() > 20000.00;
		printEmp(empList, predicateOne.and(predicateTwo));

		// Get employees details whose emp_id is 3 using IntPredicate
		printEmpInt(empList, (id) -> id == 3);
		
		// To print two consumer using higher order function in Consumer Interface
		Consumer<Employee> consumerA = (a) -> System.out.println("Conusmer from A: "+a);
		Consumer<Employee> consumerB = (b) -> System.out.println("Conusmer from B: "+b);
		empList.forEach(consumerA.andThen(consumerB));
		
	}

	// Change the for loop to Consumer Interface to using forEach method
	public void printEmp(List<Employee> employees, Predicate<Employee> predicate) {
		Consumer<Employee> consumer = (employee) -> {
			if (predicate.test(employee)) {
				System.out.println(employee);
			}
		};
		employees.forEach(consumer);
		System.out.println("#######################END###########################");
	}

	// Change the for loop to Consumer Interface to using forEach method
	public void printEmpInt(List<Employee> employees, IntPredicate predicate) {
		Consumer<Employee> consumer = (employee) -> {
			if (predicate.test(employee.getId())) {
				System.out.println(employee);
			}
		};
		employees.forEach(consumer);
		System.out.println("#######################END###########################");
	}

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		ConsumerExamples examples = new ConsumerExamples();
		
		//Using BiConsumer to iterate the Map key, value pair
		Map<String, String> map = new HashMap<String, String>();
		map.put("One", "1");
		map.put("Two", "2");
		map.put("Three", "3");
		
		BiConsumer<String, String> biConsumer = (key, value) -> System.out.println(key+" = "+value);
		map.forEach(biConsumer);
		
		
	}

}
