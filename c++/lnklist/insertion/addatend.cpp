/*
	to insert elements at the end of the linked list 
*/
#include<iostream>
using namespace std ; 

struct node{
	int data ; 
	node *next ; 
};
node *head ; 

void push(int num){
	/*inserting the element at the start of the list */
	node* temp = new node() ;
	temp->data = num ;
	temp->next = head ; 
	head = temp ;
}

void append(int num){
	/*inserting the element at the end of the list */
	node *temp = new node() ; 
	temp->data = num ; 
	temp->next = NULL ; 

	node *last = head ; 			//will store the address of the last element of the linked list

	/*what if the linked list is empty*/
	if(head == NULL){
		head = temp ; 
		return ;
	}
	/*iterating through the linked list*/
	while(last->next != NULL){
		last = last->next ; 
	}
	last->next = temp ;

}

void print(){
	cout<<"\nlist : " ; 
	node *temp = head ; 
	while(temp != NULL){
		cout<<temp->data<<" "  ;
		temp = temp->next  ;
	}
	cout<<endl ; 
}

int main(){
	cout<<endl ; 

	head = NULL ; 
	cout<<"\ninsering 2 at beginning : " ;		push(2) ; 		//list : 2
	cout<<"\ninseting 3 at the beginning : " ; 	push(3) ; 		//list : 3 2 
	cout<<"\ninseting 5 at the end  :" ; 		append(5); 		//list : 3 2 5
	print() ; 

	cout<<endl ; 
}