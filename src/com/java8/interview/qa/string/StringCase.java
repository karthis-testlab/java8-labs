package com.java8.interview.qa.string;

import java.util.Arrays;
import java.util.List;

public class StringCase {

	public static void main(String[] args) {
		
		//Given input
		List<String> words = Arrays.asList("Apple", "Banana", "Mango", "cherry", "Orange");

		List<String> result1 = words.stream()
		                            .map(str -> str.toUpperCase())
		                            .toList();
		
		System.out.println(result1);
		
		List<String> result2 = words.stream()
                                    .map(String::toUpperCase)
                                    .toList();
		
		System.out.println(result2);
		
	}

}