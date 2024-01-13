package com.java8.demo.inner.classes;

public class Example {
	
	public static void main(String[] args) {
//        try{
//            System.out.println("In try block");
//            System.exit(1);
//        } catch (Exception e) {
//           System.out.println("In catch block");
//        } finally {
//            System.out.println("In finally block");
//        }
		int limit = 5;
		for(int i = 0; i < limit; i++) {
			for (int j = 0; j < limit; j++) {
				if (i == j) {
					System.out.print(1);
					System.out.print(" ");
				} else {
					System.out.print(0);	
					System.out.print(" ");
				}				
			}
			System.out.println();
		}
		
    }

}
