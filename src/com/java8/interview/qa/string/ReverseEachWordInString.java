package com.java8.interview.qa.string;

import java.util.Arrays;

public class ReverseEachWordInString {

	public static void main(String[] args) {
		
		String sentence = "Hello! World, Welcome to the world of JAVA.";
		
		String[] words = sentence.split(" ");
		
		Arrays.stream(words)
		      .map(word -> new StringBuffer(word).reverse())
		      .map(word -> word.append(" "))
		      .forEach(System.out::print);

	}

}
