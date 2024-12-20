package com.java8.interview.qa.string;

import java.util.Arrays;
import java.util.List;

public class StringCase {

	public static void main(String[] args) {
		
		//Given input
		List<String> words = Arrays.asList("Apple", "Banana", "Mango", "cherry", "Orange");

		List<String> upperCase1 = words.stream()
		                            .map(str -> str.toUpperCase())
		                            .toList();
		
		System.out.println(upperCase1);
		
		List<String> upperCase2 = words.stream()
                                    .map(String::toUpperCase)
                                    .toList();
		
		System.out.println(upperCase2);
		
		List<String> lowerCase1 = words.stream()
                .map(str -> str.toLowerCase())
                .toList();
		
	    System.out.println(lowerCase1);
	    
	    List<String> lowerCase2 = words.stream()
                .map(String::toLowerCase)
                .toList();
	    
	    System.out.println(lowerCase2);
		
	}

}