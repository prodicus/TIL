/*

	Name : Tasdik Rahman
	Question : Unit 1 tutorial questions, PART-II, Question "3"
	
	3. Write a simple java program to find the given number is palindrome or not
		Eg. 1234, 2345 – not palindrome; 12321, 44444 – are palindrome 
*/

import java.util.Scanner ; 
public class q3{
	public static void main(String[] args) {
		
		// declaring an object of "Scanner" class 
		Scanner user_input = new Scanner(System.in) ; 

		// getting the number from the user 
		System.out.print("Enter the number  : ") ; 
		int number = user_input.nextInt() ; 

		// this stores the reversed number 
		int temp = number  ;
		int reverse = 0 ; 		

		while(number != 0){
			reverse = reverse * 10 ; 
			reverse = reverse + number%10 ; 
			number  = number/10 ; 
		}

		// the reversed number is stored in "reverse"
		System.out.println("Reverse of the number is : "+reverse); 

		if(temp == reverse)
			System.out.println("\nThe number " + temp + " is a palindrome!") ; 
		else
			System.out.println("\nThe number " + temp + " is NOT a palindrome!") ; 

	}
}

/*
	-------------->> OUTPUT <<--------------

	Enter the number  : 1221
	Reverse of the number is : 1221

	The number 1221 is a palindrome!

-------------------------------------------------

	Enter the number  : 1234
	Reverse of the number is : 4321

	The number 1234 is NOT a palindrome!

	----------------------------------------
*/
