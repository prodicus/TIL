/*
	Name  : Tasdik Rahman 		
	Question : Tutorial 2, Program 1:

	1. Write a program with appropriate classes and methods ( with proper selection of
		DATA TYPES based on requirement specified )which finds if a user is student or
		faculty. If student your program should be capable of taking inputs like
		1. Reg Number (assume 5bits)
		2. Year of Study (1/2/3/4)
		3. Section
		4. Scholarship, if any (assume Formula: cgpa *10000)
		5. Total living( including academic)expenses for 4 years
		6. Total number of Students in your campus
		7. Total number of students in University across all campuses and all
		disciplines
		
		And prints it like : You are a student with Reg.Number 12345 and you
		belong to II C and eligible for a scholarship of 92000 per year as your cgpa
		is 9.2 and your total living expense is 500000.6789. Total number of
		students in your campus is 8000 and across campus is 25000
		Else if Faculty print “Permission denied to enter details”		

*/
import java.util.Scanner;
class student{
	short reg_no ; 
	short year_of_study ; 
	String  section ;
	float cgpa ; 
	float scholarship ; 
	int   tot_expense; 
	short tot_students_campus ; 
	int   tot_students_all ; 

	void get_data(){								// method used to get the details of the student
		/*creating an object of scanner class*/
		
		Scanner user_input = new Scanner(System.in) ; 

		/*taking user inputs now using the object we created*/

		System.out.println("\nSection : ") ; 
		section = user_input.nextLine() ; 
		
		System.out.println("\nRegister number : ") ; 
		reg_no = user_input.nextShort() ; 
		
		System.out.println("\nYear of study : ") ;
		year_of_study = user_input.nextShort() ; 
		
		System.out.println("\nCGPA : ") ; 
		cgpa = user_input.nextFloat() ; 
		
		System.out.println("\nTotal living costs : ") ; 
		tot_expense = user_input.nextInt() ; 
		
		System.out.println("\nTotal students on this campus : ") ; 
		tot_students_campus = user_input.nextShort() ; 
		
		System.out.println("\nTotal students on all the campuses :  ") ; 
		tot_students_all = user_input.nextInt() ; 

		//---------------------------------------------
		// Calculating the scholarship based on CGPA 
		scholarship = cgpa*10000 ; 
		// --------------------------------------------
	}
	void print(){
		// printing the information which we just got from the user 
		System.out.println("\nYou are a student with Reg.Number " +reg_no + " and you "+ 
							" belong to IT "+section+" and eligible for a scholarship "+ 
							" of "+scholarship+" per year as your cgpa is "+cgpa+" and "+
							" you total living expense is "+tot_expense+". Total "+
							" number of students in your campus is "+tot_students_campus+
							" and across campus is "+tot_students_all) ;
	}
}

public class tut2_q1{							// the main class
	public static void main(String[] args) {

		System.out.println() ; 					//better readability 

		student obj = new student() ; 			// initializing the object of class student
		/*
			creating a variable "status" which is used to know whether we have a student 
			or a faculty. 
		*/
		boolean status ;

		System.out.println("\nAre you a\n1)Faculty\n2)Student\n(Enter student = true (or) faculty = false) : ") ;

		Scanner user_input = new Scanner(System.in) ;
		status = user_input.nextBoolean() ; 
		if(status){					//if it is a student, this will execute
			obj.get_data() ; 
			obj.print() ; 
		}
		else{						// if it is a faculty, this will execute
			System.out.println("Permission denied to enter details !") ; 
		}
		System.out.println() ; 					//better readability 
	}
}