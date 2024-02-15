package com.java8.interview.qa.string;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class StringNegateMethod {

	public static void main(String[] args) {
		
		List<String> words = Arrays
				               .asList("Java", "Stream", "Lambda", "", "Filter");
		
		Predicate<String> nonEmpty =  String::isEmpty;
		
		long count = words.stream()
				          .filter(nonEmpty.negate())
				          .count();
				          
		System.out.println(count);

	}

}
