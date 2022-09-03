package com.upskill.java;

public class Multithreading {
	
	/* Multithreading is a Java feature that allows concurrent execution of two or more parts of a program.
	
	Threads can be created by using two mechanisms : 

		1. Extending the Thread class 
		2. Implementing the Runnable Interface */

	public static void main(String[] args) {
		int n = 3;														//Number of threads
		for (int i = 0; i < n; i++){
			MultithreadingDemo obj = new MultithreadingDemo();			// Obj for Extending the Thread class
			Thread obj2 = new Thread(new MultithreadingDemo2());		// Obj for Implementing the Runnable Interface
			obj.start();
			obj2.start();
		}
	}
}

class MultithreadingDemo extends Thread{							// Extending the Thread class
	public void run(){
		try{
			System.out.println("Thread " + Thread.currentThread().getId() + " is running");
		} catch (Exception e){
			System.out.println("Exception is caught");
		}
	}
}

class MultithreadingDemo2 implements Runnable{						// Implementing the Runnable Interface
	public void run(){
		try{
			System.out.println("Thread " + Thread.currentThread().getId() + " is running");
		} catch (Exception e){
			System.out.println("Exception is caught");
		}
	}
}