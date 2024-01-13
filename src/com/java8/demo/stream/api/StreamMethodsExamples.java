package com.java8.demo.stream.api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMethodsExamples {
	
	public StreamMethodsExamples() {
		
		/*
		 * Distinct Stream Method - distinct(): This is a stateful intermediate operation.
		 * Stateful operations, such as distinct and sorted, 
		 * may incorporate state from previously seen elements when processing new elements.
		 * 
		 * This method is used to remove duplicates in the collection		 
		 */
		List<Integer> numbers = Arrays.asList(1, 2, 1, 3, 3, 2, 4, 8, 4);
		numbers.stream()
		       .filter(num -> num%2 == 0)
		       .distinct()
		       .forEach(System.out::println);
		
		System.out.println("==========================================================");
		
		/*
		 * Limit Stream Method - limit(): This is a short-circuiting stateful intermediate operation.
		 * short-circuiting operations. An intermediate operation is short-circuiting if, when presented with infinite input, 
		 * it may produce a finite stream as a result. A terminal operation is short-circuiting 
		 * if, when presented with infinite input, it may terminate in finite time. 
		 * Having a short-circuiting operation in the pipeline is a necessary, but not sufficient, 
		 * condition for the processing of an infinite stream to terminate normally in finite time.
		 * 
		 * This method is returns a stream consisting of the elements of this stream, truncated to be no longer than maxSize in length.
		 * 
		 * @Parameter: long maxSize the number of elements the stream should be limited to  
		 */
		List<Dish> limit = Dish.menu.stream()
				          .filter(dish -> dish.getCalories() > 300)
				          .limit(3)
				          .collect(Collectors.toList());
		System.out.println(limit);
		
		System.out.println("==========================================================");
		
		/* 
		 * Skip Stream Method - skip(): This is a statful intermediate operation.
		 * Stateful operations, such as distinct and sorted, 
		 * may incorporate state from previously seen elements when processing new elements.
		 * 
		 * This method is returns a stream consisting of the remaining elements of this stream 
		 * after discarding the first n elements of the stream. 
		 * If this stream contains fewer than n elements then an empty stream will be returned.
		 * 
		 * @Parameter: long n the number of leading elements to skip 
		 */
		List<Dish> skip = Dish.menu.stream()
		          .filter(dish -> dish.getCalories() > 300)
		          .skip(2)
		          .collect(Collectors.toList());
		System.out.println(skip);
		
		System.out.println("==========================================================");
		
		/*
		 * Map Stream Method - map(): This is an intermediate method
		 * 
		 * This method is returns a stream consisting of the results of applying the given function to the elements of this stream.
		 * 
		 * @Type Parameter: <R> The element type of the new stream
		 * @Parameter: mapper a non-interfering, stateless function to apply to each element
		 * @Return: the new stream  
		 */
		List<Integer> dishLength = Dish.menu.stream()
				                   .map(Dish::getName)
				                   .map(String::length)
				                   .collect(Collectors.toList());
		System.out.println(dishLength);
		
		
		/*
		 * Flat Map Stream Method - flatMap(): This method is used to flatten a Stream of collections to a Stream of objects. 
		 * The objects are combined from all the collections in the original Stream.
		 * 
		 * The flatMap() operation has the effect of applying a one-to-many transformation to the elements of the Stream and 
		 * then flattening the resulting elements into a new Stream.
		 * 
		 * What is Flattening?
		 * In layman’s terms, flattening is referred to as merging multiple collections/arrays into one.
		 * 
		 * flatMap() is an intermediate operation and return a new Stream.
		 * 
		 * @Type Parameter: <R> The element type of the new stream
		 * @Parameter: mapper a non-interfering, stateless function to apply to each element which produces a stream of new values
		 * @Return: the new stream
		 */
		List<String> words = Arrays.asList("Hello", "World");
		words.stream()
		     .flatMap((String line) -> Arrays.stream(line.split("")))
		     .distinct()
		     .forEach(System.out::println);
		
		// Count number of vowels in the given string or sentence using Java8 Stream API
		String str = "My Name is Karthikeyan Rajendran";
		String[] split = str.split(" ");
		List<String> list = Arrays.asList(split);
		long count = list.stream()
	     .flatMap((String line) -> Arrays.stream(line.split("")))
	     .map(String::toLowerCase)
	     .filter(x -> x.equals("a") || x.equals("e") || x.equals("i") || x.equals("o") || x.equals("u"))
	     .count();
		
		System.out.println("Number of vowels in the given string "+str+" is: "+count);
		
	}
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		StreamMethodsExamples examples = new StreamMethodsExamples();
	}

}