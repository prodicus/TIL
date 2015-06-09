#include<iostream>
using namespace std;  

struct node{
	int data ;
	node *next ; 
};
node *head ; 

void insert(int num){
	// to insert the element at the last of the linked list !!!
	
	node *temp = new node() ; 	
	temp->data = num ; 			//entering the data in the space 
	temp->next = NULL ; 
	
	if(head == NULL){			//currently has no elements in the linked list
		head = temp ; 
		return ; 
	}
	else{
		node *temp1 = head ; 	//the node which will be used to traverse the linked list  !!
		while(temp1->next != NULL){
			temp1 = temp1->next ;			//at the end of the loop, temp will will point to the end of the loop
		}
		temp1->next = temp ; 
	}

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
	head = NULL ; 
	cout<<"\nEnter the no. of elements : " ; 
	int num, n ;
	cin>>n ; 
	while(n--){
		cout<<"\nEnter the number  : " ; 
		cin>>num ; 
		insert(num) ; 
		print() ; 
	}

	cout<<"\n" ; 
}