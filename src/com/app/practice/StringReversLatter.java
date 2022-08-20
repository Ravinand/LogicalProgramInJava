package com.app.practice;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringReversLatter {
	public static void main(String[] args) {

		String s = "Ravinand";

		for (int i = s.length() - 1; i >= 0; i--) {
			System.out.print(s.charAt(i));
		}
		System.out.println();
		// java 8================

		String result = Stream.of(s).map(data -> new StringBuffer(data).reverse()).collect(Collectors.joining());

		System.out.println("Result :" + result);

		for (int i = s.length() - 1; i >= 0; i--) {
			System.out.print(s.charAt(i));
		}

		

	}

}
