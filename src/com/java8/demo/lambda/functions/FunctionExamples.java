package com.java8.demo.lambda.functions;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.ToDoubleBiFunction;
import java.util.function.ToDoubleFunction;

public class FunctionExamples {

	public FunctionExamples() {
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

		// Change the orgName(string) in the Employee class to upper case
		Function<Employee, Employee> function = (vEmp) -> {
			vEmp.setOrgName(vEmp.getOrgName().toUpperCase());
			return vEmp;
		};

		// Get the orgName from the Employee class
		Function<Employee, String> function1 = (vEmp) -> vEmp.getOrgName();

		Employee empChange = function.apply(emp);
		System.out.println(empChange);

		System.out.println(function1.apply(emp));

		// Get salary from the Employee class
		ToDoubleFunction<Employee> salaryFunction = (vEmp) -> vEmp.getSalary();
		System.out.println(salaryFunction.applyAsDouble(emp));

		// Add two employees salaries and return the result as the double data type
		BiFunction<Employee, Employee, Double> sum = (vEmp, vEmp1) -> vEmp.getSalary() + vEmp1.getSalary();
		System.out.println(sum.apply(emp, emp1));

		// Add two employees salaries and return the result as the double data type
		// using ToDoubleBiFunction interface
		ToDoubleBiFunction<Employee, Employee> sum1 = (vEmp, vEmp1) -> vEmp.getSalary() + vEmp1.getSalary();
		System.out.println(sum1.applyAsDouble(emp, emp1));

		// Higher Order Function in Function interface
		Function<Employee, Employee> toUpper = (vEmp) -> {
			System.out.println("Calling toUpper function....");
			vEmp.setOrgName(vEmp.getOrgName().toUpperCase());
			return vEmp;
		};

		Function<Employee, Employee> toLower = (vEmp) -> {
			System.out.println("Calling toLower function....");
			vEmp.setOrgName(vEmp.getOrgName().toLowerCase());
			return vEmp;
		};

		Employee andThen = toUpper.andThen(toLower).apply(emp);
		System.out.println(andThen);
		System.out.println("###################END###################");
		Employee compose = toUpper.compose(toLower).apply(emp);
		System.out.println(compose);

	}

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		FunctionExamples examples = new FunctionExamples();
	}

}
