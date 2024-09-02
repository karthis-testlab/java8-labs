package com.java8.demo.stream.api;

import java.util.List;

public class StreamFilter1 {

	public static void main(String[] args) {
		List<Integer> list = List.of(5, 2, 4, 3, 1);
		var filteredList = list.stream()
				               .filter(item -> item > 3)
				               .toList();
		System.out.println(filteredList);
	}

}