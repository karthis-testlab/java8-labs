package com.java8.demo.stream.intermediate.operations;

public class Employees {
	
	private int id;
	private String name;
	private String deptName;
	private long salary;
	
	public Employees(int id, String name, String deptName, long salary) {
		this.id = id;
		this.name = name;
		this.deptName = deptName;
		this.salary = salary;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDeptName() {
		return deptName;
	}
	
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	
	public long getSalary() {
		return salary;
	}
	
	public void setSalary(long salary) {
		this.salary = salary;
	}	

}