package com.java8.demo.inner.classes;

public class NormalInnerClass {
	
	public class InnerClass {
		public void print() {
			System.out.println("I'm in inner class");
		}
	}

	public static void main(String[] args) {	
		NormalInnerClass outer = new NormalInnerClass();
		InnerClass inner = outer.new InnerClass();
		inner.print();
	}

}