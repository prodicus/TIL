/*

Project Question

Homework

1. To Develop a Bank Application incrementally with phase1 requirements given below: (Level: Intermediate)
	1. Check if you have a method capable of creating SB_Account for N users (Hint: array of
		Objects)
		Syntax help:
			Classname array_name[]=new Classname[n];
			for loop on index variable
			array_name[index]=new Classname();
	2.  A method for Deposit
	3.  A method for withdrawal with validation on minimum Balance
	4.  A method for Enquiry (not only Balance) capable of providing all the details of any
		account holder on demand.
    5. Is your program capable of finding how many account holders are there in the bank
		when en-quired for? and List how many transactions happened (withdrawal, deposit )
		for each user and in the Bank as a whole. How will you achieve the above
		task?(clue:Non-access modifiers).
	
	Is your program capable of continuing n times transaction for any user (clue: ATM machine..Asking do you want to
	make another transaction? Hint: do..while)

*/

import java.util.Scanner ; 

class SB_Account{							
	// the class which holds the details of the customers

	// ------------- Attributes -------------
 		String name ;
		int acc_no ; 
		String city ; 
		float balance ; 
	// ------------- Attributes -------------

	// ------------- Methods ----------------
		SB_Account(){			//default ctor for the class SB_Account
			balance = 0 ; 		// at first balance is 0 
		}

		void get_details(){
			// method to get the details of the user
			System.out.print("\nEnter you Details "+
							 "\n\nName : "); 
			Scanner user_input = new Scanner(System.in) ;   
			name = user_input.nextLine();    // gets user name

			System.out.print("\nAccount number : ") ; 
			acc_no = user_input.nextInt() ;

			user_input.nextLine() ; 	// eats the enter pressed	

			System.out.print("\nCity of residence : ") ; 
			city = user_input.nextLine();

			System.out.println("\nDetails have been updated !") ; 
		}

		void deposit(){
			// to deposit the money in the SB_Account 
			System.out.print("\nAccount holder is " + name) ; 
			System.out.print("\n\nMoney to be deposited (Enter more than 1000 "
								+"if its your first deposit) : ") ; 
			Scanner user_input = new Scanner(System.in) ;   
			// creating onject of scanner class

			balance += user_input.nextFloat() ; 		
			System.out.print("Updated Balance : "+balance);
		}

		void withdrawal(){
			System.out.print("\nAccount holder is " + name) ; 
			// to withdraw money from the SB_Account specified !

			/*
				We need to have a minimum balance of Rs.1000 , 
				So first check for that minimum balance 
			*/
			if(balance < 1000){
				System.out.println("\n\nSorry ! Balance too low !") ; 
			}
			else{
				System.out.print("\nWithdrawal Amount : ") ;
				Scanner user_input = new Scanner(System.in) ; 
				float withdraw  = user_input.nextFloat(); 

				// Susbtracting the balance
				balance -= withdraw ; 

				System.out.print("Updated Balance : "+balance);
			}
		}

		void enquiry(){
			// to give back the daetails of the the user 
			System.out.println("-------->> Details <<-------") ; 
			System.out.println("\nName : "+ name) ;
			System.out.println("\nAccount number : " + acc_no) ;
			System.out.println("\nCity : " + city) ;  
			System.out.println("\nBalance : " + balance) ; 
			System.out.println("------>> XXXXXXXX <<-------") ; 
		}

		void return_name(){
			System.out.print(name) ; 
		}
	// ------------- Methods ----------------
} 

class homework{
	public static void main(String [] args){
		System.out.println(); 

		// creating 10 references for the class SB_Account
		SB_Account[] customers = new SB_Account[10] ;  
		/*
			creates the array which can hold the references to 2 SB_Account objects.
			It doesn't create SB_Account objects themsleves. They have to be created 
			by using the ctors of the class SB_Account.

			The array customers holds 2 m/y spaces in which in which the addresses 
			of the 2 SB_Account objects may be stored	

			If we try to access SB_Account objects even before creating them we 
			will get a runtime error 

			So we will now create m/y spaces and will assign them to the references 
			to the array elements
		*/
		

	  int no_of_customers = 0 ; 	// initially nobody has an SB_Account
	  int deleted_accounts = 0 ; 	// initially no SB_Account

		int ch ; 		//  counter for repeating the while loop
		do{
				System.out.print("\n1)new user\t2)old user "+ "\t3)Delete SB_Account !"+
				 				 "\nChoice ? : ") ; 
				int users ; 
				Scanner user_input = new Scanner(System.in) ; 
				users = user_input.nextInt() ; 


				switch(users){
					case 1 :  customers[no_of_customers] = new SB_Account() ;
							  customers[no_of_customers].get_details() ; 
							  no_of_customers++ ;   	
							  break ;
					case 2 :  // there are users in the bank SB_Account right now 
										// check whether the object is there or Deleted !!

							  System.out.println("\nOperations which can be performed : "+
																	"\n1)deposit"+
																	"\n2)withdrawal"+
																	"\n3)enquiry"
																	) ; 

							  int choice ; 

							  user_input.nextLine() ; 		//eats the dangling nextline 
								System.out.print("\n------->>>>Enter your preferred operation : ") ; 
								choice = user_input.nextInt() ; 			
								// takes the users choice on which operation to be performed 

								int object_number ; 
								switch (choice) {
									case 1 :  System.out.print("\nEnter SB_Account holder number : ") ; 		
														object_number = user_input.nextInt() ; 									
														
														if(customers[object_number] != null){
															  object_number = user_input.nextInt(); 
															  customers[object_number].deposit();
														}
														else
															System.out.println("\nThe object was Deleted !!!") ; 
													  break ;

									case 2 : System.out.print("\nEnter SB_Account holder number : ") ; 
														object_number = user_input.nextInt() ; 
														
														if(customers[object_number] != null){
																 object_number = user_input.nextInt(); 
																 customers[object_number].withdrawal(); 
														}
														else
															System.out.println("\nThe object was Deleted !!!") ; 
													 break ;

									case 3 :  System.out.print("\nEnter SB_Account holder number : ") ; 
														object_number = user_input.nextInt() ; 

														if(customers[object_number] != null){
															  object_number = user_input.nextInt(); 
															  customers[object_number].enquiry();
														}
														else
															System.out.println("\nThe object was Deleted !!!") ; 
									  			  break ;
								}
								break ; 

					case 3 : // 1 SB_Account has to be deleted !!
								System.out.print("\nEnter the SB_Account to be deleted out of " + no_of_customers + " accounts  : ") ; 
								
								int account_to_be_deleted ;
								account_to_be_deleted = user_input.nextInt() ; 

								System.out.println("We are currently deleting : ") ; 
								
								customers[account_to_be_deleted].return_name() ; 
								customers[account_to_be_deleted] = null ; 

								deleted_accounts++ ;			// incrementing the counter which stores the no of deleted accounts

								System.out.println("\nDeleted !!"
													+"\nCurrent number of accounts : " + no_of_customers
													+"\nAccounts deleted : " + deleted_accounts
													) ; 
								break ;

					default : System.out.print("\nError !") ; 
								  break  ; 
				}

			System.out.print("\n------>>>>Want more operations(y or n) : ") ; 	
			ch = user_input.next().charAt(0) ;
			user_input.nextLine();					//consumes enter key press

		}while( ch == 'y' ) ; 

		System.out.println(); 
	}
}
