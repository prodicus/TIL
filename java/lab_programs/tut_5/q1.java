/*
	Author : Tasdik Rahman
	Question Tutorial Week 5 , Q1 ; 
*/

class Test{
	String getImage(String str){
		/*
		Generate the mirror image of a String and add it
		to the existing string.
		*/
		String first = str ; 

		// now to find the reverse of this string 

		String reverse = new StringBuffer(str).reverse().toString() ; 

		String temp = first.concat("|"); 
		String final_var = temp.concat(reverse) ; 
		return final_var ; 
	}
}
class q1{
	public static void main(String[] args) {
		Test obj = new Test() ; 
		String var  = obj.getImage("Hello") ; 
		System.out.println("\nString being passed  : " + "Hello") ; 
		System.out.println("Final String : " + var) ; 
	}
}

/* -----Output------
String being passed  : Hello
Final String : Hello|olleH
*/