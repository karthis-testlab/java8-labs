package com.java8.interview.qa;

import java.util.function.Predicate;

public class PredicateQuestion {

	public static void main(String[] args) {
		
		Predicate<String> nullCheck = arg -> arg != null;
		Predicate<String> emptyCheck = arg -> arg.length() > 0;
		Predicate<String> nullAndEmptyCheck = nullCheck.and(emptyCheck);
		
		System.out.println(nullAndEmptyCheck.test(null));
		System.out.println(nullAndEmptyCheck.test("null"));

	}

}
