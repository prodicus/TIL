/*

	Name : Tasdik Rahman 
	Question  : Tutorial 2, Question 3

	3. Write a program to display
	Winter : if month is Dec or Jan or Feb
	Summer: if month is Mar or Apr or May
	Spring: if month is Jun or Jul or Aug
	Autumn: if month is Sep or Oct or Nov
	
	Hint: can use numbers to represent months like 12 means December Or enum or
              switch with strings(feature from java7 onwards)
*/

import java.util.Scanner ; 

class tut2_q3{
	public static void main(String[] args) {
		
		System.out.println() ;		//for better readability in the terminal
		
		//creating an object of the Scanner class 
		Scanner user_input = new Scanner(System.in) ; 

		System.out.println("Enter the month of the year : ") ;
		//takes the user input and stores it in month
		String month = user_input.nextLine() ;		
		
		switch(month){
			/*Summer time Starts*/
			case "march" : 
			case "april" : 
			case "may" : System.out.println("It's Summer Time !"); 
						 break  ;
			/*Summer time Ends*/
			
			/*Spring time Ends*/
			case "june" : 
			case "july" : 
			case "august" : System.out.println("It's Spring Time !"); 
						 	break  ;
			/*Spring time Ends*/

			/*Autumn time begins*/
			case "september" : 
			case "october" : 
			case "november" : System.out.println("It's Autumn Time !"); 
						 	  break  ;
			/*Autumn time Ends*/

			/*Winter time begins*/
			case "december"  :
			case "january"  :
			case "february" : System.out.println("It's Winter Time !"); 
						 	  break  ;
			/*Winter time Ends*/
			default : System.out.println("Error !"); 
					  break  ; 
		}
		
		System.out.println() ;		//for better readability in the terminal
	}
}