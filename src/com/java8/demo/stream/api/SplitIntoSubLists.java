package com.java8.demo.stream.api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SplitIntoSubLists {

	public static void main(String[] args) {
		var list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		int k = 4;
		var l = splitIntoSubLists(list, k);
		System.out.println(l);
	}

	private static List<List<Integer>> splitIntoSubLists(List<Integer> list, int k) {
		
		// Calculate the base size and remainder
		int baseSize = list.size() / k;
		int remainder = list.size() % k;
		
		// Use a stream to partition the list into K sublists
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		int start = 0;
		
		for(int i = 0; i < k; i++) {
			
			int sublistSize = baseSize + (i < remainder ? 1 : 0);
			var sublist = list.stream()
					          .skip(start)
					          .limit(sublistSize)
					          .collect(Collectors.toList());
			
			result.add(sublist);
			start += sublistSize;
			
		}
		
		return result;
		
	}

}