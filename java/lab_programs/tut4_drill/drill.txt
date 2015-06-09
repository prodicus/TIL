/*
	Author : Tasdik Rahman
	Roll Call : 1081310234
	
	Question: Tutorial 4 Drill, Question 1
*/
/*

public class q1 { 
	public static void main(String[] args) { 
		int x = 0; 
		int y = 0; 
		if ((true & false) | (true & false) & x++>0) 
			System.out.print("stmt1 "); 
		if (false || true | (++y> 0 | y++>0)) 
			System.out.print("stmt2 "); 
		System.out.print(x+" "+y); 
		System.out.println() ; 
	} 
} 

*/
/*
---------->> OUTPUT << -----------
stmt2 1 2 

----------------------------------
*/
//--------------------------------------------------------------
/*
	Question: Tutorial 4 Drill, Question 2
*/
/*

public class q1{
	public static void main(String[] args) { 
		int x = 1, y = 0; 
		if ((y == x++) && (x < ++y)) { } 
			// :: note ::
			// the first condition before && is false so the compiler won't even 
			// check the next statement for its trueness !!
			System.out.println(x + "" + y); 
	} 
}

*/
/*
---------->> OUTPUT << -----------
20
----------------------------------
*/

//--------------------------------------------------------------
/*
	Question: Tutorial 4 Drill, Question 3
*/
/*

public class q1{
	public static void main(String[] args) { 
		int x = 0, y = 0; 
		if ((y == x++) | (x < ++y)) { 
			++y; 
		} 
		System.out.println(x + "" + y); 
	} 
}

*/
/*
---------->> OUTPUT << -----------
12
----------------------------------
*/

//--------------------------------------------------------------
/*
	Question: Tutorial 4 Drill, Question 4
*/

/*
public class q1{
	public static void main(String[] args) { 
		int j = 10; 
			switch (1) { 
			case 20: j += 1;
			case 40: j += 2;
			default: j += 3;
			case 0: j += 4;
		} 
		System.out.print(j); 
	} 
}

*/
/*
---------->> OUTPUT << -----------
17
----------------------------------
*/

//--------------------------------------------------------------
/*
	Question: Tutorial 4 Drill, Question 5
*/
/*
public class drill{
	public static void main(String... s) { 
		char c = 'a'; 
		switch (c) { 
			case 'a': {	System.out.println("a");
									break; 
								} 
			case 97: {	System.out.println("97");
									break; 
								} 
		} 
	}
}
*/
/*
---------->> OUTPUT << -----------
error: duplicate case label
			case 97: {	System.out.println("97");
			^
Note : 'a' evaluates to 97, so thats the reason we get a compilation error!

So we should change the case with value 97 or change the value or variable 'c' to 
something else
----------------------------------
*/


//--------------------------------------------------------------
/*
	Question: Tutorial 4 Drill, Question 5
*/
/*

public class drill{
	public static void main(String [] args) { 
		int x = 0; 
		int y = 0; 
		for (int z = 0; z < 5; z++) {
			if (( ++x > 2 ) && (++y > 2)) {
				x++; 
			} 
		} 
		System.out.println(x + " " + y); 
	} 
}

*/
/*
---------->> OUTPUT << -----------
6 3
----------------------------------
*/


//--------------------------------------------------------------
/*
	Question: Tutorial 4 Drill, Question 6
*/
/*

public class drill { 
	public static boolean isEven(int x) { 
		return (x % 2 == 0) ? true : false; 
	} 
	public static void main(String[] args) { 
		System.out.print(isEven(2)); 
		System.out.print(isEven(3)); 
		System.out.print(isEven(4)); 
	} 
} 

*/

/*
---------->> OUTPUT << -----------
truefalsetrue
----------------------------------
*/


//--------------------------------------------------------------
/*
	Question: Tutorial 4 Drill, Question 7
*/
/*

public class drill { 
	public static void main(String[] args) {
			int entries[] = {1,2};
			int count=0;
			while (entries [count++]!=0){
				System.out.println(count);
			}
			System.out.println(count);
			System.out.println() ; 
		} 
}
 */
/*
---------->> OUTPUT << -----------
1
2
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 2
----------------------------------
*/


//--------------------------------------------------------------
/*
	Question: Tutorial 4 Drill, Question 8
*/
/*
public class drill {
	int x = 4;
	int y = 6;
	public drill(int x,int y) {
		this.x=x;
		this.y=y;
		System.out.println("Value of x :"+x);
		System.out.println("Value of y :"+y);
	}
	public void testMethod(int x) {
		System.out.print(this.x);
	}
	public static void main(String... args) {
		drill mytest = new drill(5,10);
		mytest.testMethod(10);
	}
}
 */
/*
---------->> OUTPUT << -----------
Value of x : 5
Value of x : 10
5 
----------------------------------
*/

//-----------------XXXXXXXXXXXXXXXXXXXXXXXXXXxXX---------------------------------------------
/*
	Question: Tutorial 4 Drill, Question 9
*/
/*
public drill{
	public class Tester {
		int p = test();
		int test() {
			System.out.println(p);
			return 99;
		}
		public static void main(String[] args) {
			Tester test=new Tester();
			System.out.println(test.p);
			System.out.println()  ;
		}
	}
}

*/
/*
---------->> OUTPUT << -----------

----------------------------------
*/


