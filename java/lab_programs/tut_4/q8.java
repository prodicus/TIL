/*

Author : Tasdik Rahman

Question number 8, Tutorial week 4 : 

Create a Stack class with overloaded constructors and methods that can perform PUSH and POP
operation on any given 10 values of be it all float or integer or long. And also include a method
“convertType” which is capable of converting one type to another.

*/
import java.util.Scanner ; 
/*
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

*/

class Stack{ 
	int size ; 
	int[] stackElement ; 
  	void print(){
  		// for printing the elements in stack
  		node *temp = head ; 
  		while(temp != NULL){
  			System.out.print( temp->data + " ") ; 
  			temp = temp->next ; 
  		}
  		System.out.println()  ; 
  	}

  	void push(int num){				
  		//insertion only at the head !
  		/*System.out.println("Number you want to push : ") ; 
  		int num  = user_input.nextInt(); */
  		node *temp = new node() ; 
  		temp->data = num ; 
  		temp->next = head ;  
  		head = temp ; 

  		size++ ; 
  		System.out.println("After pushing : " ); 
  		print(); 
  	}

  	void pop(){						
  		//deletion only at head
  		node *temp = head ; 
  		head = temp->next ; 
  		delete temp ; 
  		size-- ; 

		System.out.println("After popping : ") ; 
  		print(); 
  	}

  	void converting_number(){
  		System.out.print("converting integer to float : ") ; 
  		float num ; 

  	}
}	// class definition ends here 

class q8{

	public static void main(String[] args) {
		Stack object = new Stack() ; 
		// oovject was created 
 		// now calling the various function

		object.push(1) ; 
		object.push(2) ; 
		object.push(3) ; 
		object.push(4) ; 
		object.push(5) ; 
		object.push(6) ; 
		object.push(7) ; 
		object.push(8) ; 
		object.push(9) ; 
		object.push(10) ; 

		System.out.println("Popping vaues ") ; 

		object.pop() ; 
		object.pop() ; 
		object.pop() ; 

		System.out.println("popping 3 values") ; 
	}
}