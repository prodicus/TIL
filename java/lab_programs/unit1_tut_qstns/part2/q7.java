/*

Name : Tasdik Rahman
Question : Unit 1 tutorial questions, PART-II, Question "7"

7. Write a simple java program to print the following (while loop)
N		N*N		N!
1		1		1
2		4		2
3		9		6 etc

*/

public class q7{
	
	public static void main(String[] args) {
		System.out.println("") ; 

		System.out.println("\nN\tN*N\tN!") ;
		int num = 1; 
		while(num < 4){
			print(num) ;
			num++  ;
		}

		System.out.println("") ; 
	}

	public static int multiplication(int num){
		return num*num ;
	}

	public static int factorial(int num){
		int fact = 1;
		 
		for (int i = 1; i <= num; i++)
			fact = fact * i;
		return fact ; 
	}

	public static void print(int num){
		System.out.println(num +"\t"+multiplication(num)+"\t"+factorial(num)) ; 
	}

}


/*
	-------------->> OUTPUT <<--------------
	N	N*N	N!
	1	1	1
	2	4	2
	3	9	6
	----------------------------------------
*/