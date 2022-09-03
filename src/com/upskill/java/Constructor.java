package com.upskill.java;

public class Constructor {
	
	String admin;
	int adAge;
	
	public Constructor(){
		//admin = name;
		//adAge = age;
		System.out.println("Constructor");
	}
	
	public void fakeConstructor(){
		System.out.println("Fake Constructor");
	}
	
	

	public static void main(String[] args) {
		
		Constructor myObj = new Constructor();
		//Constructor myObj1 = new Constructor1();
		
		//System.out.println(myObj.admin);
		//System.out.println(myObj.adAge);
		//myObj.fakeConstructor();

	}

}
