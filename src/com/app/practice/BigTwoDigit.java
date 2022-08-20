package com.app.practice;

public class BigTwoDigit {

	public static void main(String[] args) {

		int array[] = { 23, 23, 566, 3, 4, 54, 6, 5, 44, 9, 6, 5, 44, 9, 6, 5, 44, 9, 569, 67, 34 };

		int one = 0;
		int two = 0;

		for (int value : array) {
			if (one < value) {

				two = one;
				one = value;
			} else if (two < value) {
				two = value;
			}
		}
		System.out.println("one :" + one);
		System.out.println("two :" + two);

		// ================ Acceding order: - ====================================

		System.out.println(" ================ Accending order: - ====================================");
		int tam = 0;

		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					tam = array[i];
					array[i] = array[j];
					array[j] = tam;
				}
			}
		}
		for (int i = 0; i < array.length; i++) {

			System.out.println("Accending order  :" + array[i]);
		}
		System.out.println(" ===============");

		// ============= Descending Order :- ====================================

		System.out.println(" ============= Descending Order :- ====================================");
		int des = 0;

		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {

				if (array[i] < array[j]) {

					des = array[i];
					array[i] = array[j];
					array[j] = des;
				}
			}
		}

		for (int i = 0; i < array.length; i++) {
			System.out.println("Desending order : " + array[i]);
		}

		// ==================== Find Duplicate Number================================
		System.out.println(" ==================== Find Duplicate Number======================");

		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {

				if (array[i] == array[j]) {
					System.out.println("Duplicate Number :" + array[i]);
				}

			}
		}

	}

}
