package com.java8.demo.stream.api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Streams {

	/*
	 * Stream Interface extends BaseStream Interface
	 * 
	 * Stream<T> extends BaseStream<T, Stream<T>>	
	 * 
	 * 
	 * 
	 */
	public static void main(String... streams) {
		
		// Different ways(Approach) to create the Streams
		
		// 1. Create Stream by Using Collections <List, Set, Map>
		List<String> languages = List.of("Java", "Scala", "Go", "Kotlin", "Groovy");
		Stream<String> listOfStreams = languages.stream();
		
		// 2. Create Stream by Using Array
		int[] numbers = new int[] {7,2,3,4,5,6,8,1,9};
		IntStream arrayOfStreams = Arrays.stream(numbers);
		
		Integer[] number = new Integer[] {7,2,3,4,5,6,8,1,9};
		Stream<Integer> arrayOfStreams2 = Arrays.stream(number);
		
		// 3. Create Stream by Using Of static method
		// Creating a stream from an array is safe
		// Returns a sequential ordered stream whose elements are the specified values.
		Stream<Integer> numbersOfStaticMethod = Stream.of(5,2,6,8,9,5,3,1);
		
		numbersOfStaticMethod.filter(ele -> {	
			System.out.println("Finding Even...");
			return ele%2 == 0;
		}).map(a -> {
			System.out.println("Adding +1...");
			return a+1;
		})
		.forEach(System.out::println);
		
		/*
		 * 
		 * Lazy evaluation - Until terminal operation is not involved intermediate
		 * operations are won't executed. This's called Lazy evaluation.
		 * 
		 * Without terminal operation intermediate operation won't run (executed)
		 * 
		 */
		
	}

}