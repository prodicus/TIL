#include <iostream>
using namespace std; 
/*
struct node {
	int data ; 
	node *next ; 
}*head;
*/
class Stack{
public : 
	int a[10] ;
	
	void print() ; 

	// insertion 
	void push(int ) ; 

	// deletion 
	void pop() ; 
};

void Stack::push(int num){

}

void Stack::print(){
	
	cout << "\n" ; 
}

void Stack::pop(){
	cout << "\n--------->><<---------" ;  
	cout << "\nBefore deletion : " ; 
	print() ; 
/*

	// ---queue deletion
	node *temp = head ; 
	while(temp->next->next != NULL){
		temp = temp->next  ; 
	}
	cout << "\nData to be deleted : " << temp->next->data ; 
	temp->next = NULL ; 

	

	// Now how to delete using end pointer ??
	// delete end ;
*/
	node *temp = head ; 
	head = temp->next ;
	delete temp ;
	cout << "\n\nAfter deletion " ; 
	print() ; 
	cout << "--------->><<--------- " ;
} 

int main(){
	cout << "\n" ; 

	Stack obj ;
	obj.push(1) ; 
	obj.push(2) ; 
	obj.push(3) ; 
/*	obj.push(4) ; 
	obj.push(5) ; 
*/
	cout << "\n pop operation : " ; 
	obj.pop() ; 
	obj.pop() ; 
	cout << "\n" ; 
}