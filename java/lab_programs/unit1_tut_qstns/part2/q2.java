/*

	Name : Tasdik Rahman
	Question : Unit 1 tutorial questions, PART-II, Question "2"

	2. Write a simple java program to find the greatest of 3 numbers using if..else statement.
*/

import java.util.Scanner ; 
public class q2{
	public static void main(String[] args) {
		System.out.println("Enter the three numbers which you want to compare : ") ; 

		// declaring an object of "Scanner" class 
		Scanner user_input = new Scanner(System.in) ; 

		// declaring the variables 
 		int num1, num2, num3 ;
		
		System.out.print("Number 1 : ") ; 
		num1 = user_input.nextInt() ; 

		System.out.println() ;
		 
		System.out.print("Number 2 : ") ; 
		num2 = user_input.nextInt() ; 
		
		System.out.println() ;

		System.out.print("Number 3 : ") ; 
		num3 = user_input.nextInt() ; 

		System.out.println() ;

		// checks if num1 is greater than both num1 and num2 
		if((num1 > num2) && (num1 > num3)){  
			System.out.println("Greatest of the three numbers is : "+num1) ; 
		}

		// checks if num2 is greater than both num1 and num3 
		else if((num2 > num1) && (num2 > num3)){
			System.out.println("Greatest of the three numbers is : "+num2) ; 
		}

		// checks if num3 is greater than both num1 and num2 
		else if((num3 > num2) && (num3 > num1)){
			System.out.println("Greatest of the three numbers is : "+num3) ; 
		}

		System.out.println() ;
	}
}


/*
	-------------->> OUTPUT <<--------------
	
Enter the three numbers which you want to compare : 
Number 1 : 10

Number 2 : 20

Number 3 : 30
Greatest of the three numbers is : 30
	----------------------------------------
*/
