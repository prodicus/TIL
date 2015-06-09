/*
	Name  : Tasdik Rahman 		
	Question : 	Drill question "1" 

*/
public class drill_q1{ 
	public static void main(String[] args) { 
		boolean flag = true; 
		int x = 5; 
		int result = (8 * 2) % x; 
		System.out.print(!(result > 0) ^ true ^ (flag = false)); 
		System.out.print(flag); 
		System.out.println() ; 
	} 
} 

/*
	-------------->> OUTPUT <<--------------
	truefalse
	----------------------------------------
*/