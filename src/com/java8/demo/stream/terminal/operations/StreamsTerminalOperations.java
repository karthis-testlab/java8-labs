package com.java8.demo.stream.terminal.operations;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamsTerminalOperations {	
	
    /*
     * 
     * Java-8 Stream terminal operations produces a non-stream, result such as primitive value, a collection
     * or no value at all. Terminal operations are typically preceded by intermediate operations which return
     * another Stream which allows operations to be connected in a form of query.
     * 
     * 1.) The terminal operations of the Java Stream interface typically return a single value.
     * 2.) Terminal operations can't be chained together.
     * 3.) Intermediate operations return another stream as a result, they can be chained together to form a
     *     pipeline of operations.
     *     
     * Terminal Stream Operations:
     * 
     * anyMatch()
     * allMatch()
     * noneMatch()
     * collect()
     * count()
     * findAny()
     * firstAny()
     * forEach()
     * min()
     * max()
     * reduce()
     * toArray()   
     * 
     */
	public static void main(String[] args) {
		
		List<String> languages = List.of("Java", "Scala", "Rust", "Kotlin", "Go");	
		
		// 1. ForEach
		languages.stream().map(language -> language.toUpperCase())
		                  .forEach(language -> System.out.println(language));
		
		languages.stream().map(language -> language.toUpperCase())
                          .forEach(System.out::println);
		
		// 2. toList | Map | Set
		List<String> upperLanguages = languages.stream().map(language -> language.toUpperCase())
		                                                .toList();
		System.out.println(upperLanguages);
		
		// 3. AnyMatch
		boolean anyMatch = languages.stream().anyMatch(language -> language.length() > 3);
		System.out.println(anyMatch);
		
		// 4. Collect ( toList | toSet )
		List<Integer> numbers = List.of(2,5,7,8,9,3,4,6,4,6,1,-3,-234);
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
	    
	    // 11. GroupingBy
	    Map<String, String> users = Map.of("Varun", "USER", "Karun", "USER", "Tarun", "ADMIN", "Jeevan", "SUPER_USER", "Sam", "SUPER_USER", "Tarkan", "USER");
	    Map<String, List<Entry<String, String>>> group_by_users = users.entrySet().stream().collect(Collectors.groupingBy(Map.Entry::getValue));
	    System.out.println(group_by_users);
	    
	    // 12. Reduce
	    Integer reduce = numbers.stream().reduce(0, Integer::min);
	    System.out.println(reduce);
	    Integer listOfSum = numbers.stream().reduce(0, Integer::sum);
	    System.out.println(listOfSum);
	    
	    // 13. toArray
	    Object[] array = languages.stream().toArray();
	    System.out.println(Arrays.toString(array));
	    
	    // 14. findAny
	    Optional<String> findAny = languages.stream().findAny();
	    System.out.println(findAny.get());
	    
	    // 15. findFirst
	    Optional<String> findFirst = languages.stream().findFirst();
	    System.out.println(findFirst.get());
	    
	}

}