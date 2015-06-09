/*
	Wednesday 11 February 2015 01:54:04 PM IST
    Exp 5  : Implementation of "Doubly Linked Lists"
    
    Operations to be performed
    1) insertion in sorted manner

*/

#include <iostream>
using namespace std ; 

struct node {
	int data ; 
	node *next ; 			// stores the address of the next node 
	node *previous  ; 		// stores the address of the previous node 
};
node *head ; 				// node which stores the address of the first node in the list 

class doubly_lnk_list{
	public : 
		//  declaring the prototypes
		void display(){
			// method to display the elements of the linked list 
			node *temp = head ; 
			while(temp != NULL){
				cout << temp->data << " " ; 
				temp = temp->next ; 
			}
			cout << endl ; 
		} 
		void insertion( int num ){
			// insertion in ascending order 
			node *new_node = new node();
			new_node->data = num ; 
			new_node->next = NULL ; 
			new_node->previous = NULL ; 

			cout << "\nNumber to be inserted  : " << num 
				 << "\n---->>>before insertion : " ; 
			display()  ;  

			node* current;

			if( head == NULL || (head->data) >= new_node->data ) {
				// when the doubly lnked list does not have any elements inside it 
				// or when the number inserted is smaller than the element at the head 
				new_node->next = head ;
				head = new_node ; 
			}	
			else{
				 // Locate the node before the point of insertion 
		 		current = head ;
		        while ((current->next != NULL) && (current->next->data) < (new_node->data)){
		            current = current->next;
		        }
		        new_node->next = current->next;
		        current->next = new_node;
			}

			cout << "\n---->>>Updated List : " ; 
			display() ; 
	   } 
};

int main(){

	cout << endl ; 

	head = NULL ; 
	doubly_lnk_list obj ;			// creating an object of class 

	cout << "\nBefore insertion  : " ; 
	obj.insertion(0) ; 
	obj.insertion(7) ; 
	obj.insertion(3) ; 
	obj.insertion(1) ; 

	cout << endl ; 
}


/*
Implementation:
 //Program to insert in a sorted list 
#include<stdio.h>
#include<stdlib.h>
 
// Link list node 
struct node
{
    int data;
    struct node* next;
};
 
// function to insert a new_node in a list. Note that this
//  function expects a pointer to head_ref as this can modify the
  //head of the input linked list (similar to push())
void sortedInsert(struct node** head_ref, struct node* new_node)
{
    struct node* current;
    // Special case for the head end 
    if (*head_ref == NULL || (*head_ref)->data >= new_node->data)
    {
        new_node->next = *head_ref;
        *head_ref = new_node;
    }
    else
    {
        // Locate the node before the point of insertion 
        current = *head_ref;
        while (current->next!=NULL &&
               current->next->data < new_node->data)
        {
            current = current->next;
        }
        new_node->next = current->next;
        current->next = new_node;
    }
}
 
//BELOW FUNCTIONS ARE JUST UTILITY TO TEST sortedInsert 
 
// utility function to create a new node 
struct node *newNode(int new_data)
{
    // allocate node 
    struct node* new_node = (struct node*) malloc(sizeof(struct node));
 
    // put in the data  
    new_node->data  = new_data;
    new_node->next =  NULL;
 
    return new_node;
}
 
// Function to print linked list 
void printList(struct node *head)
{
    struct node *temp = head;
    while(temp != NULL)
    {
        printf("%d  ", temp->data);
        temp = temp->next;
    }
}
 
// Drier program to test count function
int main()
{
    Start with the empty list 
    struct node* head = NULL;
    struct node *new_node = newNode(5);
    sortedInsert(&head, new_node);
    new_node = newNode(10);
    sortedInsert(&head, new_node);
    new_node = newNode(7);
    sortedInsert(&head, new_node);
    new_node = newNode(3);
    sortedInsert(&head, new_node);
    new_node = newNode(1);
    sortedInsert(&head, new_node);
    new_node = newNode(9);
    sortedInsert(&head, new_node);
    printf("\n Created Linked List\n");
    printList(head);
 
    getchar();
    return 0;
}

*/

/*

Shorter Implementation using double pointers
Thanks to Murat M Ozturk for providing this solution. Please see Murat M Ozturk’s comment below for complete function. The code uses double pointer to keep track of the next pointer of the previous node (after which new node is being inserted).

Note that below line in code changes current to have address of next pointer in a node.
current = &((*current)->next);

Also, note below comments.
// code 
 
new_node->next = *current; // Copies the value-at-address current to new_node's next pointer
*current = new_node;  // Fix next pointer of the node (using it's address) after which new_node is being inserted 

// code
*/