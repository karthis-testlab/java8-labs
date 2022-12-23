package com.java8.demo.annotation;

import java.lang.reflect.Method;

public class SampleRunTimeAnnotaion {

	@EmployeeDetails(empId = 100, empName = "Karthikeyan", empDeptName = "Key Tester")
	public void setUp() {

	}

	public static void main(String[] args) {
		try {
			Class<?> classObj = Class.forName("com.java8.demo.annotation.SampleRunTimeAnnotaion");
			Method[] methods = classObj.getDeclaredMethods();
			for (Method method : methods) {
				if (method.getName().indexOf("setUp") != -1) {
					EmployeeDetails empDetails = method.getAnnotation(EmployeeDetails.class);
					System.out.println(empDetails.empId());
					System.out.println(empDetails.empName());
					System.out.println(empDetails.empDeptName());
				}
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}