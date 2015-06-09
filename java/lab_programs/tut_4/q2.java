/*

Author : Tasdik Rahman 
Question number 2, Tutorial week 4 :

Create a class Rectangle. The class has private attributes length and width, each of
which defaults to 1. It has methods that calculate the perimeter and the area of the
rectangle. It has set and get methods for both length and width. The set methods 
should verify that length and width are each floating-point numbers larger than 0.0
and less than 20.0. Write a program to test class Rectangle.

*/
import java.util.Scanner ;
class q2{
	public static class Rectangle{
		private float length, width , flag; 
		
		Rectangle(){		
			// default ctor
			length = 1 ; 
			width = 1 ; 
		}

		void set(){
			if( (length > 0 && width > 0) && (length < 20 && width < 20) ){
				System.out.println("Input meets the conditions : "); 
				flag = 1 ; 
			}

			else{
				System.out.println("Input Does not meet the conditions :"); 
				flag = 0 ; 
			}
		}

		void get(){
			Scanner user_input =  new Scanner(System.in) ; 
			System.out.print("length : ") ;
			length = user_input.nextFloat() ; 
			System.out.print("width : ") ;
			width = user_input.nextFloat() ; 
			set() ; 		// call the function set()
			if( flag == 1){
				perimeter() ; 
				area() ; 
			}
		}

		void perimeter(){
			System.out.println("perimeter : "+(2*(length + width))) ; 
		}

		void area(){
			System.out.println("area : "+(length * width)) ; 
		}
	}

	public static void main(String[] args) {
		Rectangle object = new Rectangle() ; 
		object.get() ; 
	}
}
/*
	-------------->>>>Output<<--------------------------
	length : 3
	width : 4
	Input meets the conditions : 
	perimeter : 14.0
	area : 12.0

	---------------------------------------------------
	
	length : 21
	width : 20
	Input Does not meet the conditions :
	
*/



