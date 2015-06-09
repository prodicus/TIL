/*

Author : Tasdik Rahman

Question number 7, Tutorial week 4 : 
Write a simple java program to get the radius values through command line and convert
the values to float and find the area of circle.
*/

class q7{
	public static void main(String[] args) {
		float radius = Float.parseFloat(args[0]) ; 
		System.out.println("Area : " + (3.14 * radius * radius)) ; 		
	}
}

/*
	-------------->>>>Input<<--------------------------
	
	java q7 4.5

	-------------->>>>Output<<--------------------------
	
	Area : 63.585
*/



