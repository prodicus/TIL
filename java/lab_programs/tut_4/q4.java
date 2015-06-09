/*

Author : Tasdik Rahman 


Question number 4, Tutorial week 4 : 

Write a java program to demonstrate
a. the use of static block, static variable and static methods
b. the use of final variable, final class and final method.

*/

/*

-------------- static block----------------------

->	static blocks are used for static initialization of a class. This code inside the 
	block is executed only once : the first time you make an object of the class or 
	the irst time you access the static access specifier of that class 

-> static blocks are executed even before the ctors of the class 

// filename: Main.java
class Test {
    static int i;
    int j;
    static {			// my static block 
        i = 10;
        System.out.println("static block called ");
    }
    Test(){
        System.out.println("Constructor called");
    }
}
 
class Main {
    public static void main(String args[]) {
 
       // Although we have two objects, static block is executed only once.
       Test t1 = new Test();
       Test t2 = new Test();
    }
}


---------->>>Output:
static block called
Constructor called
Constructor called
-------------- ----------- ----------------------


-------------- static method----------------------
->	static methods of a class can be called without any object creation. Have you seen the static keyboard before the main.
    It's because program execution starts at main and no object has been created yet then

    class Difference {
 
	  public static void main(String[] args) {
	    display();  //calling without object
	    Difference t = new Difference();
	    t.show();  //calling using object
	  }
	 
	  static void display() {
	    System.out.println("Programming is amazing.");
	  }
	 
	  void show(){
	    System.out.println("Java is awesome.");
	  }
	}

---->> Output 

	Programming is amazing 
	Java is awesome
-------------- ----------- ----------------------


-------------- static variables----------------------
-> 	static variables are common for all the objects of the class.
-------------- ----------- ----------------------



-------------- final keyword----------------------
	

Final keyword has a numerous way to use:

    A final class cannot be subclassed.
    A final method cannot be overridden by subclasses
    A final variable can only be initialized once

Other usage:

    When an anonymous inner class is defined within the body of a method, all variables declared 
    final in the scope of that method are accessible from within the inner class

A static class variable will exist from the start of the JVM,
and should be initialized in the class. The error message won't appear if you do this.

-------------- ----------- ----------------------
*/

/*----------------------------*/
/* Note :  final method remaining*/
/*----------------------------*/

class q4{
	// to demonstrate static keyword
	static int count   ; 		// used to store the number of objects created 
	public class Static{

		static{
			System.out.println("\nInside static block !") ; 
		}

		static void static_method(){
			System.out.println("\nInside static Method !" ) ;
 		}

		Static(){
			// ctor for the class Static
			System.out.println("\nInside Ctor for the class !") ; 
		}

		static void display(){
			System.out.println("\nThe no. of objects created : " + count) ; 
		}
	}

	// to demonstrate final keyword
	public final class Final{
		final int final_variable = 10 ; 

		/*
			---------------------
		 	final_variable = 20 ;
			---------------------			
			will give an error as final_varaible can be assigned only once
		*/	

		final void method(){
			System.out.println("Inside final method ! ") ; 
		}
	}

	/*
		---------------------			
		public class subclass extends Final_class{}
		---------------------			
	// will give an error as final class cannot be subclassed.
	*/

	public static void main(String[] args) {
		System.out.println("\nstatic class starts here : ") ; 
		Static static_obj = new Static() ; 
		static_obj.static_method() ; 
		static_obj.display() ; 

		System.out.println("Final class starts here : ") ; 

		Final final_object = new Final() ; 
		final_object.method() ; 

	}
}

/*
	-------------->>>>Output<<--------------------------

*/


