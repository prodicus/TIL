#include <iostream>
// #include <stack>				// using STL for the first time here 
using namespace std;  

// lets write our own stack first 


struct node{
	char data  ; 
	node *next ; 
} *head ; 

class Stack_class{
		// int top ; 
		// string str ; 
		char ch[5] ;
		int size ; 
	public : 
		Stack_class() ; 
		void print() ; 
		void push(char) ; 
		char top() ; 
		bool isEmpty() ; 
		void push_elements() ; 
		void pop() ; 
} ;

void Stack_class::pop(){
	node *temp = head ; 
	head = temp->next ; 
	delete temp ; 	
}

void Stack_class::push_elements(){
	cout << "About to push the elements in the array  : "  ; 

	for (int i = 0; i < size; ++i){
		cout << "pushing " << ch[i] ; 
		push(ch[i]) ; 
	}

	cout << "\nElements were pushed successfully : " ; 
	print() ; 

	//  start reversing the elements of the stack 

	for (int i = 0; i < size; ++i){
		ch[i] = top() ; 
		pop() ; 
	}

	cout << "\nThe reversed string is : " ; 
	for(int i = 0 ; i < size ; i++)
		cout << ch[i] ; 

	cout << "\n" ; 
}

Stack_class::Stack_class(){
	// str = "hello" ; 
	// size = str.length() ; 

	ch[0] = 'h'  ; 
	ch[1] = 'e'  ; 
	ch[2] = 'l'  ; 
	ch[3] = 'l'  ; 
	ch[4] = 'o'  ; 
	ch[5] = '\0'  ; 

	size = 5 ; 
	cout << "\nThe size of the character array is : " << size 
		 << "\nArray  : " ; 
	for(int i = 0 ; i < size ; i++) 
		cout << ch[i] ; 
	cout << "\n" ; 

	// pushing elements 

	push_elements() ; 
}

void Stack_class::print(){
	node *temp = head ; 
	while(temp != NULL) {
		cout << temp->data << " " ; 
		temp = temp->next ;
	}
	cout << "\n" ; 
}

void Stack_class::push(char num){
	cout << "\nInitially : " ; 
	print() ;

	node *temp = new node() ; 
	temp->data = num ; 
	temp->next = head ; 
	head = temp ; 

	cout << "\nafter insertion  : " ; 
	print() ; 
}

char Stack_class::top(){
	node *temp = head ; 
	return temp->data ; 
}

bool Stack_class::isEmpty(){
	return (head == NULL)?true:false ; 
}

int main(){
	cout << "\n" ; 

	head = NULL ; 
	Stack_class obj ; 
}

// we are not going to use a user defined class here as we will be using a STL 
