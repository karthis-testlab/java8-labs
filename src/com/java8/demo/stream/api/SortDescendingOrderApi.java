package com.java8.demo.stream.api;

import java.util.Comparator;

public class SortDescendingOrderApi implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		return Integer.compare(o2, o1);
	}

}