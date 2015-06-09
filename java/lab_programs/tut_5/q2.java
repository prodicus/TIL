/*
	Author : Tasdik Rahman
	Question Tutorial Week 5 , Q2 ; 
*/

class Test{
	void alterString(String str_var){
		/*
			method which accepts a String and replaces all the consonants in the String with
			the next alphabet
		*/
		System.out.println("\nThe main string is  : " + str_var + "\nReplacing the consonants !") ;

		// now finding the consonants in the entered strings 
		int len = str_var.length() ; // calculates the lenght of the string
		System.out.println("\nLenght of the string is : " + len) ; 

		String newString = "";

		for (int i = 0 ; i < len ; i++) {
			int flag = 0 ; 		//set to 1 if we have vowel in the string
			String arg = Character.toString(str_var.charAt(i)) ; 
			switch(arg){
				case "a" : 
				case "e" : 
				case "i" :
				case "o" : 
				case "u" : flag = 1 ; 
						   break ; 
			}

			if (flag == 0) {		//that is arr[i] is a consonant, replace it with the next character
				int charval = str_var.charAt(i) ; 
				String next = String.valueOf((char)(charval+1)) ; 
				System.out.println("\nNext char of : " + str_var.charAt(i) + " is  : " + next) ;
				// Creating a new String 
				// newString.concat(next) ; 
				newString = new StringBuffer(newString).append(next).toString() ; 
			}
			// else do nothing and move to the next String character

			else{
				newString = new StringBuffer(newString).append(str_var.charAt(i)).toString() ; 
			}
		}	
		System.out.println("\nNew string is  : " + newString ) ;	
	}
}
class q2{
	public static void main(String[] args) {
		Test obj = new Test() ; 
		obj.alterString("abcdefg") ; 
	}
}

/*-----Output------
The main string is  : abcdefg
Replacing the consonants !

Lenght of the string is : 7

Next char of : b is  : c

Next char of : c is  : d

Next char of : d is  : e

Next char of : f is  : g

Next char of : g is  : h

New string is  : acdeegh
*/