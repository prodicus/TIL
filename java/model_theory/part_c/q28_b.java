/*

arraycopy

public static void arraycopy(Object src,
                             int srcPos,
                             Object dest,
                             int destPos,
                             int length)

Copies an array from the specified source array, beginning at the specified position, to the specified position 
of the destination array. A subsequence of array components are copied from the source array referenced by src to 
the destination array referenced by dest. The number of components copied is equal to the length argument. The 
components at positions srcPos through srcPos+length-1 in the source array are copied into positions destPos 
through destPos+length-1, respectively, of the destination array.

If the src and dest arguments refer to the same array object, then the copying is performed as if the components 
at positions srcPos through srcPos+length-1 were first copied to a temporary array with length components and 
then the contents of the temporary array were copied into positions destPos through destPos+length-1 of the 
destination array.

If dest is null, then a NullPointerException is thrown.

If src is null, then a NullPointerException is thrown and the destination array is not modified.

Otherwise, if any of the following is true, an ArrayStoreException is thrown and the destination is not modified:


----------------->> Example  << --------------------

int[] array1and2 = new int[array1.length + array2.length];
System.arraycopy(array1, 0, array1and2, 0, array1.length);
System.arraycopy(array2, 0, array1and2, array1.length, array2.length);

----------------->> Example  << --------------------


*/

import java.util.Scanner;

class ArrayMerge {	
	int a[] = {1,2,3,4} ; 
	int b[] = {5,6,7,8} ; 

	int c[] = new int[a.length + b.length];		// allocates enough memory for all the elementsno matter 
												// what the size of the both the arrays 
	void copy(){
		System.out.print("Array a : ");
		for(int var : a){
			System.out.print(var) ; 
		}

		System.out.println();

		System.out.print("Array b : ");
		for(int a : b){
			System.out.print(a) ; 
		}

		System.arraycopy(a, 0, c, 0, a.length);
		System.arraycopy(b, 0, c, a.length, b.length);

		System.out.println();
		System.out.println("After copying  : ");

		System.out.print("Array c :");
		for(int a : c){
			System.out.print(a) ; 
		}
		System.out.println();
	}

}   

class q28_b{
   public static void main(String[] args){
		ArrayMerge obj = new ArrayMerge();
		obj.copy() ;
   }
}

