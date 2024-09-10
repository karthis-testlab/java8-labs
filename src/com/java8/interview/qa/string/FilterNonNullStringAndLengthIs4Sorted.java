package com.java8.interview.qa.string;

import java.util.stream.Stream;

public class FilterNonNullStringAndLengthIs4Sorted {

	public static void main(String[] args) {
		
		Stream.of("Toby", null, "Anna", "Elsa", "Tina", "Ice")
	          .filter(n -> n != null)   
	          .filter(n -> n.length() == 4)
	          .sorted()
	          .forEach(System.out::println);

	}

}