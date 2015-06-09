/*		System.out.println(“2”);
		System.out.println(“4”);
		System.out.println(“6”);
		System.out.println(“8”);
		System.out.println(“10”);
		System.out.println(“GoodBye”);

1. for
2. while 
3. do..while 
4. and also implement the same to print in reverse.
*/

// 1) using for loop
public class q4{
	public static void main(String[] args) {
		for (int  i = 2; i < 11 ; i = i+2) {
			System.out.println(i) ; 
		}	
		System.out.println("GoodBye")			 ; 
	}	
}

// 2. while 
public class q4{
	public static void main(String[] args) {
		int i = 2 ; 
		while(i < 11){
			System.out.println(i) ; 
			i += 2 ; 
		}
		System.out.println("GoodBye")			 ; 
	}	
}

// 3. do..while 
public class q4{
	public static void main(String[] args) {
		int i = 2 ; 
		do{
			System.out.println(i) ; 
			i += 2 ; 
		}while(i < 11) ; 
		System.out.println("GoodBye")			 ; 
	}	
}

// 4. and also implement the same to print in reverse.
public class q4{
	public static void main(String[] args) {
		int i = 10 ; 
		System.out.println("GoodBye")			 ; 
		do{
			System.out.println(i) ; 
			i -= 2 ; 
		}while(i > 1) ; 
	}	
}