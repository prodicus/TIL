/*

	0, Foo!, 4, 8, 12, 16, Foo!
		Pseudo code:
			for variable in range(20):
    			if variable % 4 == 0:
        			print variable
    			if variable % 16 == 0:
        			print 'Foo!' 

*/

public class q6_3{
	public static void main(String[] args) {
		System.out.print("Foo!") ; 
		for (int var = 4; var < 20 ; var++ ) {
			if(var % 4 == 0) {
				System.out.print(", "+ var) ; 
			}
			if(var % 16 == 0) {
				System.out.print(" ,Foo!")  ;
			}
		}
		System.out.println() ; 	
	}
}