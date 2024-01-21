package com.java8.interview.qa.integer;

import java.util.Arrays;
import java.util.Comparator;

public class SeconHighestNumberInArray {

	// Java program to find second highest number from given array
	public static void main(String[] args) {		
		
		int[] numbers = {5,9,11,2,8,21,1};
		
		Integer secondHighestInteger = Arrays.stream(numbers).boxed()
		      .sorted(Comparator.reverseOrder())
		      .skip(1)
		      .findFirst()
		      .get();
		
		System.out.println(secondHighestInteger);

	}

}