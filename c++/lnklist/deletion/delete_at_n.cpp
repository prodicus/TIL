/*
	Date : 24/1/15
	Deletion in a node at position entered by the user
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

void deletion(int position){
	node *temp1 = head ;

	cout<<"\nBefore deletion : " ; 
	print() ; 

	// two cases arise here, 
	// case 1 :  head node is to be deleted 
	// case 2 :  a node other than the head node needs to be deleted !

	// case 1 : head node is to be deleted !

	if(position == 1){
		head = temp1->next ; 
		delete temp1 ; 
	}

	// case 2 :  when the node to be deleted is something other than the head node !

	else{
		for (int i = 0; i < position-2 ; ++i){
			temp1 = temp1->next ; 		
		}
		// temp1 now points to the (n-1)'th node  

		node *temp2 = temp1->next ;		// temp2 now points to the n'th node 
		temp1->next = temp2->next ; 
		// the link has been broken and now the nth node needs to be deleted 

		delete temp2 ; 					//this will free the memeory space being pointed by temp2
	}

	cout<<"\nAfter deletion : " ; 
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
		cout<<"\n\n Deletion of node at position : " 
			<<"\nEnter the position you want to delete : " ; 
		int position ; 
		cin>>position ; 
		
		deletion(position) ; 
		cout<<"\nDelete more ? : "; 
		cin>>ch ; 
	}while(ch == 'y') ; 
		
	cout<<"\n" ; 
}