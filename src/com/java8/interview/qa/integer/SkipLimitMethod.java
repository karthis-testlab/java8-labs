package com.java8.interview.qa.integer;

import java.util.stream.IntStream;

public class SkipLimitMethod {

	// Skip and limit method
	public static void main(String[] args) {
		
		IntStream.rangeClosed(1, 10)
		         .skip(1)
		         .limit(8)
		         .forEach(System.out::println);

	}

}
