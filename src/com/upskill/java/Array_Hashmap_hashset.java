package com.upskill.java;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

import javax.print.DocFlavor.STRING;

public class Array_Hashmap_hashset {
	
	public static void main(String[] args){
		
		int age =34;
		
		int[] ageWolverine = new int[]{24,28,30,35,29,40};
		
		System.out.println("Student Age : " + ageWolverine[5]);
		
		System.out.println("Total Student : " + ageWolverine.length);
		
		String[] nameWolverine = new String[]{"Ansarul", "Liaqath", "Sheakh", "Omar"};
		
		System.out.println("Student Name :"  +nameWolverine[3]);
		
		
		// Multidimentional Array
		
		int [][] ageWolverine2D = {{24,28,30,35,29,40},
				{35,22,27}};
		
		
		System.out.println("Student Age 2D :"  +ageWolverine2D[0][3]);
		
		
		// HashmaHashMap<K, V> using key value pair
		
		
		HashMap<String, Integer> Student = new HashMap<String, Integer>();
		
		Student.put("Ansarul", 28);
		Student.put("Omar", 29);
		Student.put("Rushdi", 24);
		Student.put("Sheikh", 30);
		
		System.out.println("Student Age: "+ Student.get("Omar"));
		
		HashMap<String, String> Capital = new HashMap<String, String>();
		
		Capital.put("BD", "Dhaka");
		Capital.put("USA", "Wahington DC");
		
		System.out.println("Capital City: " + Capital.get("USA"));
		
		
		
		
		
		//Hashset store unordered collection containing unique value, Implementation of Set interface
		
		HashSet<String> car = new HashSet<String>(); 
		
		car.add("BMW");
		car.add("Audi");
		car.add("Ford");
		
		System.out.println("Car : " + car);
		
		//HashTable store multipul data using key-value pair, but is synchronized (only one thread can be modified)
		
		Hashtable<String, String> Region = new Hashtable<String, String>();
		
		Region.put("BD", "Asia");
		Region.put("USA", "North America");
		
		System.out.println("Region : " + Region.get("USA"));
		
		
	}

}
