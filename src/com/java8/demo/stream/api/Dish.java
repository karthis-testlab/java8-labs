package com.java8.demo.stream.api;

import java.util.Arrays;
import java.util.List;

public class Dish {

	private final String name;
	private final boolean vegetarian;
	private final int calories;
	private final Type type;

	public Dish(String name, boolean vegetarian, int calories, Type type) {
		this.name = name;
		this.vegetarian = vegetarian;
		this.calories = calories;
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public boolean isVegetarian() {
		return vegetarian;
	}

	public int getCalories() {
		return calories;
	}

	public Type getType() {
		return type;
	}

	public enum Type {
		MEAT, FISH, OTHERS
	};

	public static final List<Dish> menu = Arrays.asList(
			                               new Dish("Pork", false, 800, Dish.Type.MEAT),
			                               new Dish("Beef", false, 700, Dish.Type.MEAT),
			                               new Dish("Chicken", false, 400, Dish.Type.MEAT),
			                               new Dish("French Fries", true, 530, Dish.Type.OTHERS),
			                               new Dish("Rice", true, 350, Dish.Type.OTHERS),
			                               new Dish("Season Fruits", true, 120, Dish.Type.OTHERS),
			                               new Dish("Pizza", true, 550, Dish.Type.OTHERS),
			                               new Dish("Prawns", false, 400, Dish.Type.FISH),
			                               new Dish("Salmon", false, 450, Dish.Type.FISH)
			                              );
	public String toString() {
		return name;
	}

}