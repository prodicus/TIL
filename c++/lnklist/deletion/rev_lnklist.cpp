/*
	Date : 24/1/15
	Reverse a linked list- Iterative method !!
*/
#include<iostream>
using namespace std ; 

struct node{
	int data ; 
	node *next ;
};
node *head ;   

void insert_head(int num){
	node *temp = new node() ; 
	temp->data = num ; 
	temp->next = head ; 
	head = temp ; 
	// to know th number of elements in the linked list 
	count++ ; 
}

void print(){
	node *temp = head ; 
	cout<<"\nList  : " ; 
	while(temp != NULL){
		cout<<temp->data<<" " ; 
		temp = temp->next ; 
	}
	cout<<endl  ;
}

void reverse_lnklist_iteratively(){

	cout<<"\nBefore reversing the linked list : " ;
	print() ; 
	
	node *current, *prev, *next  ; 
		// here current refers to the current node at any given time.
	current = head ; 
	prev = NULL ;
	
	while(current != NULL){
		next = current->next ; 
		current->next = prev ; 

		// -------------------------------------
		//		 for traversing the linked list 
		prev = current ; 
		current = next ; 
		// -------------------------------------
 	}
 	head = prev ; 
	
	cout<<"\nAfter reversing the linked list : " ; 
	print() ; 
	
}

int main(){
	cout<<"\n" ; 

	head = NULL; 
	
	insert_head(1) ;  
	insert_head(2) ;  
	insert_head(3) ;  
	insert_head(4) ;  
	insert_head(5) ;  cout<<endl; 	print() ;

	reverse_lnklist_iteratively() ; 


	cout<<"\n" ; 
}