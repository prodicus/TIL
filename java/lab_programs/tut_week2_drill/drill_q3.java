/*
	Name  : Tasdik Rahman 		
	Question : 	Drill question "3"

*/
class drill_q3{ 
	public static void main(String [] args){ 
		int x = 100; 
		double y = 100.1; 
		boolean b = (x == y); 
		System.out.println(b); 
		System.out.println() ; 
	} 
}

/*
	-------------->> OUTPUT <<--------------
	error: possible loss of precision
		boolean b = (x = y); 
		                 ^
  	required: int
  	found:    double
	
	error: incompatible types
		boolean b = (x = y); 
		               ^
  	required: boolean
  	found:    int
	
	"2 errors"

	-->>"Corrections"<<--
	Change the "assignment" operator and change it to equality operator 

	-->>Output (After correction)<<--
	
	false

	----------------------------------------
*/