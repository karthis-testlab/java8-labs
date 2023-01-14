package com.java8.demo.inner.classes;

public class MethodInnerClass {
	
	@SuppressWarnings("unused")
	public static void count(int i) {
		class InnerClass {
			public InnerClass() {
				System.out.println("Inner Class in Method "+i);
			}
		}
		InnerClass inner = new InnerClass();
	}
	
	public static void main(String[] args) {
		count(10);
	}

}