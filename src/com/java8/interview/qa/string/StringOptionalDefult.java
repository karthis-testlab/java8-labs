package com.java8.interview.qa.string;

import java.util.Optional;

public class StringOptionalDefult {

	public static void main(String[] args) {
		
		Optional<String> optionalString = Optional.of("Java");
		String result = optionalString.map(String::toUpperCase).orElse("Default");
		System.out.println(result);
	}

}
