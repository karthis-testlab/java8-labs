package com.java8.interview.qa.string;

import java.util.stream.Stream;

public class FindDistinctStringCount {

	public static void main(String[] args) {
		
		long distinctString = Stream.of("Java", "C++", "C#", "Python", "Java")
		                            .distinct()
		                            .count();
		
		System.out.println(distinctString);
	

	}

}
