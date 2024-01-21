package com.java8.interview.qa.string;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindNonRepeatElementInString {

	// Java Program to find first non-repeat element from a given string
	public static void main(String[] args) {
		
		String string = "ilovejavatechie";
		String[] stringArray = string.split("");
		
		String firstUniqueElements = Arrays.stream(stringArray)
		          .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
		          .entrySet().stream()
		          .filter(character -> character.getValue() == 1)
		          .findFirst().get().getKey();
		
		System.out.println(firstUniqueElements);
		
	}

}