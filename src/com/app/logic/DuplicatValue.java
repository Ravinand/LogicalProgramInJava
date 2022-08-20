package com.app.logic;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DuplicatValue {
	
	public static void main(String[] args) {
		List<Integer> ab=new ArrayList<Integer>();
		
		ab.add(34);
		ab.add(32);
		ab.add(3);
		ab.add(3);
		ab.add(3);
		ab.add(3);
		ab.add(30);
		ab.add(32);
		ab.add(30);
		ab.add(30);
		ab.add(30);
		ab.add(30);
		ab.add(32);
		ab.add(32);
		ab.add(32);
		ab.add(32);
		ab.add(32);
		
		System.out.println("All value : "+ ab);
		
		Object result = ab.stream().distinct().collect(Collectors.toList());
		
		System.out.println("Remove Duplicat Value : "+ result);
		
	}

}
