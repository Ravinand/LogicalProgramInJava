package com.app.hello;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaxValue_8 {
	
	public static void main(String[] args) {
		
		List<Integer> list =new ArrayList<>();
		
		list.add(83);
		list.add(16);
		list.add(73);
		list.add(93);
		list.add(3);
		list.add(13);
		
		int maxValue=list.stream().max(Integer :: compare).get();
		int minValue=list.stream().min(Integer :: compare).get();
		
		long count = list.stream().count();
	
		
		
		System.out.println("Value max : "+ maxValue);
		
		System.out.println("Min Value : "+ minValue);
		
		System.out.println("Count value : "+ count);
		
		Collections.sort(list);
		System.out.println("Sorted Value : "+list);
		
		
		Collections.reverse(list);
		System.out.println("Reverse Value : "+list);
		
		
	//	forEach methods =========================
		
		list.forEach(System.out:: println);
		
		System.out.println("===========================================");
		
		list.forEach(object -> System.out.println(object));
		
		
	}

}
