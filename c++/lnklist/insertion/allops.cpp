#include<iostream>
using namespace std ; 

struct node{
	int data ; 
	node *next ;
};
node *head ;   

void push(int num){
	/*to insert elements at the start of the list*/
	node *temp = new node() ; 
	temp->data = num ; 
	temp->next = head ; 
	head = temp ; 
}

void append(int num){
	/*adds the element in the end of the list */
	node *temp = new node() ; 
	temp->data = num ; 
	temp->next = NULL ; 
	if(head == NULL){
		/*if the linked list is empty*/
		head = temp ; 
		return ;
	}
	node *last = head ; 
	while(last->next != NULL){
		last = last->next ; 
	}
	last->next = temp ; 

}

void print(){
	/*printing the list */
	cout<<"\nList : " ; 
	node *temp = head ; 
	while(temp != NULL){
		cout<<temp->data<<" " ; 
		temp =  temp->next ; 
	}
}

int main(){
	cout<<"\n" ; 


	head = NULL; 
	
	cout<<"\ninsering 2 at beginning : " ;		push(2) ; 		//list : 2
	cout<<"\ninseting 3 at the beginning : " ; 	push(3) ; 		//list : 3 2 
	cout<<"\ninseting 5 at the end  :" ; 		append(5); 		//list : 3 2 5
	cout<<"\ninseting 7 at the end  :" ; 		append(7); 		//list : 3 2 5 7 
	push(1) ; 
	print() ; 

	cout<<"\n" ; 
}