//-------------------------------------------------------------
/*
	Question: Tutorial 4 Drill, Question 10
*/
/*
public class drill { 
	public static void main(String args[]) { 
		int a = 5; 
		outside: for (int i = 1; i < 3; i++) { 
			inside: for (int j = 1; j < 3; j++) { 
				System.out.print(j); 
				if (a++ >6) 
					continue inside; 
				break outside; 
			} 
		} 
		System.out.println() ; 
	} 
}
*/

/*
---------->> OUTPUT << -----------
1
----------------------------------
*/

//-------------------------------------------------------------
/*
	Question: Tutorial 4 Drill, Question 11
*/

/*

public class drill {
	public void goLoop(int a) {
		start: for (int i = 1; i < 2; i++) {
			for (int j = 1; j < 2; j++) {
				if (a > 5) 
					break start;
				System.out.print(i + j);
			}
		}
	}
	public static void main(String args[]) {
		drill test = new drill();
		test.goLoop(15); 
	}
}

*/
/*
---------->> OUTPUT << -----------
No output
----------------------------------
*/



//-------------------------------------------------------------
/*
	Question: Tutorial 4 Drill, Question 12
*/
/*
public class drill {
	public static void main(String args[]) {
		int a = 5;
		outside: for (int i = 1; i < 3; i++) {
			inside: for (int j = 1; j < 3; j++) {
				System.out.print(j);
				if (a++ >6)
				continue inside;
				break outside;
			}
		}
	}

}

*/
/*
---------->> OUTPUT << -----------
1
----------------------------------
*/



//-------------------------------------------------------------
/*
	Question: Tutorial 4 Drill, Question 13
*/

/*
public class drill {
	public void goLoop(int a) {
		start: for (int i = 1; i < 2; i++) {
			for (int j = 1; j < 2; j++) {
				if (a > 5) {
					break start;
				}
				System.out.print(i + j);
			}
		}
	}
	public static void main(String args[]) {
		drill test=new drill();
		test.goLoop(15); 
	}
}

*/
/*
---------->> OUTPUT << -----------
No output
----------------------------------
*/



//-------------------------------------------------------------
/*
	Question: Tutorial 4 Drill, Question 14
*/

/*
public class drill {
	public static void main(String[] args) {
		boolean flag = true;
		int x = 5;
		int result = (8 * 2) % x;
		System.out.print(!(result > 0) ^ true ^ (flag = false));
		System.out.print(flag);
	}
}

*/
/*
---------->> OUTPUT << -----------
truefalse
----------------------------------
*/



//-------------------------------------------------------------
/*
	Question: Tutorial 4 Drill, Question 15
*/
/*
public class drill {
	public static void main(String[] args) {
		int x = 0, y = 0;
		x = 5 + y++;
		System.out.print(x + "" + y);
		x = 0;
		y = 0;
		x = 5 + ++y;
		System.out.print(x + "" + y);
	}	
}

*/
/*
---------->> OUTPUT << -----------
5161
----------------------------------
*/


//-------------------------------------------------------------
/*
	Question: Tutorial 4 Drill, Question 17
*/

/*
public class drill {
	public static void main(String[] args) {
		int x = 0, y = 0;
		x = 5 + y++;
		System.out.print(x + "" + y);
		x = 5 + ++y;
		System.out.print(x + "" + y);
	}
}	

*/
/*
---------->> OUTPUT << -----------
5172
----------------------------------
*/



//-------------------------------------------------------------
/*
	Question: Tutorial 4 Drill, Question 18
*/

/*
public class drill {
	public static void main(String[] args) {
		int a = 5 , b = 6, c = 7;
		System.out.println("Value is "+ b +c);
		System.out.println(a + b +c);
		System.out.println("String "+(b+c));
	}	
}

*/
/*
---------->> OUTPUT << -----------
Value is 67
18
String 13
----------------------------------
*/



//-------------------------------------------------------------
/*
	Question: Tutorial 4 Drill, Question 21
*/

/*
public class drill {
	public static void main(String[] args) {
		int [] a = new int[10];
		for (int i = 0; i < 10; i++)
			a[i] = 9 - i;
		for (int i = 0; i < 10; i++)
			a[i] = a[a[i]];
		for (int i = 0; i < 10; i++)
			System.out.println(a[i]);		
	}	
}
*/

/*
---------->> OUTPUT << -----------
0
1
2
3
4
4
3
2
1
0
----------------------------------
*/


//-------------------------------------------------------------
/*
	Question: Tutorial 4 Drill, Question 22
*/
/*
public class drill {
	public static void main(String[] args) {
		int N = 10;
		int[] a = new int[N];
		a[0] = 0;
		a[1] = 1;
		for (int i = 2; i < N; i++)
			a[i] = a[i-1] + a[i-2];		
	}	
}

*/
/*
---------->> OUTPUT << -----------
Fibonaccci series
----------------------------------
*/


//-------------------------------------------------------------
/*
	Question: Tutorial 4 Drill, Question 22
*/
/*
public class drill {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3 };
		int[] b = { 1, 2, 3 };
		System.out.println(a == b);		
	}	
}

*/
/*
---------->> OUTPUT << -----------
false
----------------------------------
*/


