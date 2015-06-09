
/*

Author : Tasdik Rahman

Question number 6, Tutorial week 4 : 
Write a java program to demonstrate the two types of nested classes in a single program.

*/
class Outer{
	int num  ; 
	Outer(){
		num = 10 ;
	}
	
	class Inner{		
		// this class will have access to all the methods and 
		// variables of the Outer class 
		void display(){
			System.out.println("Inside the Inner class  : "
							+ "\nValue of num inside class Outer : "
							+ num 
							) ; 
		}
	}

	void display(){
		Inner inner_obj = new Inner() ; 
		inner_obj.display() ; 
	}
}

class q6{
	public static void main(String[] args) {
		Outer outer_obj = new Outer(); 
		outer_obj.display() ; 
	}
}

/*
	-------------->>>>Output<<--------------------------
	Inside the Inner class  : 
	Value of num inside class Outer : 10
*/



