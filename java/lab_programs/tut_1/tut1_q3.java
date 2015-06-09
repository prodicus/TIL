/*
	Name  : Tasdik Rahman 		
	Question : 	Tutorial 1, Program 3:

	Apply an Object oriented paradigm using java to develop a stand alone
	application to call a method to do the same but from another class.Hint: more than one
	class needed. Level: Basic 
		
*/

// creating the class which we are going to call from the main() function
class A{
	static void method(){			
		System.out.println("\nInside called function") ; 
		System.out.println("\nComing out of the called function !") ; 
	}
}

public class tut1_q3{
	public static void main(String[] args){
		System.out.println("\nInside main function") ; 
		
		A obj = new A() ; 			//creating an object of class A by dynamic allocation

		
		obj.method();   			//calling method of the other function

		System.out.println("\n\nBack Inside main function\n") ; 
	}
}
