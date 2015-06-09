/*
	Date : 25/1/15
	Deletion of the middle node !!
*/
#include<iostream>
using namespace std ; 

int count = 0 ;

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

void deletion_mid_node(){
	// we need to delete only the mid node and nothing else !!
	cout<<"\nNumber of nodes present  : "<<count ; 

	cout<<"\n\nBefore Deletion : " ; 
	print() ;

	int mid = count/2 ; 

	node *temp1 = head ; 
	for (int i = 0; i < mid-2; ++i){
		temp1 = temp1->next ; 
	}
	// temp1 points to the node just before the middle node 
	node *temp2 = temp1->next ; 
	temp1->next = temp2->next ; 

	delete temp2 ; 


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
		cout<<"\n\n Deletion of mid node " ;
		deletion_mid_node() ; 
		cout<<"\nDelete more ? : "; 
		cin>>ch ; 
	}while(ch == 'y') ; 
		
	cout<<"\n" ; 
}
