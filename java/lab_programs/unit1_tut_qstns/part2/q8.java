/*

Name : Tasdik Rahman
Question : Unit 1 tutorial questions, PART-II, Question "8"

8. Write a simple java program to compute the value of  ex by using the formula
(Nested Looping)
ex   = 1+ x / 1! + x2/2!+ x3/3!+…… xn/n!

*/

public class q8{
	public static float e_pow_x(int num, float x){
	    float sum = 1.0f; // initialize sum of series
	 
	    for (int i = num - 1; i > 0; --i )
	        sum = 1 + x * sum / i;
	 
	    return sum;
	}

	public static void main(String[] args) {
		System.out.println() ; 

		int num = 10;
	    float x = 1.0f;

		System.out.println("e^x = "+e_pow_x(num, x)) ; 

		System.out.println() ; 
	}
}

/*
// Efficient program to calculate e raise to the power x
#include <stdio.h>
 
//Returns approximate value of e^x using sum of first n terms of Taylor Series
float exponential(int n, float x)
{
    float sum = 1.0f; // initialize sum of series
 
    for (int i = n - 1; i > 0; --i )
        sum = 1 + x * sum / i;
 
    return sum;
}
 
// Driver program to test above function
int main()
{
    int n = 10;
    float x = 1.0f;
    printf("e^x = %f", exponential(n, x));
    return 0;
}
*/


/*v
	-------------->> OUTPUT <<--------------

	----------------------------------------
*/