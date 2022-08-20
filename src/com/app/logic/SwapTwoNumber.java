package com.app.logic;

public class SwapTwoNumber {
	public static void main(String[] args) {
		
	// Integer Variable :-
		
		int x =24;
		int y=30;
		
		x=x+y;
		y=x-y;
		x=x-y;
		
		System.out.println("Value for X :"+x);
		System.out.println("Value for y :"+y);
		
		//String Variable :- 
		
		String firstName= "Ravinand";
		String lastName = "Bharti";
		
		
		firstName = firstName+lastName;
		
		lastName =firstName.substring(0,firstName.length()-lastName.length());
		
		firstName=firstName.substring(lastName.length());
		
		System.out.println("First Name :: "+firstName);
		System.out.println("Last Name  :: "+ lastName);
				
		
		
		
	}

}
