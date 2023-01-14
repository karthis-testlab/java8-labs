package com.java8.demo.lambda;

public class Counter {

	public static void main(String[] args) {	
		ICounter count = (num, num2) -> num*num2; 
		System.out.println(count.count(10, 10));
	}

}