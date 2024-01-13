package com.java8.demo.inner.classes;

public abstract class Reports {

	public void pass() {
		System.out.println("Testcase Passed!");
	}

	public void fail() {
		System.err.println("Testcase Failed!");
	}

	public abstract void takeScreenShot();

}
