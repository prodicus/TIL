/*
	Name : Tasdik Rahman
	Question  : Tutorial 2, question 2

	2. Evaluate and code taking values from user using command line and Scanner:
	   a|4+c>>b&7
*/

import java.util.Scanner ; 

class tut2_q2{
	public static void main(String[] args){		
		//creating an object of the Scanner class 
		Scanner user_input = new Scanner(System.in) ;  
		
		System.out.println();	// for a newline

		System.out.println("To Evaluate the equation \"a|4+c>>b&7\" ");
		
		int a , b , c  ; 
		/*
		as the arguments taken from the command prompt are of "string" type we have to convert it
		into integer type.
		*/
		a = Integer.parseInt(args[0]) ; 
		b = Integer.parseInt(args[1]) ; 
		c = Integer.parseInt(args[2]) ;

		System.out.println("Result : "+(a|(((4+c)>>b)&7))) ; 

		System.out.println();	// for a newline

		/*	
		Note to self  : this piece of code is used to print all the arguments passed through the command line
		
			for(String s:args){
				System.out.println(s) ; 
			}

		*/
	}
}
