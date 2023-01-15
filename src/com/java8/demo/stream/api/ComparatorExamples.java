package com.java8.demo.stream.api;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ComparatorExamples {

	public static void main(String[] args) {
		
		Integer[] arr = new Integer[] {6, 7, 5 ,3, 3, 1, 0};
		
		List<Integer> integer = Arrays.asList(arr);
		
		System.out.println("Before Sort: "+integer);
		
		Collections.sort(integer, new SortAscendingOrderApi());
		
		System.out.println("After Sort : "+integer);
		
	}

}