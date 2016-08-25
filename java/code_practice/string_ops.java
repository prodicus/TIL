class string_ops{
	public static void main(String[] args) {/*
		char arr[] = {'a', 'b','c', 'd', 'e'} ;
		String str = new String(arr) ;
		System.out.println(str); ;

		String str1 = new String(arr,0, 3) ;
		System.out.println("str1 : " + str1 );

		String str2 = new String(str1);
		System.out.println("str2 : "+  str2);

		System.out.println("lenght of the str1 is : " + str1.length());

		String str3 = "" ;
		str3 = str3.concat(str1) ;
		System.out.println("Concatenation : " + str3);

		str3 = str3.concat(str1) ;
		System.out.println("Concatenation : " + str3);

		System.out.println("charAt(2) for str3 : " + str3.charAt(2));

		// getChars() -> returns an array for all the elements from the linked list of the required run rate

		System.out.println("using getChars()");

		String str4 = "This is a demo string which will be used for manilpulating the string  : " ;

		int start = 10 ;
		int end = 15 ;
		char buff[] = new char[end - start] ;

		str4.getChars(start, end, buff, 0) ;
		System.out.println(buff);
		*/

		StringBuffer str1 = new StringBuffer("tasdik") ;
		System.out.println(str1);

		str1.insert(7, "loves ") ;
		System.out.println(str1);

		str1.reverse() ;
		System.out.println(str1);
	}
}
