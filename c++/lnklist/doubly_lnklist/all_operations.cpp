/*

	Date : 29/1/15
	Intro to doubly linked list !
*/

#include <iostream>
using namespace std; 

struct node
{
	int data ; 
	node *next ; 
	node *prev ; 
}*head ;

node* create_new_node(int num){
	// creating my new node 
	node *new_node = new node() ;
	// this way the node created will not be destroyed when the function ends, it will be stored in the heap m/y

	new_node->data = num ; 
	new_node->next = NULL ; 
	new_node->prev = NULL ; 
	return new_node ; 
}

void insert_at_head(int num){
	node *my_node = create_new_node(num) ; 
	if( head == NULL){					// when the list is empty 
		head = my_node ;
		return ; 
	}
	my_node->next = head ; 
	head->prev = my_node ; 
	head = my_node ; 
}

void insert_at_tail(int num){
	// traversing till the last element !
	node *temp = head ; 
	while(temp->next != NULL){
		temp = temp->next ; 
	}

	// creating the node to be inserted !

	node *my_node = create_new_node(num) ; 
	temp->next = my_node;
	my_node->prev = temp ; 
}

void print_forward(){
	cout<<"\nForward list : " ; 
	node *temp = head ; 
	while(temp != NULL){
		cout<<temp->data<<" " ; 
		temp = temp->next ; 
	}
	cout<<"\n" ; 
}

void print_reverse(){
	cout<<"\nReverse list : " ; 
	node *temp = head ; 
	while(temp->next != NULL){
		temp = temp->next ; 
	}
	while(temp != NULL){
		cout<<temp->data<<" " ; 
		temp = temp->prev ;
	}
	cout<<endl ; 
}

void insert_at_n(int num, int position){
	
	node *my_node = create_new_node(num) ; 

	// creating a temporary pointer to traverse through the doubly linked list 

	node *temp = head; 
 	for (int i = 1; i < position - 1; ++i){
		temp = temp->next ;  		
 	}
 	// temp currently points to the n-1 th node !
 	node *next = temp->next; 		//points to the n' th node

 	my_node->next = temp->next ; 	
 	next->prev = my_node ; 
 	my_node->prev = temp ; 
 	temp->next = my_node ; 

}

void delete_at_head(){
	cout<<"\nDeletion at head  : " ; 
	node *temp = head ; 
	node *next = temp->next ; 

	head = temp->next ; 
	next->prev = NULL ; 

	delete temp ; 
	print_forward() ; 
}

void delete_at_tail(){
	cout<<"\n\nBefore Deletion at tail  : " ; 
	print_forward() ; 

	node *temp = head ; 
	while(temp->next->next != NULL){
		temp = temp->next  ; 
	}
	cout<<"\nCurrently pointing to : "<<temp->data ; 
	cout<<"\nDeleting the last value : " ; 

	node *del = temp->next ; 
	temp->next = NULL ;
	delete del ;
	cout<<"\n\n After deletion of last node : " ; 
	print_forward() ; 
}

void delete_at_n(){
	cout<<"\n\nDeletion at the position given by the user : " ; 
	int position ; 
	cout<<"\nEnter the position to be deleted :  " ; 
	cin>>position ; 

	node *previous = head ; 
	for (int i = 1; i < position - 1 ; ++i){
		previous = previous->next  ; 
	}
	// points to the n-1 th node !
	
	// stores the address 
	node *current = previous->next ; 		
	//stores the address of the node after the n'th node 
	node *next = current->next ; 

	previous->next = next ; 
	next->prev = previous ; 
	delete current ; 
	cout<<"\nAfter deletion at "<<position<<" : " ; 
	print_forward() ; 
}
int main(){
	cout<<endl ; 

	head = NULL ; 
	insert_at_head(2) ; 
	insert_at_head(3) ; 
	insert_at_head(4) ; 

	insert_at_tail(10) ; 
	insert_at_tail(20) ; 

	print_forward() ; 
	// print_reverse() ; 
	cout<<"\nPosition where you want to insert : " ; 
	int temp ; 
	cin>>temp ;
	int var ; 
	cout<<"\nValue you want to insert : "  ; 
	cin>>var ; 
	insert_at_n(var,temp) ; 

	cout<<"\nAfter insertion at n : " ; 
	print_forward() ; 
	delete_at_head() ; 
	delete_at_tail() ; 

	delete_at_n()	 ; 
 	cout<<endl ;
}
