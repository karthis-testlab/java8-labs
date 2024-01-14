package com.java8.demo.stream.api;

import java.util.function.IntConsumer;
import java.util.function.IntPredicate;
import java.util.function.IntUnaryOperator;
import java.util.stream.IntStream;

public class IntroductionToStreams {

	public static void main(String[] args) {
		
		// Before JDK 1.8
		for (int i = 0; i < 10; i++) {
			System.out.print(i);
		}
		
		// print even numbers
		for (int i = 0; i < 10; i++) {
			if(i % 2 == 0)
				System.out.print(i);
		}
		
		System.out.println("");
		
		// After JDK 1.8
		IntStream.iterate(0, i -> i+1)
		         .limit(10)
		         .forEach(System.out::print);
		
		// print even numbers
		IntStream.iterate(0, i -> i+1)
		         .limit(10)
		         .filter(i -> i%2 == 0)
		         .forEach(System.out::print);
		
		System.out.println("");
		
		// print even numbers alternative approach
		IntUnaryOperator incrementBy1 = i -> i+1;
		IntPredicate findEvenNumber = number -> number%2 == 0 && number != 0;
		IntConsumer print = System.out::print;
		
		IntStream.iterate(0, incrementBy1)
                 .limit(10)
                 .filter(findEvenNumber)
                 .forEach(print);
		
	}

}