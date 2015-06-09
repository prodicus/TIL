#include <iostream>
#include <stack>
using namespace std ; 

struct node{
	int data  ; 
	node *next ; 
} *head ; 

stack <struct node*> S ; 

class Stack{
public :
	void linked_list_insertion(int) ; 
	void print() ; 
	void reverse() ; 
} ; 

void Stack::linked_list_insertion(int num){
	cout << "\nInserting : " << num ; 

	node *temp = new node() ; 
	temp->data = num ; 
	temp->next = head;  
	head = temp ; 
}

void Stack::print(){
	cout << "\nList : " ; 
	node *temp = head ; 
	while(temp != NULL){
		cout << temp->data << " " ;
		temp = temp->next ; 
	}
	cout << "\n" ; 
}

void Stack::reverse(){

	// pushing the elements in the stack
	node *temp = head ; 
	while(temp != NULL) {
		S.push(temp) ; 
		temp = temp->next ; 
	}

	// returns the content at the top of the stack
	temp = S.top() ; 
	head = temp ; 
	S.pop() ; 

	while(!S.empty()){				// while the stack here is not empty
		temp->next = S.top() ; 
		S.pop() ; 
		temp = temp->next  ;
	}
	temp->next = NULL ; 		
	// initializes the last node's next pointer to NULL which is necessary for 
	// the print function to work
}

int main(){
	cout << "\n" ; 

	head = NULL ; 

	Stack obj ; 
	cout << "\nInserting elements in the linked list : " ; 
	obj.linked_list_insertion(1) ; 
	obj.linked_list_insertion(2) ; 
	obj.linked_list_insertion(3) ; 
	obj.linked_list_insertion(10) ; 

	cout << "\nAfter insertion : " ; 
	obj.print() ; 

	cout << "\nReversing the linked list : " ;
	obj.reverse() ; 

	cout << "\n\nnAfter Reversing : " ; 
	obj.print() ; 

	cout << "\n" ; 
}