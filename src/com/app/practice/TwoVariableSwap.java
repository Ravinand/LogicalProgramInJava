package com.app.practice;

public class TwoVariableSwap {

	public static void main(String[] args) {

		int a = 40;
		int b = 9;

		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println("A : " + a);
		System.out.println("B : " + b);

		String first = "Ram";
		String second = "Sita";

		first = first + second;

		second = first.substring(0, first.length() - second.length());

		first = first.substring(second.length());

		System.out.println("First : " + first);
		System.out.println("Second : " + second);

	}

}
