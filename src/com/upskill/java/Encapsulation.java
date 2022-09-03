package com.upskill.java;

public class Encapsulation {
	
	//Encapsulation used to hide the data using setter and getter method
	
	private int ssn = 123456789;		//write only
	private String username = "abc";		//read only
	private String name = "upskill";		//read and write 
	
	
	//setter method
	public void setName(String value){
		name = value;

	}
	
	public void setSSN(int  value){
		ssn = value;

	}
	
	//getter name
	public String getUserName(){
		return username;
	}
	
	
	public String getName(){
		return name;
	}
	
	

	public static void main(String[] args) {
		
		Encapsulation obj = new Encapsulation();
		
		obj.setName("xyz");
		obj.setSSN(2323232);
		
		System.out.println("Name: " +obj.getName());
		
		//System.out.println("SSN : " +obj.setSSN(ssn));
		
		System.out.println("User Name : " +obj.getUserName());
		
		
	
		

	}
	
	
}	
