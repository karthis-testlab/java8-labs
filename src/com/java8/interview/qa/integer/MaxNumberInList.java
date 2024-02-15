package com.java8.interview.qa.integer;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MaxNumberInList {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(10, 30, 40, 100, 90, 80);
		
		Integer max_integer = numbers.stream()
		                         .max(Comparator.naturalOrder())
		                         .get();
		
		System.out.println(max_integer);
		
	}

}
