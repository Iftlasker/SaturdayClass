package com.upskill.java;

public class MyException extends Exception{
	
	String a;
	
	public MyException (String b){
		a=b;
	}
	
	public String Upskill(){
		return("This is User Defined Exception : " +a);
	}



}
