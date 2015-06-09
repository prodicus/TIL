#include<iostream>
using namespace std;  

struct node{
	int data ;
	node *next ; 
};
node *head ; 

void insert(int num, int pos){	
	//to insert the element where the user wants it in the linked list !!
	node *temp = new node() ;
 	temp->data = num ; 
	temp->next = NULL ; 

	if(pos == 1){					// will work even when the linked list is empty !!	
		temp->next = head ; 
		head = temp ; 
		return ; 
	}


	// now for all the other cases, we will need to go to the "n-1"th node

	node *temp1 = head  ;
	for (int i = 0 ; i < pos-2 ; i++){	
		temp1 = temp1->next  ; 				
	}
	// now temp1 will be pointing to the n-1th node 
	temp->next = temp1->next ; 
	temp1->next = temp ; 
	//-------->>Element is inserted<<-------------

}

void print(){
	cout<<"\nThe list is : " ; 
	node *temp = head ; 
	while(temp != NULL){
		cout<<temp->data<< " " ; 
		temp = temp->next ;
	}
	cout<<"\n" ; 
}

int main(){
	cout<<"\n" ; 
	head =  NULL ; 				// to say that the linked list is initially empty !!!
	insert(2,1) ; 
	print() ; 		// List : 2			
	insert(3,2) ; 
	print() ; 		// List : 2 3
	insert(4,1) ; 
	print() ; 		// List : 4 2 3 
	insert(5,2) ; 	
	print() ; 		// List : 4 5 2 3 

	cout<<"\n" ; 
}