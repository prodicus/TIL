/*
Tuesday 03 February 2015 02:22:36 PM IST
Name : Tasdik Rahman
Question : Unit 1 tutorial questions, PART-II, Question "9"

9. Write a simple java program to demonstrate labeled break and labeled continue 
statement in two different/separate program.
*/

public class q9{

	public static void main(String[] args) {
		System.out.println() ; 
	
		OUTER:  //outer label
        for(int i = 0; i<10; i++){
            if(i % 2 == 0){
                System.out.println("\nOdd number: " + i + ", continue from OUTER label");
                continue OUTER;
            }
         
            INNER:
            for(int j = 0; j<10; j++){
                System.out.println("\nEven number: " + i + ", break  from INNER label");
                break INNER;
            }
        }

		System.out.println() ; 
	}
}

/*
	-------------->> OUTPUT <<--------------
	Odd number: 0, continue from OUTER label

	Even number: 1, break  from INNER label

	Odd number: 2, continue from OUTER label

	Even number: 3, break  from INNER label

	Odd number: 4, continue from OUTER label

	Even number: 5, break  from INNER label

	Odd number: 6, continue from OUTER label

	Even number: 7, break  from INNER label

	Odd number: 8, continue from OUTER label

	Even number: 9, break  from INNER label

	----------------------------------------
*/