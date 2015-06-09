/*
	A data structure is a way to store and organize data in a computer so that it can be used efficiently

	We talk about data strucutres as 
	->mathematical models 
	->implementation

	We study data structures as both 
	->Abstract data structures
*/
#include<iostream>
using namespace std; 
int main(){
	cout<<"\n" ; 
	
	struct node{
		int data ; 
		node *link ; 
	};
	/*
		the node template is created .
		Now to create a head link which will point to the first element of the linked list.
	*/
	node *a ; 		//this element will store the address of the first element of the linked list 

	/*since there are no elements in the linked list right now, we should assign it to NULL */

	a = NULL ; 

	/*now to create the first element of the linked list using the free store operators*/

	node *temp = new node() ; 			//allocates m/y from the heap and returns back the address to be stored in a pointer
										// variable so that the m/y can be utilised 
	temp->data = 1 ; 
	temp->link = NULL ; 

	/* filled up the data values. Now all that is left is to point the head link to this node */

	a = temp ; 

	/*lets insert another node at the end of the linked list*/ 

	temp = new node() ; 				
	temp->data = 2 ;
	temp->link = NULL ; 

	/*so now I have created a node which holds the data value of 2 and points to NULL*/

	node *traverse = a ; 		//creating a temporary varaible which will be used to store the addresses of the traversed nodes
	while( traverse->link != NULL ){
		traverse = traverse->link ; 		
		cout<<traverse->data<<endl ; 
	}
	traverse->link = traverse ; 

	cout<<"\n" ; 
}