package com.java8.demo.stream.terminal.operations;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamsTerminalOperations {

	public static void main(String[] args) {
		
		List<String> languages = List.of("Java", "Scala", "Rust", "Kotlin", "Go");	
		
		// 1. ForEach
		languages.stream().map(language -> language.toUpperCase())
		                  .forEach(language -> System.out.println(language));
		
		// 2. toList | Map | Set
		List<String> upperLanguages = languages.stream().map(language -> language.toUpperCase())
		                                                .toList();
		System.out.println(upperLanguages);
		
		// 3. AnyMatch
		boolean anyMatch = languages.stream().anyMatch(language -> language.length() > 3);
		System.out.println(anyMatch);
		
		// 4. Collect ( toList | toSet )
		List<Integer> numbers = List.of(2,5,7,8,9,3,4,6,4,6,1);
		Set<Integer> unique_numbers = numbers.stream().distinct().sorted().collect(Collectors.toSet());
		System.out.println(unique_numbers);
		
		// 5. AllMatch
		boolean allMatch = languages.stream().allMatch(language -> language.length() > 3);
		System.out.println(allMatch);
		
		// 6. NoneMatch
		boolean noneMatch = languages.stream().noneMatch(language -> language.endsWith("Z"));
		System.out.println(noneMatch);
		
		// 7. Count Max Min Sum
		long count = numbers.stream().count();
		System.out.println(count);
		
		Optional<Integer> max = numbers.stream().max(Integer::compare);
		System.out.println(max.get());
		
		Optional<Integer> min = numbers.stream().min(Integer::compare);
		System.out.println(min.get());
		
		int sum = numbers.stream().mapToInt(number -> number).sum();
		System.out.println(sum);
		
		// 8. Joining
		String joining = languages.stream().collect(Collectors.joining(", "));
		System.out.println(joining);
		
		// 9. summarizingInt | Double | Long
		IntSummaryStatistics summarizingInt = numbers.stream().collect(Collectors.summarizingInt(Integer::intValue));
        System.out.println(summarizingInt);
        
        // 10. Partition By
        Map<Boolean, List<String>> partition = languages.stream().collect(Collectors.partitioningBy(language -> language.length() > 4));
		System.out.println(partition);
		
		Map<Boolean, List<Integer>> partitionNumber = numbers.stream().collect(Collectors.partitioningBy(number -> number % 2 == 0));
	    System.out.println(partitionNumber);
	}

}