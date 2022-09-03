package com.upskill.java;

public class Loops {

	public static void main(String[] args) {
	//	practiceForLoop();
	//	practiceWhileLoop();
	//	practiceDoWhileLoop();
	//	practiceInfiniteLoop();
		multipicationTable();

	}
	
	public static void practiceForLoop(){
		int i;
		for(i=100;i>1;i--){
			System.out.println("For Loops Number: " +i);
		}
	}
	
	public static void practiceWhileLoop(){
		int i =100;
		while (i>=1){
			System.out.println("While Loops numbers = " +i);
			i--;
		}
	}
	
	public static void practiceDoWhileLoop(){
		int i=100;
		do {
			System.out.println("Do While Loops numbers = " +i);
			i--;
		} while (i>=1);
	}
	
	public static void practiceInfiniteLoop(){
		int i;
		for(i=1; ; i++){
			System.out.println("Infinite Loop Numbers:" + i);
			}
	
		}
	
	public static void practiceNestedFoorLoop(){
		int i;
		int j;
		for (i=1;i<=10;i++){
			for(j=1;j<=10;j++){
				System.out.println("Nested For Loop Numbers =" +i);
			}
			System.out.println("Increse value of 1 = "+i);
		}
	}
	
	
	public static void multipicationTable(){
		for (int row=1; row <=10; row++){
			for (int col=1; col<=10;col++){
				int table =row*col;
				System.out.print(table +" ");
			}
			System.out.println(" ");
		}
	}
	

}
