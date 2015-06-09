/*
	Date : 25/1/15
	Deletion of head node !!
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

void deletion_head_node(){
	// we need to delete only the head node and nothing else !!

	cout<<"\nBefore Deletion : " ; 
	print() ;
	
	node *temp = head ; 
	head = temp->next ; 
	delete temp ;

	cout<<"\nAfter deletion : "; 
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
		cout<<"\n\n Deletion of head node " ;
		deletion_head_node() ; 
		cout<<"\nDelete more ? : "; 
		cin>>ch ; 
	}while(ch == 'y') ; 
		
	cout<<"\n" ; 
}