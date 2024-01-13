package com.java8.demo.inner.classes;

public class AbstractAnonymousInnerClass {
	
	public static void main(String[] args) {
		Reports report = new Reports() {			
			@Override
			public void takeScreenShot() {
				System.out.println("Took screen in implementation class");				
			}
		};
		report.pass();
		report.fail();
		report.takeScreenShot();
	}

}