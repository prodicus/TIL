/*

Author : Tasdik Rahman 

Question number 4, Tutorial week 4 : 

Write a java program to demonstrate
a. the use of static block, static variable and static methods
b. the use of final variable, final class and final method.

*/

class Static_class{
	// to demonstrate static keyword
	static int count   ; 		
	
	// used to store the number of objects created 
	static{
		System.out.println("\nInside static block !") ; 
	}

	Static_class(){
		// ctor for the class Static
		Static_class.count++ ;  
	}

	static void display(){
		System.out.println("\nInside static Method !" + 
						   "\nValue of count(no. of objects created) = " + count ) ;
		
	}
}
class q4_a{
	public static void main(String[] args) {
		Static_class[] obj = new Static_class[10] ; 
		for (int i = 0 ; i < 10 ; i++ ) {
			obj[i] = new Static_class() ; 
		}

		Static_class.display() ; 
	}
}

/*
	-------------->>>>Output<<--------------------------
	Inside static block !

	Inside static Method !

	Value of count(no. of objects created) = 10
*/


