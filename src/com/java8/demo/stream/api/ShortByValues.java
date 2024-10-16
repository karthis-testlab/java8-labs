package com.java8.demo.stream.api;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class ShortByValues {

	public static void main(String[] args) {
		
		var map = Map.of("Java", 85, "Rust", 79, "Go", 83, "Kotlin", 70, "Groovy", 60);
		Map<String, Integer> sortingByValues = sortingByValues(map);
		System.out.println(sortingByValues);

	}
	
	public static Map<String, Integer> sortingByValues(Map<String, Integer> map) {
		return map.entrySet()
				  .stream()
				  .sorted(Map.Entry.comparingByValue())
				  .collect(Collectors.toMap(Map.Entry::getKey,
						                    Map.Entry::getValue,
						                    (e1, e2) -> e1, LinkedHashMap::new));
	}

}