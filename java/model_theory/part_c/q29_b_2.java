import java.util.Scanner;

class Swapping {
	int a, b;

	Swapping(){
		a = 10 ; 
		b = 20 ; 
	}

	Swapping swap(){
		int temp = a ; 
		a = b ;
		b = temp ; 
		return this;
	}	

	void display(){
		System.out.println(" a = " + this.a + 
						   "\n b =  " + this.b) ;
	}
}   

class q29_b_2{
   public static void main(String[] args) {
   		Swapping obj = new Swapping() ;

   		System.out.println("Before swap") ; 
   		obj.display(); 

   		Swapping new_object = obj.swap() ; 
   		
   		System.out.println("After swap") ; 
   		new_object.display() ; 
   }
}

