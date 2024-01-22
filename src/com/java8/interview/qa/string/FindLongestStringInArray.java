package com.java8.interview.qa.string;

import java.util.Arrays;

public class FindLongestStringInArray {

	// Java program to find longest string from give string array
	public static void main(String[] args) {

		String[] strings = { "java", "techie", "springboot", "microservices" };

		String longestString = Arrays.stream(strings)
				.reduce((word1, word2) -> word1.length() > word2.length() ? word1 : word2).get();
		
		System.out.println(longestString);

	}

}