package com.upskill.java;

public class Exception_TryCatcheFinale {
	
	/* Java Exceptions - Use "try - catch - finally"
	 * 
		A. Built-in Exceptions - Built-in exception throws by java which explain certain error situations
			 1. ArithmeticException - error has occurred in an arithmetic operation.
			 2. ArrayIndexOutOfBoundsException -  an array has been accessed with an illegal index.
			 3. ClassNotFoundException - try to access a class whose definition is not found
			 4. FileNotFoundException - a file is not accessible or does not open.
			 5. IOException - input-output operation failed or interrupted
			 6. InterruptedException  - thread is waiting, sleeping, or doing some processing, and it is interrupted.
			 7. NoSuchFieldException - class does not contain the field or variable specified
			 8. NoSuchMethodException - accessing a method which is not found
			 9. NullPointerException - referring to the members of a null object
			 10. NumberFormatException  -  a method could not convert a string into a numeric format
			 11. RuntimeException - any exception which occurs during runtime.
			 12. StringIndexOutOfBoundsException -  String class methods to indicate that an index is either negative or greater than the size of the string
		
		B. User-Defined Exceptions - User can also create exception where the error situations is not covered by java
	*/
	
	public static void main(String args[]) {
		
		//Built-in Exception- ArrayIndexOutofBoundException
		
		try{
			int[] ageGroup = new int[]{25,35,32,38,56};
			System.out.println("Student Age: " + ageGroup[5]);
		}catch (Exception e){
			System.out.println("Array Index not available !");
			e.printStackTrace();
			
		}
		
		
		
		//Specific Built -in Exception - NumberFormatException
		
		try{
			int num = Integer.parseInt("Test");
			System.out.println("Value of num int = " +num);		
		}catch (NumberFormatException e){
			System.out.println("Please Enter a Valid Number");
			e.printStackTrace();
		}
		
		
		//User Defined
		
		try{
			throw new MyException("Test");
			} catch (MyException e){
				System.out.println("User Defined Exception");
				e.printStackTrace();
			}
		
		
		
		
		finally {
			System.out.println("Test Execution Complted  !");
		}
		
	}

}
