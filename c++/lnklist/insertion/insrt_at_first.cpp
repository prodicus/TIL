#include<iostream>
using namespace std; 

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
	cout<<"\nThe list is : " ; 
	node *temp = head ; 
	while(temp != NULL){
		cout<<temp->data<<" " ; 
		temp = temp->next ; 
	}
	cout<<"\n" ; 
}

int main(){
	head = NULL ; 
	cout<<"\nInserting the elements at the first : "
		<<"\nEnter the number of elements you want to insert : " ; 
	int num, n ; 
	cin>>n ; 
	while(n--){
		cout<<"\nEnter the number :" ; 
		cin>>num ; 
		insert(num) ; 
		print() ;
	}
}