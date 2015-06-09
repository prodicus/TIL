/*
	Name : Tasdik Rahman
	Question : question 5 of tutorial question unit 1 !

5.  Write a java code with while loop that sums the values 1 through “end”, inclusive. “end” is a variable that we
 define for you. So, for example, if we define end to be 6, your code should print out the 
 result:21 which is 1 + 2 + 3 + 4 + 5 + 6.

 */
import java.util.Scanner ; 
public class q5{
 	public static void main(String[] args) {
 		
 		int sum = 0 ; 		// this will store the sum of the numbers 
 		
 		System.out.print("\nEnter the range until you want to find the sum : ")	 ; 
 		
 		Scanner user_input = new Scanner(System.in) ; 		// created an object of the class scanner 
 		int end = user_input.nextInt() ; 					// takes the range and stores in the variable end 

 		for (int i = 0 ; i <= end ; i++) {
 			sum +=i ; 				// adds the number until the last element is reached(which includes end)
 		}
 		System.out.println("\nThe sum of the numbers until \""+end+"\" is  : "+sum);  
 		System.out.println();  
 	}
 }

/*
	-------------->> OUTPUT <<--------------

 Enter the range until you want to find the sum : 6

 The sum of the numbers until "6" is  : 21

	----------------------------------------
*/


