package com.java8.interview.qa.integer;

import java.util.List;

public class ProductOfAllElements {

	public static void main(String[] args) {
		System.out.println(productOfAllElements());
	}
	
	public static Integer productOfAllElements() {
		return List.of(3, 2, 1, 4, 5)
				   .stream()
				   .reduce(1, (product, element) -> product * element);
	}

}