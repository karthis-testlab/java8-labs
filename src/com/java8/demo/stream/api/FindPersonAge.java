package com.java8.demo.stream.api;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class FindPersonAge {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter your brithdate (YYYY-MM-DD): ");
			String birthDateString = scanner.nextLine();
			LocalDate birthDate = LocalDate.parse(birthDateString);
			// Get the current date
			LocalDate currentDate = LocalDate.now();
			Period age = Period.between(birthDate, currentDate);
			System.out.println("You are "+ age.getYears()+ " years old.");
		}
	}

}