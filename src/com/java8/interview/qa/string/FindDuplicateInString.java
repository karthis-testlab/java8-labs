package com.java8.interview.qa.string;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicateInString {

	// Find all duplicate elements from a give string
	public static void main(String[] args) {
		
		String str = "all duplicate elements";
		String[] stringArray = str.replace(" ", "").split("");
		
		List<String> duplicateElements = Arrays.stream(stringArray)
	          .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
	          .entrySet().stream()
	          .filter(character -> character.getValue() > 1)
	          .map(Map.Entry::getKey)
	          .collect(Collectors.toList());
		
		System.out.println(duplicateElements);
		
		List<String> uniqueElements = Arrays.stream(stringArray)
		          .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
		          .entrySet().stream()
		          .filter(character -> character.getValue() == 1)
		          .map(Map.Entry::getKey)
		          .collect(Collectors.toList());
		
		System.out.println(uniqueElements);
		
	}

}