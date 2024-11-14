package com.java8.interview.qa.integer;

import java.util.Arrays;
import java.util.List;

public class FindAverage {

	public static void main(String[] args) {	
		
		List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);
		double average = numbers.stream()
		       .mapToInt(num -> num.intValue())
		       .average()
		       .getAsDouble();
		
		System.out.println(average);

	}

}