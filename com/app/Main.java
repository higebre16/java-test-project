package com.app;

import com.service.ArthimeticOperation;

public class Main {
	private static int firstNum = 23;
	private static int secondNum = 5;
	private static int zero = 0;

	public static void main(String[] args) {
		System.out.println(String.format("The sum of '%s' and '%s' is equal to '%s'", firstNum, secondNum,
				ArthimeticOperation.add(firstNum, secondNum)));
		
		System.out.println(String.format("The multiple of '%s' and '%s' is equal to '%s'", firstNum, secondNum,
				ArthimeticOperation.multimply(firstNum, secondNum)));
		
		System.out.println(String.format("The difference of '%s' and '%s' is equal to '%s'", firstNum, secondNum,
				ArthimeticOperation.substractd(firstNum, secondNum)));
		
		System.out.println(String.format("'%s' divided by '%s' is equal to '%s'", firstNum, secondNum,
				ArthimeticOperation.divide(firstNum, secondNum)));
	}

}
