import java.util.Scanner;

class Var_args {
	void display(String... args){
		for(String var : args)
			System.out.println("hello " + var);
	}
}
class q29_b_1{
   public static void main(String[] args) {
   		Var_args obj = new Var_args();
   		obj.display("tasdik", "rahman") ;
   }
}

