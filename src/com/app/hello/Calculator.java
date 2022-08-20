package com.app.hello;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

		Calculator.calculatorMethods();

		Scanner sc = new Scanner(System.in);
		System.out.println("Do you want to continue press :- Yes");
		String repeat = sc.nextLine();

		String se = repeat.toUpperCase();
		System.out.println("se " + se);

		if ("YES".equals(se.toUpperCase())) {
			Calculator.calculatorMethods();

		}

	}

	public static void calculatorMethods() {

		char operator;
		Double result, number1, number2;

		Scanner sc = new Scanner(System.in);

		System.out.println("Choose an Operation : +,-,* or /");

		operator = sc.next().charAt(0);

		System.out.println("Enter First Number :- ");
		number1 = sc.nextDouble();

		System.out.println("Enter Second Number :- ");
		number2 = sc.nextDouble();
		
			switch (operator) {
			case '+': {
				result = number1 + number2;
				System.out.println("Your Result :: " + number1 + " + " + number2 + " = " + result);
				break;
			}
			case '-': {
				result = number1 - number2;
				System.out.println("Your Result :: " + number1 + " - " + number2 + " = " + result);
				break;
			}

			case '*': {
				result = number1 * number2;
				System.out.println("Your Result :: " + number1 + " * " + number2 + " = " + result);
				break;
			}
			case '/': {
				result = number1 - number2;
				System.out.println("Your Result :: " + number1 + " / " + number2 + " = " + result);
				break;
			}

			default:
				throw new IllegalArgumentException("Please enter the properly value: " + operator);
			}
	

	}

}
