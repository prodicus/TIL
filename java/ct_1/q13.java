/*

Write a program to print the first, last and the middle digits of any given number. If
the number has 2 middle digits, it has to give the average of the two middle digits
else return the middle digit. 
Sample: 
Input: 123456 
Output: 1 6 3 

Input: 12345
Output: 1 5 3
*/
import java.util.Scanner ; 
class q13{
	public static void main(String[] args) {
		String var ;
		Scanner user_input = new Scanner(System.in); 
		int len ; 

		System.out.print("\nEnter your string : ");
		var = user_input.nextLine() ; 
		int parsed_num = Integer.parseInt(var) ; 

		len = var.length() ; 
		if((len % 2) == 0){
			// two middle numbers 
			System.out.println("\nstring lenght : " + len);
			int mid = len/2 ; 
			
			char  mid1 = var.charAt(mid) ; 
			char  mid2 = var.charAt(mid-1) ;

			int element1 = Character.getNumericValue(mid1) ; 
			int element2 = Character.getNumericValue(mid2) ; 

			System.out.println("Taking average of "+ element1 + " and " + element2 ) ; 
		
			int middle_element = ( element1 + element2 )/ 2 ; 
			System.out.println(var.charAt(0)+" "+ var.charAt(len-1) + " " + middle_element ) ; 
		}
		else{
			System.out.println("\nstring lenght : " + len);
			int mid = len/2 ; 
			System.out.println(var.charAt(0)+" "+ var.charAt(mid)+" "+ var.charAt(len-1)) ; 
		}
	}
}