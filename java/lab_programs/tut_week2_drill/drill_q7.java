/*
	Name  : Tasdik Rahman 		
	Question : 	Drill question "7"

*/

public class drill_q7{
	int myArray[] = new int[2];
	public static void main(String[] args) {   
		myArray[0] = 5;
		myArray[1] = 6;
		System.out.println("Value at index 0"+myArray[0]);
		System.out.println("Value at index 1"+myArray[1]);
	}
}
/*
	-------------->> OUTPUT <<--------------
	error: non-static variable myArray cannot be referenced from a static context
		myArray[0] = 5;
		^
		myArray[1] = 6;
		^
	
	-->>"Corrections"<<--
	it should be "int myArray[] = new int[2];"

	-->>Output (After correction)<<--
	
	Value at index 05
	Value at index 16

	----------------------------------------
*/
