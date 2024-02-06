package com.java8.interview.qa.string;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByStringFirstChar {

	public static void main(String[] args) {
		
		List<String> cities = Arrays.asList("Pune", "Mumbai", "Delhi", "Chennai", "Madurai", "Bangalor");
		
		Map<Character, List<String>> citiesMap = cities.stream()
				                                       .collect(Collectors
				                                    		    .groupingBy(city -> city.charAt(0)));
		
		citiesMap.forEach((firstChar, cityName) ->
		                 System.out.println("Cities Starting with "+firstChar+" : "+cityName)
				); 
		

	}

}
