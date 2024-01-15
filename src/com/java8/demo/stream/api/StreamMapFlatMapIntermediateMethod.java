package com.java8.demo.stream.api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMapFlatMapIntermediateMethod {

	public static void main(String[] args) {

		List<Users> users = Stream.of(
				new Users("User1", "9876543210", Arrays.asList("user1@example.com", "user1@mail.com")),
				new Users("User2", "9876543211", Arrays.asList("user2@example.com", "user2@mail.com")))
				.collect(Collectors.toList());
		
		System.out.println(users.stream().map(Users::getName).toList());
		System.out.println(users.stream().map(Users::getPhone).toList());	
		
		System.out.println(users.stream().map(Users::getEmails).toList());
		System.out.println(users.stream().flatMap(email -> email.getEmails().stream()).toList());

	}

}