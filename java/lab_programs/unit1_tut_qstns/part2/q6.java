/*

	Name : Tasdik Rahman
	Question : Unit 1 tutorial questions, PART-II, Question "6"

6. Write a simple java program to print the following pattern (for loop)
							*
					    *       *
					 *	           *
					    *       *
							*

*/

public class q6 {
    public static void main(String args[])
    {
        int size = 2 ,z = 1;
        for ( int i = 0; i<=size; i++){
            for (int j=size; j>i; j--){
                // printing space here
                System.out.print(" "); 
            }
            // printing asterisk here
            System.out.print("*");  
            if ( i > 0){
	            for ( int k=1; k<=z; k++){
	                System.out.print(" ");
	            }  
	            z += 2;
	            System.out.print("*");
            }
            System.out.print("\n");
        }
        z -= 4;
        for (int i=0; i<=size-1; i++){
            for (int j=0; j<=i; j++){
                System.out.print(" ");
            }
            System.out.print("*");
            for (int k=1; k<=z; k++){
                System.out.print(" ");
            }
            z -= 2;
            if (i != (size-1)){
                System.out.print("*");
            }
            System.out.print("\n");
        }
	}
}

/*
	-------------->> OUTPUT <<--------------
	  *
	 * *
	*   *
	 * *
	  *
	----------------------------------------
*/

	