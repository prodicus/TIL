/*
   O/P :  0, 1, 2, 3, 4 
		Pseudo code:
			divisor = 2
			for num in range(0, 10, 2):
    			print num/divisor
*/

public class q6_2{
	public static void main(String[] args) {
		int divisor = 2 ; 
		for (int num = 0; num < 10 ; num += 2 ) {
			System.out.print(num/divisor+", ") ; 
		}
		System.out.println() ; 
	}
}