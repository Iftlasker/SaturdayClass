package com.upskill.java;

public class Singleton {
	
	//Singleton is class that can have one object
	
	//Private constructor, It prevent any other class from instantiating
	//private constructor,It prevent any other class from 
	private Singleton(){
			
	}
	
	
	private static Singleton Singletonobj = new Singleton();
	
	//static instance method
	public static Singleton getInstance(){
		return Singletonobj;
	}
	
	protected static void demo(){
		System.out.println("Demo method for singleton class");
	}
	

}
