package com.java8.demo.stream.api;

import java.util.Arrays;
import java.util.List;

public class StreamFilterMethod {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		final List<Integer> output = numbers.stream()
				.filter(x -> {
					boolean isEven = x % 2 == 0;
					boolean isGreaterThanFive = x > 5;
					boolean isDivisibleByThree = x % 3 == 0;
					return isEven && 
							isGreaterThanFive && 
							isDivisibleByThree;
		})
		 .toList();
		
		System.out.println(output); 

	}

}