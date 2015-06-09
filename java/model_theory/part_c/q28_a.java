import java.util.Scanner;

class Select {
	Scanner input = new Scanner(System.in);
	int power;

	void prompt(){
		System.out.print("Enter power : ");
		power = input.nextInt()	;
	}

	void message(int number){
		System.out.println("There is no single word for 10 raised to the " + number + "th power !") ; 
	}

	void display(){
		switch(power){
			case 6 : System.out.println("10 raised to the 6th power is a million ");
					 break;
			case 9 : System.out.println("10 raised to the 9th power is a Billion ");
					 break;
			case 12 : System.out.println("10 raised to the 12th power is a trillion ");
					 break;
			case 15 : System.out.println("10 raised to the 15th power is a Quadrillion ");
					 break;
			case 18 : System.out.println("10 raised to the 18th power is a Quintillon ");
					 break;
			case 21 : System.out.println("10 raised to the 21th power is a Sextillion ");
					 break;
			case 30 : System.out.println("10 raised to the 30th power is a Ninillion ");
					 break;
			case 100 : System.out.println("10 raised to the 100th power is a Googol ");
					 break;
			default : message(power);
					break ; 
		}
	}
}   


class q28_a{
   public static void main(String[] args) {
   		Select obj = new Select();
   		Scanner input = new Scanner(System.in);
   		char ch = 'y';
		do{
			obj.prompt();
			obj.display();
			System.out.print("Want to enter more powers : "); 
			ch = input.next().charAt(0);
   		}while(ch == 'y');
   }
}