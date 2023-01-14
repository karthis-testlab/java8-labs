package com.java8.demo.lambda;

public class Employee {

	int id;
	String orgName;
	double salary;

	public Employee() {

	}

	public Employee(int id, String orgName, double salary) {
		this.id = id;
		this.orgName = orgName;
		this.salary = salary;
	}
	
	public String toString() {
		return id +" = "+ salary;		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getOrgName() {
		return orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}