/*

Author : Tasdik Rahman 


Question number 3, Tutorial week 4 : 

Create class SavingsAccount. Use a static variable annualInterestRate to store the
annual interest rate for all account holders. Each object of the class contains a 
private instance variable savingsBalance indicating the amount the saver currently 
has on deposit.

Provide method calculateMonthlyInterest to calculate the monthly 
interest by multiplying the savingsBalance by annualInterestRate divided by 12; 
this interest should be added to savingsBalance.

Provide a static method modifyInterestRate that sets the annualInterestRate to a 
new value. Write a program to test class savingsAccount. Instantiate two savingsAccount objects, saver1 and
saver2, with balances of $2000.00 and $3000.00, respectively.

Set annualInterestRate to 4%, then calculate the monthly interest and print the new balances for both
savers. Then set the annualInterestRate to 5%, calculate the next month’s interest 
and print the new balances for both savers.

*/

class q3{
	
	public static class SavingsAccount{

		// to store the annual interest rate for all a/c holders
		static int annualInterestRate   ;
		// indicates amount the saver currently has to deposit
		private float savingsBalance ;  		

		public SavingsAccount(float var){
			// ctor for the class Savings class 
			savingsBalance = var ; 
		}

		void calculateMonthlyInterest(){
			// to calculate the monthly interest 
			float interest = (savingsBalance * annualInterestRate)/12 ; 
			savingsBalance += interest ; 
			System.out.println("Balance is " + savingsBalance) ; 
		}		

		static void modifyInterestRate(int rate){
			annualInterestRate = rate ;
		}
	}

	public static void main(String[] args) {
		SavingsAccount saver1 = new SavingsAccount(2000) ; 
		SavingsAccount saver2 = new SavingsAccount(3000) ;

		System.out.println("when interest rate = 4 ") ; 
		saver1.modifyInterestRate(4) ; 
		System.out.println("------>>>Saver 1  : ") ;
		saver1.calculateMonthlyInterest() ; 
		System.out.println("------>>>Saver 2  : ") ;
		saver2.calculateMonthlyInterest() ; 

		System.out.println() ; 	// for better readability 

		System.out.println("when interest rate = 5 ") ; 
		saver1.modifyInterestRate(5) ; 
		System.out.println("------>>>Saver 1  : ") ;
		saver1.calculateMonthlyInterest() ; 
		System.out.println("------>>>Saver 2  : ") ;
		saver2.calculateMonthlyInterest() ; 
 	}
}


/*
	-------------->>>>Output<<--------------------------

when interest rate = 4 
------>>>Saver 1  : 
Balance is 2666.6667
------>>>Saver 2  : 
Balance is 4000.0

when interest rate = 5 
------>>>Saver 1  : 
Balance is 3777.7778
------>>>Saver 2  : 
Balance is 5666.6665

*/



