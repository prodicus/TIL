/*
	Date : 24/1/15
	Deletion in a node by its value
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

void deletion(int value){
	cout<<"\n\nDeleting node with value : "<<value; 
	cout<<"\n\nBefore deletion : "; 
	print() ; 

	// Finding the position of the node where we have the value
	
	int position = 1 ; 

	node *temp1 = head ; 

	while(temp1->data != value){
		temp1 = temp1->next ; 
		position++ ; 
	}

	// A special case arises when we need to delete the head node !!
	if (position == 1){
		head = temp1->next ; 
		delete temp1 ; 
	}
	//for positions other than 1
	else{
		for (int i = 0; i < position-2; ++i)
			temp1 = temp1->next ; 				// temp1 points to the (n-1)th node !
		node *temp2 = temp1->next  ; 			// temp2 points to the n'th node
		temp1->next = temp2->next ; 			// I have just broken down the link

		delete temp2 ;
	}
	cout<<"\n\nAfter deletion : "; 
	print() ; 
}

int main(){
	cout<<"\n" ; 

	head = NULL; 
	/*
	cout<<"\nInsert the number of elements you want to Insert: " ; 
	int num, n;  
	cin>>n ; 
	while(n--){
		cout<<"\nNo. you want to insert : " ; 
		cin>>num ; 
		insert_head(num) ; 
		print() ; 
	}
	*/
	insert_head(1) ;  
	insert_head(2) ;  
	insert_head(3) ;  
	insert_head(4) ;  
	insert_head(5) ;  cout<<endl; 	print() ; 

	char ch = 'y' ; 

	do{
		cout<<"\n\n Deletion of node with value : " 
			<<"\nEnter the value you want to delete : " ; 
		int value ; 
		cin>>value ; 
		
		deletion(value) ; 
		cout<<"\nDelete more ? : "; 
		cin>>ch ; 
	}while(ch == 'y') ; 
		
	cout<<"\n" ; 
}