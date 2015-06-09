#include <iostream>
using namespace std; 

struct node {
	int data ; 
	node *next ; 
}*head, *end;

class Queue{
	public : 
	Queue();
	node* node_create(int ) ;
	void print() ; 

	// insertion 
	void enque(int ) ; 

	// deletion 
	void dequeue() ; 
};

Queue::Queue(){
	head = NULL ;
}

node* Queue::node_create(int num){
	node *temp = new node() ; 
	temp->data = num ;
	temp->next = NULL ;
	return temp ; 
}

void Queue::enque(int num){
	node *temp = node_create(num) ; 
		
	if(head == NULL){
		head = temp ; 
		end = temp ; 
	}
	else{
		end->next = temp ;
		end = temp ; 
	}
	cout << "\nAfter insertion : "  ;
	print() ; 
}

void Queue::dequeue(){
	cout << "\n--------->><<---------" ;  
	cout << "\nBefore deletion : " ; 
	print() ; 

	node *temp = head ; 
	head = temp->next ; 
	delete temp ; 

	cout << "\n\nAfter deletion " ; 
	print() ; 
	cout << "--------->><<--------- " ;
} 

void Queue::print(){
	node *temp = head  ;

	cout << "\nStack : " ; 
	while (temp != NULL){
		cout << temp->data << " " ; 
		temp = temp->next  ; 
	}
	cout << "\n" ; 
}

int main(){
	Queue obj ; 
	obj.enque(1) ; 
	obj.enque(2) ; 
	obj.enque(3) ; 
	obj.enque(4) ; 

	cout << "\nDequeue operation : " ; 
	obj.dequeue() ; 
	obj.dequeue() ; 
	cout << "\n" ; 
}