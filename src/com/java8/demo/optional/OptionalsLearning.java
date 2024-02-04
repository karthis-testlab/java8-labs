package com.java8.demo.optional;

import java.util.Optional;

public class OptionalsLearning {
	
	public static void main(String[] args) {
		
		/* 
		 * Optional Class is comes from the java.util package
		 * 
		 * Optional is basically a class which is used as a container for a value.
		 * 
		 * The value can be, integer type or long or String or it can be collection of any objects
		 * 
		 * But that value should be only single value it only holds a single value multi-values are
		 * not allowed.
		 * 
		 * of() method - Creating optional with non-null value. If we gave null value it throws
		 *               java.lang.NullPointerException exception
		 *               
		 * ofNullable() method - Creating optional with null value. If we gave null value it return
		 *                       an Optional.empty value           
		 * 
		 * get() method - If a value is present, returns the value, otherwise throws NoSuchElementException
		 *                This method is not preferable the alternative one is orElseThrow() method
		 *                NoSuchElementException if no value is present
		 *                
		 *                  
		 * 
		 */
		
		 Optional<String> optionalString = Optional.of("Java");
		 System.out.println(optionalString);
		 
		 Optional<String> optionalName = Optional.ofNullable(null);
		 System.out.println(optionalName);
		 
		 System.out.println(optionalString.get());
		
		 System.out.println(optionalName.orElse("DEFAULT VALUE"));
		 
		 System.out.println(optionalName.orElseGet(() -> "DEFAULT VALUE"));
		 
		 optionalName = Optional.ofNullable("RAM");
		 
		 System.out.println(optionalName.orElse("DEFAULT VALUE"));
		 
		 System.out.println(optionalName.orElseGet(() -> "DEFAULT VALUE"));
		
	}

}