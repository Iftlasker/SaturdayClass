package com.upskill.java;

public class Method_overriding extends Polymorphism{

	public static void main(String[] args) {
		
			car();
			car(6);
			car("Blue");
			
		}
		
		public static void car(){
			System.out.println("My car is Toyota");
		}
		public static void car(String color){
			System.out.println("My car is Audi,Its color is  : " +color);
		}
		
		

}


