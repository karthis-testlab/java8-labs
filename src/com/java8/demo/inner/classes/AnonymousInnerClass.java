package com.java8.demo.inner.classes;

public class AnonymousInnerClass {
	
	public AnonymousInnerClass() {
		Runnable run = new Runnable() {			
			@Override
			public void run() {
				System.out.println("Run");
			}
		};
		Thread thread = new Thread(run);
		thread.start();
	}
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		AnonymousInnerClass anonymous = new AnonymousInnerClass();
	}

}