/*
Author: Tasdik Rahman

16. a) An airlines announces discount on tickets depending upon destination chosen by the
passenger from the following:
Destination Rate of ticket (per person)
America
Rs. 50000.0

Singapore
Rs. 20000.0

Japan
Rs. 40000.0

Thailand
Rs. 30000.0

The discount will be given as per the given criteria:
Ticket Amount Discount on Total amount
Above Rs. 200000             25%
Rs. 150001 to Rs. 200000     20%
Rs. 100001 to Rs. 150000 	 15%
Less than Rs. 100000  		 10%
Write a Java program to input name of the passenger/group head (in case of more than 1
passengers), number of passengers and destination code viz:
A or a for America, S or s for Singapore, J or j for Japan, and T or t for Thailand. Calculate
the total ticket amount and discount amount. Find the net balance to be paid excluding the
discount. Print name, number of passengers, destination code, discount and total ticket amount to
be paid.

*/

import java.util.Scanner ; 
class q16_a{

	public static class Airline{
		String name ; 
		int no_of_customers ; 
		char code ; 
		int total ;
		float discount , payable ; 
		Scanner user_input = new Scanner(System.in) ;

		void get_details(){
			System.out.print("\nName : ")  ;
			name = user_input.nextLine() ; 

			System.out.print("\nNo of customers : ")  ;
			no_of_customers = user_input.nextInt() ; 

			System.out.print("\nCode : ")  ;
			code = user_input.next().charAt(0) ; 

			Calculate() ; 
		}

		void print(){
			System.out.println("\nName : " + name
							+"\nNo of customers : " + no_of_customers
							+"\ncode : " + code 
							+"\nYou have total price as : " + total 
							+"\ndiscount on that : \t   " + discount
							+"\nPayable : \t\t  " + payable
							) ; 
 		}

 		void discount(int total){
 			if(total > 200000 ){
 				discount = (float)0.25 * total ; 
 			}	
 			else if ( total >= 150001 && total <= 200000){
 				discount = (float)0.20 * total ; 
 			}
 			else if ( total >= 100001 && total <= 150000){
 				discount = (float)0.15 * total ; 
 			}
 			else if ( total < 100000){
 				discount = (float)0.10 * total ; 
 			}
 			payable = total - discount ; 
 		}

		void Calculate(){
			switch(code){
				case 'a' :
				case 'A' :	System.out.println("\nDestination : America ! ") ; 
							total = (50000 * no_of_customers) ; 
							discount(total) ; 
							print() ; 
							break ; 
				case 's' :
				case 'S' :	System.out.println("\nDestination : Singapore ! ") ; 
							total = 20000 * no_of_customers ; 
							discount(total) ; 
							print() ; 
							break ; 
				case 'j' :
				case 'J' :	System.out.println("\nDestination : Japan ! ") ; 
							total = 40000 * no_of_customers ; 
							discount(total) ; 
							print() ;
							break ; 
				case 't' :
				case 'T' :	System.out.println("\nDestination : Thailand ! ") ; 
							total = 30000 * no_of_customers ; 
							discount(total) ; 
							print() ; 
							break ;
				default : System.out.println("Error !")  ; 
			}
		}
	}

	//  main() function 
	public static void main(String[] args) {
		System.out.println()  ;
		Airline obj = new Airline() ; 
		obj.get_details() ; 
	}
} 

/*


------------------------------------

Name : tasdik

No of customers : 3

Code : j

Destination : Japan ! 

Name : tasdik
No of customers : 3
code : j
You have total price as : 120000
discount on that : 	       18000.0
Payable : 		  		  102000.0
-------------------------------------------

Name : Tasdik

No of customers : 4

Code : s

Destination : Singapore ! 

Name : Tasdik
No of customers : 4
code : s
You have total price as : 80000
discount on that : 	       8000.0
Payable : 		  		  72000.0



*/