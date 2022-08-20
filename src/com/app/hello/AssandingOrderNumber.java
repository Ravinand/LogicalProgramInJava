package com.app.hello;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AssandingOrderNumber {

	public static void main(String[] args) {

		int temp;

		int[] number = { 4, 2, 4, 2, 3, 4 };
		int value = number.length;

		/*
		 * Set a = new HashSet<>();
		 * 
		 * System.out.println("length" + value);
		 * 
		 * for (int i = 0; i < value; i++) { for (int j = i + 1; j < value; j++) {
		 * 
		 * if (number[i] > number[j]) { temp = number[i]; number[i] = number[j];
		 * number[j] = temp; } } } for (int i : number) { a.add(i); }
		 * 
		 * System.out.println("Element Length : " + a.size());
		 * System.out.println("Assanding Order Number :- ");
		 * 
		 * for (int i = 0; i < value - 1; i++) { System.out.print(number[i] + ","); }
		 * System.out.println(number[value - 1]);
		 */

		// =========================================================

		int []cd=removeDuplicates(number);
		for(int i: cd) {
			System.out.println("====== :"+i);
		}
	}
	
	public static int[] removeDuplicates(int []s){
	    int [] k = new int[s.length];
	    k[0]=s[0];
	    int m =1;
	    for(int i=1;i<s.length;++i){
	        if(s[i]!=s[i-1]){
	            k[m]=s[i];
	            ++m;
	        }//endIF
	    }//endFori
	    return k;
	}//endMethod

}
