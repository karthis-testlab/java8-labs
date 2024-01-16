package com.java8.demo.stream.api;

public class Employees {

	int id;
	String orgName;
	double salary;

	public Employees() {		
		
	}

	public Employees(int id, String orgName, double salary) {
		this.id = id;
		this.orgName = orgName;
		this.salary = salary;
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
	
	public String toString() {
		return id +" = "+ orgName+" = "+salary;		
	}

}