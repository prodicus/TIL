/*
	Date : 26/1/15
	To print the elements of the linked list in forward direction using recursion!

*/
#include <iostream>
using namespace std ; 

struct node {
	int data  ; 
	node *next ; 
};
node *head ;

void insert(int num){
	node *temp = new node() ; 
	temp->data = num ; 
	temp->next = head ; 
	head = temp ; 
}

void print_forward_recursion(node *p){
	if(p == NULL){
		return ; 			//exit condition for the recursion !!
	}
	cout<<p->data<<" " ;
	print_forward_recursion(p->next) ; 
}
	
void print_backward_recursion(node *p){
	if(p == NULL){
		return ; 
	}
	print_backward_recursion(p->next) ; 
	cout<<p->data<<" " ; 
}

int main(){
	cout<<"\n" ; 

	head = NULL ; 
	insert(1) ; 
	insert(2) ; 
	insert(3) ; 
	insert(4) ; 
	insert(5) ; 
	insert(6) ; 
	cout<<"List  : " ; 

	print_forward_recursion(head) ; 

	cout<<"\nPrinting the list backwards : " ; 

	print_backward_recursion(head) ; 

	cout<<"\n" ; 
}