package com.java8.interview.qa.string;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Java8FrequentProgrammingQA {
	
	
    // Count the occurrence of each character in the string	
	public static void main(String[] args) {
		
		String str = "Karthikeyan";
		String[] stringArray = str.split("");
		System.out.println(Arrays.toString(stringArray));
		
		Map<String, Long> occreance = Arrays.stream(stringArray)
		      .collect(Collectors.groupingBy(string -> string, LinkedHashMap::new, Collectors.counting()));
		
		Map<String, Long> occreance2 = Arrays.stream(stringArray)
			      .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
		
		System.out.println(occreance);
		System.out.println(occreance2);
		
	}

}