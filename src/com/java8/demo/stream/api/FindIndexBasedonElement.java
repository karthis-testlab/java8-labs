package com.java8.demo.stream.api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class FindIndexBasedonElement {

	public static void main(String[] args) {

		List<String> fruits = Arrays.asList("apple", "banana", "cherry", "dates", "cheery");
        
		int index = IntStream.range(0, fruits.size())
		         .filter(i -> fruits.get(i).equals("cherry"))
		         .findFirst()
		         .getAsInt();
		
		System.out.println(index);
		
	}

}