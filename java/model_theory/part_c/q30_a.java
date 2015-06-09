import java.util.Scanner;

class Super {
	int a ; 
	Super(int a){
		this.a = a ; 
	}

	void disp(){
		System.out.println(" a = " + a ) ;
	}
}   

class Sub extends Super{
	int b  ; 
	Sub(int a, int b ){
		super(a);
		this.b = b ; 
	}

	void disp(){
		// overriding the method
		System.out.println("a  = " + a + 
						   "\nb = " + b);
	}
}

class q30_a{
   public static void main(String[] args) {
   		Super obj = new Sub(2, 3) ;
   		obj.disp() ;
   }
}

