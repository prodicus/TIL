/*

	Name : Tasdik Rahman
	Question : Unit 1 tutorial questions, PART-II, Question "5"

	5. Write a simple java program to find the sum, product, difference and 
	quotient of any 2 numbers using switch-case statement by getting the choice 
	from the user. Demonstrate type casting for finding the quotient
*/
import java.util.Scanner ; 
public class q5{
	public static void main(String[] args) {
		System.out.println() ; 

		//creates an object of Scanner class 
		Scanner user_input = new Scanner(System.in) ; 	
		int num1, num2 ; 

		System.out.print("\nEnter the two numbers : " +
						 "\nnumber 1 : ") ; 	
		num1 = user_input.nextInt() ; 

		System.out.print("\nNumber 2 : ") ; 
		num2 = user_input.nextInt() ; 

		System.out.print("\nOperation you want to perform : " +
						   "\n\n1)sum" +
						   "\n2)difference" +
						   "\n3)product" + 
						   "\n4)quotient" 	) ; 

		char ch ; 			// to continue the loop until user wants 
		do{	
			user_input.nextLine();					//consumes enter key press
			System.out.print("\n\n-------------------->>Enter choice : ") ; 
			String choice; 
			choice = user_input.nextLine() ; 			// takes the user input

			switch (choice) {
				case "sum" :  System.out.println("\nSum of numbers : " +
												 num1 + " and " + num2 + " is : " +
												 (num1 + num2) ) ; 
							  break ; 
				case "difference": System.out.println("\nDifference of numbers : " +
												  num1 + " and " + num2 + " is : " +
												 (num1 - num2) ) ; 
								  break ; 
				case "product": System.out.println("\nProduct of numbers : " +
												  num1 + " and " + num2 + " is : " +
												 (num1 * num2) ) ; 
								break ; 
				case "quotient": System.out.print("\nQuotient of numbers : " +
												  num1 + " and " + num2 + " is : ");
								 double temp ; 
								 temp = (double)num1/num2 ; 
								 System.out.print(temp) ; 						 
								break ; 
				case "default" : System.out.println("\nError 404!! ") ; 
								 break ; 
			}
			System.out.print("\nWant to perform more operations(y or n) : ") ; 	
			ch = user_input.next().charAt(0) ;
			/* 
				SOURCE:http://stackoverflow.com/questions/13942701/take-a-char-input-from-the-scanner

				You could take the first character from Scanner.next:
					char c = reader.next().charAt(0);

				To consume exactly one character you could use:
					char c = reader.findInLine(".").charAt(0);

				To consume strictly one character you could use:
					char c = reader.next(".").charAt(0);
			*/
		}while(ch == 'y') ; 
						
		System.out.println() ; 
		
		
	}
}

/*
	-------------->> OUTPUT <<--------------
	Enter the two numbers : 
	number 1 : 5

	Number 2 : 2

	Operation you want to perform : 

	1)sum
	2)difference
	3)product
	4)quotient

	-------------------->>Enter choice : sum

	Sum of numbers : 5 and 2 is : 7

	Want to perform more operations(y or n) : y


	-------------------->>Enter choice : difference

	Difference of numbers : 5 and 2 is : 3

	Want to perform more operations(y or n) : y


	-------------------->>Enter choice : product

	Product of numbers : 5 and 2 is : 10

	Want to perform more operations(y or n) : y


	-------------------->>Enter choice : quotient

	Quotient of numbers : 5 and 2 is : 2.5
	Want to perform more operations(y or n) : n

	----------------------------------------
*/