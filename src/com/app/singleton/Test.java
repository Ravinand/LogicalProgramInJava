package com.app.singleton;

public class Test {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		 SingltonClass s=SingltonClass.getInstance();
		 
		 System.out.println("S : "+ s.hashCode());
		 
	        for(int i=0; i<=80 ;i++) {
	        	System.out.println("Hello"+SingltonClass.getInstance().hashCode());
	        }
	   
	       
	      Object c= s.clone();
	      
	      System.out.println("Clone Methods : "+ c.toString());
	      
	      Object r=s.readResolve();
	      
	      System.out.println("ReadResolve Methdos : "+ r.toString());
	      System.out.println("ReadResolve Methdos : "+ r.hashCode());
	       
	       
	}

}
