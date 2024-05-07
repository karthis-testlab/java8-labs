package com.java8.demo.stream.api;

import java.util.Arrays;
import java.util.List;

public class StreamFilterMethod {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12);
		
		final List<Integer> output = numbers.stream()
				.filter(StreamFilterMethod::checkValidation)
		 .toList();
		
		System.out.println(output); 

	}
	
	private static boolean checkValidation(Integer number) {
		boolean isEven = number % 2 == 0;
		boolean isGreaterThanFive = number > 5;
		boolean isDivisibleByThree = number % 3 == 0;
		return isEven && isGreaterThanFive && isDivisibleByThree;
	}

}