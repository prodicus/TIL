/*
	Name  : Tasdik Rahman 		
	Question  :	Tutorial 1, Program 2: 
		
		Apply an Object oriented paradigm using java to develop a stand alone
		application to print what the user demands using methods Hint: Single class.Level: Basic
*/

import java.util.Scanner ; 		// importing Scanner class 

public class tut1_q2{

	static void get_data(){
		
		//creating object called user_input of class tut1_q2
		Scanner user_input = new Scanner(System.in) ; 		
		String name ; 
		
		System.out.println("Enter the argument you want to enter  :") ; 
		
		name  = user_input.nextLine(); 			// storing the user input in a "string" variable called name 
		
		System.out.println("You have entered : "+name) ; 		// printing the user input
	}
	public static void main(String[] args){
		System.out.println() ;		//for better readability in the terminal

		get_data() ; 	// calling the method get_data() through an object

		System.out.println() ;		
	}
}
