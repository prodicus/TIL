/*
Author: Tasdik Rahman

17. a. Design a class to overload a function printSeries( ) as follows:
i) void printSeries(char c, int n)
-to print the following format:
Example: printSeries(‘@’,3)
Output:
@
@@
@@@

ii) void printSeries(String s)
– to print the String in the following format: Example:
If s = "TIGER"
Output:
T
TI
TIG
TIGE
TIGER
*/

import java.util.Scanner ; 
class q17_a_1{
	public static void printSeries(char c, int n){
		for (int i = 0 ; i < n ; i++ ) {
			for (int j = 0 ; j <= i; j++ ){
				System.out.print(c) ;
			}
			System.out.println() ; 
		}
	}

	public static void printSeries(String s){
		int len = s.length() ; 
		for (int i = 0 ; i < len ; i++ ) {
			for (int j = 0 ; j <= i; j++ ){
				System.out.print(s.charAt(j)) 	;
			}
			System.out.println() ; 
		}	
	}
	public static void main(String[] args) {
		printSeries('@',3) ; 
		String str  = "TIGER" ; 
		System.out.println("\nOverloaded function  : ") ; 
		printSeries(str) ; 
	}
}