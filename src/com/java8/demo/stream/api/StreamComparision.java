package com.java8.demo.stream.api;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamComparision {

	public static void main(String[] args) {

		// Using Java7
		List<String> lowCalorieFoodNamesUsingJava7 = getLowCalorieFoodNamesUsingJava7(Dish.menu);
		for (String foodName : lowCalorieFoodNamesUsingJava7) {
			System.out.println(foodName);
		}
		
		System.out.println("*****************************Compare*****************************");

		// Using Java8
		getLowCalorieFoodNamesUsingJava8(Dish.menu).forEach(System.out::println);

	}

	public static List<String> getLowCalorieFoodNamesUsingJava7(List<Dish> dishes) {

		List<Dish> lowCaloireFood = new ArrayList<Dish>();
		for (Dish d : dishes) {
			if (d.getCalories() > 400) {
				lowCaloireFood.add(d);
			}
		}

		List<String> lowCaloireFoodName = new ArrayList<String>();
		Collections.sort(lowCaloireFood, new Comparator<Dish>() {
			public int compare(Dish d1, Dish d2) {
				return Integer.compare(d1.getCalories(), d2.getCalories());
			}
		});
		for (Dish d : lowCaloireFood) {
			lowCaloireFoodName.add(d.getName());
		}

		return lowCaloireFoodName;
	}

	public static List<String> getLowCalorieFoodNamesUsingJava8(List<Dish> dishes) {
		return dishes.stream()
				     .filter(d -> d.getCalories() > 400)
				     .sorted(Comparator.comparing(Dish::getCalories))
				     .map(Dish::getName)
				     .collect(Collectors.toList());
	}

}