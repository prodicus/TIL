/*
16. b) Write a program to input an integer array A[] of n size. Sort the array in ascending order. Then input another
number from the user and replace all the numbers less than that inputted number by their reverse.
Example :
If A[] = {38, 25, 16, 5, 12}, array after sorting is {5, 12, 16, 25, 38} If the number entered is 20 then final Output is {5,
21, 61, 25, 38}
*/
import java.util.Scanner ; 
public class q16_b {
	public static void main(String args[]){
		int i;
		int A[] = new int [10];
		Scanner S = new Scanner(System.in);
		
		System.out.print("Enter number of element in array : ");
		int n = S.nextInt();
		
		System.out.println("Enter array elements");
		
		for( i = 0; i < n; i++){
			A[i] = S.nextInt();
		}

		for( i = 0; i < n ; i++){	
			for(int j = i + 1 ; j < n ; j++){
				if( A[i] > A[j] ){
					int T = A[i];
					A[i] = A[j];
					A[j] = T;
				}
			}
		}

		System.out.println("Sorted Array");
		for( i = 0 ; i < n ; i++) {
		    System.out.print(A[i] + " ");
		}

		System.out.println();
		
		System.out.print("Enter Value :");
		int val = S.nextInt();
		i = 0;

		while(A[i] < val) {
			int temp , back = 0;
			temp = A[i];
			while(temp != 0) {
				back *= 10;
				back += temp % 10;
				temp /= 10;
			}
			A[i] = back;
			i++;
		}
		for( i = 0; i < n; i++)
		System.out.print( A[i] + " ");
	}
}