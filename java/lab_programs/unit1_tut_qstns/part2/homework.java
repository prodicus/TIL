/*


Name : Tasdik Rahman
Question : Unit 1 tutorial questions, Homework Question 

*/

/*
Homework
Project Question: 
Due: Should be completed before Next week Tutorial class
1. In this problem, you'll create a program that guesses a secret number!
The program works as follows: you (the user) thinks of an integer between 0 (inclusive) and 100 (not inclusive). The computer makes guesses, and you give it input - is its guess too high or too low? Using Bisection search , the computer will guess the user's secret number!
Here is a transcript of an example session:
Please think of a number between 0 and 100!
Is your secret number 50?
Enter 'h' to indicate the guess is too high. Enter 'l' to indicate the guess is too low. Enter 'c' to indicate I guessed correctly. l
Is your secret number 75?
Enter 'h' to indicate the guess is too high. Enter 'l' to indicate the guess is too low. Enter 'c' to indicate I guessed correctly. l
Is your secret number 87?
Enter 'h' to indicate the guess is too high. Enter 'l' to indicate the guess is too low. Enter 'c' to indicate I guessed correctly. h
Is your secret number 81?
Enter 'h' to indicate the guess is too high. Enter 'l' to indicate the guess is too low. Enter 'c' to indicate I guessed correctly. l
Is your secret number 84?
Enter 'h' to indicate the guess is too high. Enter 'l' to indicate the guess is too low. Enter 'c' to indicate I guessed correctly. h
Is your secret number 82?
Enter 'h' to indicate the guess is too high. Enter 'l' to indicate the guess is too low. Enter 'c' to indicate I guessed correctly. l
Is your secret number 83?
Enter 'h' to indicate the guess is too high. Enter 'l' to indicate the guess is too low. Enter 'c' to indicate I guessed correctly. c
Game over. Your secret number was: 83
Your program should use bisection search. So think carefully what that means. What will the first guess always be? How should you calculate subsequent guesses? Hint: Your initial endpoints should be 0 and 100.


*/

class homework{
	public static void main(String[] args) {
		System.out.println() ; 

		Scanner user_input = new Scanner(System.in) ;

		char response ; 
		int lower_space = 0, upper_space  = 100 , guess = 0  ;

		System.out.println("Program to Guess the secret number :"
						   +"\nGuess a number between 0 an 100. Done ?") ;
		
		do{	
			guess = (lower_space + upper_space)/2 ;   //getting the middle element
			System.out.println("\nIs your number greater (or) lesser than "+guess) ;
			response = user_input.next().atChar(0) ; 

			if(response == 'c'){
				System.out.println("Your number is : "+guess)  ;
			}

			if(response == 'l'){
				upper_space = 
				guess = 
			}

		}while(response == 'l' || response == 'h' || response == 'c' )	

		System.out.println() ; 
	}
}
/*
	-------------->> OUTPUT <<-------------- 

	----------------------------------------
*/