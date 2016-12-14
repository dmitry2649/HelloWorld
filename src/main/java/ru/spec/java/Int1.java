package ru.spec.java;

public interface Int1 {
	void test1();
	default void test2() {
		System.out.println(1);
	};
}
