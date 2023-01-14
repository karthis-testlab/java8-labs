package com.java8.demo.inner.classes;

public class StaticInnerClass {
	
	public static class InnerClass {
		public void print() {
			System.out.println("I'm in static inner class");
		}
	}

	public static void main(String[] args) {			
		InnerClass inner = new InnerClass();
		inner.print();
	}

}