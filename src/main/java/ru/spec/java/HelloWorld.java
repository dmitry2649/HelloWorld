package ru.spec.java;


public class HelloWorld {
	
	private static final String HELLO_MESSAGE = "Hello World!";

	public static void main(String[] args) {
		System.out.println();
		A a = new A();
		System.out.println("a.x=" + a.getX() + " a.y=" + a.getY());
	}

}
