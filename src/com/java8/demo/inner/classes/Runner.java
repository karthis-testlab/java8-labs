package com.java8.demo.inner.classes;

public class Runner {

	public static void main(String[] args) {
		Vechicle tata = new Vechicle();
		Vechicle tesla = new Vechicle() {
			public void fuel() {
				System.out.println("Main fuel for tesla is current!");
			};
		};
		tata.fuel();
		tesla.fuel();
	}

}
