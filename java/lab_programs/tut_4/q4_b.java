/*

Author : Tasdik Rahman 


Question number 4, Tutorial week 4 : 

Write a java program to demonstrate
a. the use of static block, static variable and static methods
b. the use of final variable, final class and final method.

*/

class q4_b{
	// to demonstrate final keyword
	public static final class Final{
		/*
			 AS THIS IS A FINAL CLASS EVERYTHING INSIDE THE CLASS WILL BE 
			 FINAL BY DEFAULT 
		*/
		 public class MyStack {
   private int maxSize;
   private long[] stackArray;
   private int top;
   public MyStack(int s) {
      maxSize = s;
      stackArray = new long[maxSize];
      top = -1;
   }
   public void push(long j) {
      stackArray[++top] = j;
   }
   public long pop() {
      return stackArray[top--];
   }
   public long peek() {
      return stackArray[top];
   }
   public boolean isEmpty() {
      return (top == -1);
   }
   public boolean isFull() {
      return (top == maxSize - 1);
   }
   public static void main(String[] args) {
      MyStack theStack = new MyStack(10); 
      theStack.push(10);
      theStack.push(20);
      theStack.push(30);
      theStack.push(40);
      theStack.push(50);
      while (!theStack.isEmpty()) {
         long value = theStack.pop();
         System.out.print(value);
         System.out.print(" ");
      }
      System.out.println("");
   }
}
		final int final_variable = 10 ; 

		/*
			---------------------
		 	final_variable = 20 ;
			---------------------			
			will give an error as final_varaible can be assigned only once
		*/	

		final void method(){
			System.out.println("Inside final method ! ") ; 
		}
	}

	/*
		---------------------			
		public class subclass extends Final_class{
			void method(){
				System.out.print("This is illegal !") ; 
			}
		}
		---------------------			
		// will give an error as final class cannot be subclassed.
		// and also because a final method cannot be overridden
	*/

	public static void main(String[] args) {
		
		Final final_object = new Final() ; 
		final_object.method() ; 
	
	}
}

/*
	-------------->>>>Output<<--------------------------
	Inside final method ! 
*/


