/*

1) O/P  :  	0, 1, 2, 3, 4
		Pseudo code:
			num = 10
			for num in range(5):
    			print num
			print num 

*/
public class q6_1{
	public static void main(String[] args) {
		int num = 10 ;
		for (int i = 0 ; i < 5 ; i++ ) {
			System.out.print(i+", ") ; 
		}
		System.out.println();
	}
}