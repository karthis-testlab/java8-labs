package com.java8.interview.qa.string;

import java.util.Arrays;
import java.util.List;

public class RetrieveLastElementInList {

	public static void main(String[] args) {

		List<String> elements = Arrays.asList("One", "Two", "Three", "Four", "Five", "Six");
		
		String lastElement = elements.stream()
		                             .skip(elements.size() - 1)
		                             .findFirst()
		                             .get();
		
		System.out.println(lastElement);

	}

}
