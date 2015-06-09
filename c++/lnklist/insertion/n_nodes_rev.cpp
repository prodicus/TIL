/*
	Inserting elements at the back of the linked list !!
*/
#include<iostream>
using namespace std; 

struct node{
	int data ; 
	node *next ; 
};
node *head ; 		//pointer to the node created

void insert(int num){
	node *temp = new node() ; 
	temp->data = num ; 
	temp->next = NULL ; 
	while(temp != NULL){
		
	}
}

void print(){
	node *temp = head ; 
	cout<<"\nThe list is  : " ; 
	while( temp != NULL ){
		cout<<temp->data ; 
		temp = temp->next ; 
	}
	cout<<endl ; 
}

int main(){
	cout<<"\n" ; 

	head = NULL ; 
	cout<<"\nEnter the no. of data you want to enter : "; 
	int n, num ; 
	cin>>n ; 
	for(int i = 0 ; i<n ; i++){
		cout<<"\nEnter the no : " ; 
		cin>>num ; 
		insert(num) ; 		//used to insert the element just entered at the beginning of the linked list 
		print() ; 
	}


	cout<<"\n" ; 
}