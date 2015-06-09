/*
	To create a list containing n elemnets entered by the user 
*/

#include<iostream>
using namespace std ; 

struct node{
	int data ; 
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
	cout<<"\nThe list : " ; 
	node *temp = head ; 		//variable through which I will traverse the lnked list 
	while(temp != NULL){
		cout<<temp->data ; 
		temp = temp->next ; 
	}
	cout<<endl ;
}

int main(){
	cout<<endl ; 

	head = NULL ; 
	cout<<"Enter the number of elements you want to insert in the linked list : " ; 
	int n , num;  
	cin>>n ; 
	while(n--){
		cout<<"\nEnter the number  : " ; 
		cin>>num ; 
		insert(num) ; 
		print(); 
	}

	cout<<endl ; 
}