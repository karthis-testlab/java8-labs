package com.java8.interview.qa.integer;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindIntegerStartsWithGivenNumber {

	// Java program to find all elements from array who starts with 1
	public static void main(String[] args) {

		int[] numbers = { 2, 5, 11, 22, 3, 1, 4, 13, 111 };

		List<String> numberList = Arrays.stream(numbers)
				                        .boxed()
				                        .map(integer -> integer + "")
				                        .filter(string -> string.startsWith("1"))
				                        .collect(Collectors.toList());

		System.out.println(numberList);

	}

}