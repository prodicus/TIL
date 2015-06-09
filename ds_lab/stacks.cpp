/*
	Tuesday 03 February 2015 09:29:43 PM IST
    Exp 3  : Implementation of stack Data Structure!!
    
	1) Push 
	2) pop  

*/
/*

	Stack is nothing but a list with the restriction that the operations can be performed only from one side, called 
	"top".

	Follows the LIFO(Last in first out) rule

	Operations which we can perform are:
	1) push 
	2) pop
	3) top(gives the element at the top of the stack)
	4) IsEmpty ( tells whether the stack is empty or not ! )

*/

#include <iostream>
using namespace std ; 

struct node {
	int data ; 
	node *next ;
};
node *head ; 

class Stack{
	int size ; 
  public : 
  	Stack(){						//constructor for the class
  		size = 0 ; 
  	}

  	void print(){
  		// for printing the elements in stack
  		node *temp = head ; 
  		while(temp != NULL){
  			cout << temp->data << " "; 
  			temp = temp->next ; 
  		}
  		cout<<endl ; 
  	}

  	void push(){				
  		//insertion only at the head !
  		cout << "\nNumber you want to push : " ; 
  		int num ; 
  		cin >> num ;
  		node *temp = new node() ; 
  		temp->data = num ; 
  		temp->next = head ;  
  		head = temp ; 

  		size++ ; 
  		cout << "\nAfter pushing : " ; 
  		print(); 
  	}

  	void pop(){						
  		//deletion only at head
  		node *temp = head ; 
  		head = temp->next ; 
  		delete temp ; 
  		size-- ; 

  		cout << "\nAfter popping : " ; 
  		print(); 
  	}

  	void top(){						
  		//displays the top element of the stack
  		node *temp = head ; 
  		cout << "\nTop element is : " << temp->data ; 
  	}

  	void is_empty(){				
  		//displays if the stack is empty (or) not !
  		if(size == 0){
  			cout << "\nStack is empty !"; 
  		}
  		else{
  			cout << "\nStack has : " << size << " elements in it and they are : "
    				 << "\nList : " ; 
  			print() ; 
  		}      
  	}
};	// class definition ends here 

int main(){	
	Stack object ; 			//creating an object of class Stack.

	char ch = 'y' ; 

	cout<<"\n1) push "
      <<"\n2) pop " 
      <<"\n3) top" 
		  <<"\n4) is_empty "; 
    do{
        cout << "\n\nOperation you want to perform : " ; 
        int choice ; 
        cin >> choice ;         
        switch(choice){    
            case 1 : object.push()  ; 
                     cout << "\n" ; 
                     break ;
            case 2 : object.pop() ;   
                     cout << "\n" ; 
                     break ;
            case 3 : object.top() ;   
                     cout << "\n" ; 
                     break ;
            case 4 : object.is_empty() ;   
                     cout << "\n" ; 
                     break ;
            default: cout << "\nError !!" ;   
                     break ; 
        }

        cout<<"---->>>More operations???  "   ;
        cin>>ch ; 
    }while(ch == 'y') ; 
}

/*
  --------------------->>	OUTPUT <<----------------------

1) push 
2) pop 
3) top
4) is_empty 

Operation you want to perform : 1

Number you want to push : 10

After pushing : 10 

---->>>More operations???  y


Operation you want to perform : 1

Number you want to push : 20

After pushing : 20 10 

---->>>More operations???  y


Operation you want to perform : 2

After popping : 10 

---->>>More operations???  y


Operation you want to perform : 3

Top element is : 10
---->>>More operations???  y


Operation you want to perform : 4

Stack has : 1 elements in it and they are : 
List : 10 

---->>>More operations???  n

*/
