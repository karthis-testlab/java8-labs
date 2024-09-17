package com.java8.interview.qa.integer;

import java.util.List;

public class FilterNumberBasedOnGreaterCondtion {

	public static void main(String[] args) {
		
		var list = List.of(5, 2, 4, 3, 1);
		var filteredList = list.stream()
		                       .filter(item -> item > 3)
		                       .toList();
		System.out.println("Before Filter: "+list);
		System.out.println("After Filtered: "+filteredList);

	}

}
