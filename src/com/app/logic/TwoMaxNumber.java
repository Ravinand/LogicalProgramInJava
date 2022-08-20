package com.app.logic;

public class TwoMaxNumber {

	public static void main(String[] args) {

		int[] number = { 2, 64, 3, 4, 5, 3, 78, 3, 3, 2, 3, 5, 5, 6, 6, 6, 455, 4, 56, 3, 4, 8 };

		int one = 0;
		int two = 0;

		for (int maxValue : number) {
			if (one < maxValue) {
				two = one;
				one = maxValue;
			}

			else if (two < maxValue) {
				two = maxValue;
			}

		}

		System.out.println("Max One Vlaue :: " + one);
		System.out.println("Max Two Vlaue :: " + two);

	}

}
