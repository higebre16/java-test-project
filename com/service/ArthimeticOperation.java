package com.service;

public class ArthimeticOperation {

	public static int add(int a, int b) {
		return a + b;
	}

	public static double divide(int a, int b) {
		if (b == 0) {
			System.out.println("Invalid input");

			return 0;
		}

		return a / b;
	}

	public static double multimply(int a, int b) {
		return a * b;

	}

	public static int substractd(int a, int b) {
		return a - b;
	}

}
