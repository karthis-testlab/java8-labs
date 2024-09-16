package com.java8.interview.qa.integer;

import java.util.stream.Stream;

public class FindNthLargestNumber {

	public static void main(String[] args) {
		
		int n = 6;
		Integer nthElement = Stream.of(6, -1, 9, 5, 2, -10, 7)
		      .sorted((e1, e2) -> e2.compareTo(e1))
		      .filter(e -> e > 0)
		      .peek(e -> System.out.println(e + " "))
		      .skip(n - 1)
		      .findFirst()
		      .orElse(null);	
		System.out.println(nthElement);
		
	}

}