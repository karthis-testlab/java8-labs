package com.java8.demo.consumerinterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerInterfaceEx1 {

	public static void main(String[] args) {
		
		List<String> fruits = Arrays.asList("Apple", "Mango", "Orange");
		
		Consumer<String> consumer = (s) -> System.out.println(s);
		fruits.forEach(consumer);

	}

}
