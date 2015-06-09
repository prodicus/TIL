/*


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

void print(){
	node *temp = head ; 
	while(temp != NULL){
		cout<<temp->data<<" "		 ; 
		temp = temp->next ; 
	}
	cout<<endl  ;
 }

void reverse(){
	cout<<"\nBefore reversing the linked list : " ; 
	print() ; 

	node *current, *next, *prev ; 
	current = head ; 
	prev = NULL ; 

	while(current != NULL)	{
		next = current->next ; 
		current->next = prev ; 

		prev = current ;
		current = next ; 
	}
	head  = prev ; 

	cout<<"\nAfter reversing the linked list : " ; 
	print() ; 
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
	print() ; 

	reverse() ; 
	cout<<"\n" ; 
}