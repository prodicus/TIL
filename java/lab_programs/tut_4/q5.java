/*

Author : Tasdik Rahman 


Question number 5, Tutorial week 4 : 
	Write a java program to demonstrate constructor and method overloading
	Note : Use default constructor also
*/

class q5{
	static class demo{
		// ----------->>>>> Ctor overloading
		demo(){
			// default ctor
			System.out.println("Inside default ctor !") ; 
		}
		demo(int num){
			System.out.println("Inside parameterised ctor which takes "+
													num +
												 " as arg !") ;
		}
		demo(float num){
			System.out.println("Inside parameterised ctor which takes " +
													num +
													" as arg !") ;
		}
		// ----------->>>>>>> method overloading
		void method(int data){
			System.out.println("INTEGER data "+data+" is passed inside method() : ") ; 
		}

		void method(float data){
			System.out.println("FLOAT data "+data+" is passed inside method() : ") ;
		}
	}

	public static void main(String[] args) {
		demo obj1 = new demo() ;   // call the default ctor	
		demo obj2 = new demo(3) ; 	// calls the ctor with integer parameters
		demo obj3 = new demo(5.6f) ;  // calls the ctor with float parameters

		// showing method overloading

		obj1.method(2) ; 		// calls the method() with integer parameters
		obj1.method(6.6f) ; 		// calls the method() with float parameters
	}
}

/*
	-------------->>>>Output<<--------------------------
	Inside default ctor !
	Inside parameterised ctor which takes 3 as arg !
	Inside parameterised ctor which takes 5.6 as arg !
	INTEGER data 3 is passed inside method() : 
	FLOAT data 5.6 is passed inside method() :

*/





