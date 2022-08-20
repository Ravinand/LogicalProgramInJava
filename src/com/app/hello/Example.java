package com.app.hello;

public class Example {

	static int temp;

	public static int maxArea(int[] height) {

		int size = height.length;

		int fast = 0;
		int second = 0;

		for (int i = 0; i < size; i++) {
			int curent = height[i];

			if (fast < curent) {
				second = fast;
				fast = curent;

			} else if (second < curent) {
				second = curent;
			}
		}
		System.out.println("First + Second " + fast + "...." + second);

		int value = size - 2;

		temp = value * second;

		return temp;
	}

	public static void main(String[] args) {
		System.out.println("Hello world.......!");

		int[] value = { 5, 6, 7, 4, 1, 3 };

		System.out.println(Example.maxArea(value));

	}

}
