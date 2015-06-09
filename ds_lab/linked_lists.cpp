/*
	Date : 28/1/15
    Exp 2  : Singly Linked list Operations

    To insert element at  
    1) 1st postition
    2) last position 
    
    To delete element at 
    3) user defined position

*/

#include<iostream>
using namespace std; 

struct node{
	int data ; 
	node *next ;
};	
node *head ;

class LinkedList{
	int position ; 
public : 			
	//--------->> 1
	void insert_at_head(){
		cout<<"\nElement you want to insert at the start  : " ;
		int num ; 
		cin>>num ; 
		node *temp = new node() ; 
		temp->data = num ; 
		temp->next = head ; 
		head = temp ; 
		cout<<"\n\nAfter insertion at head : " ; 
		print() ; 
	}
    //--------->> 2
	void insert_at_last(){
		int num ; 
		cout<<"\nElement you want to insert at the last  : " ; 
		cin>>num ;

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
		cout<<"\n\nAfter insertion element at last : " ; 
		print() ; 
	}

     //--------->> 3
	void deletion_at_position(){
		node *temp1 = head ;

		int position ; 
		cout<<"\nEnter the postion where do you want to delete the element from : " ; 
		cin>>position ;

		// cout<<"\nBefore deletion : " ; 
		// print() ; 

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
			for (int i = 1; i < position-1 ; ++i){
				temp1 = temp1->next ; 		
			}
			// temp1 now points to the (n-1)'th node  

			node *temp2 = temp1->next ;		// temp2 now points to the n'th node 
			temp1->next = temp2->next ; 
			// the link has been broken and now the nth node needs to be deleted 

			delete temp2 ; 					//this will free the memeory space being pointed by temp2
		}

		cout<<"\nAfter deletion at postion "<<position<<" : " ; 
		print() ; 
	}

     //--------->> 4
	void print(){					// for printing the elements of the linked list !!!
		node *temp = head ; 
		cout<<"\nList  : " ; 
		while(temp != NULL){
			cout << temp->data <<" " ; 
			temp = temp->next ; 
		}
		cout<<endl  ;
	}
} ; 

int main(){	
	LinkedList object ; 			//creating an object of class LinkedList .

	char ch ; 

	head = NULL ; 
	
	cout<<"\n1) insert_at_first "
        <<"\n2) insert_at_last " 
        <<"\n3) delete_at_pos" ; 
    do{
        cout<<"\n\nOperation you want to perform : " ; 
        int choice ; 
        cin>>choice ;         
        switch(choice){    
            case 1 : object.insert_at_head()  ; 
                     cout<<"\n" ; 
                     break ;
            case 2 : object.insert_at_last() ;   
                     cout<<"\n" ; 
                     break ; 
            case 3 : object.deletion_at_position() ; 
                     cout<<"\n" ; 
                     break ;
            default: cout<<"\nError !!" ;   
                     break ; 
        }

        cout<<"-------->>>>Do you want to do more operations <<<<<<---------: "   ;
        cin>>ch ; 
    }while(ch == 'y') ; 
}

/*
--------------------->>	OUTPUT <<----------------------

1) insert_at_first 
2) insert_at_last 
3) delete_at_pos

Operation you want to perform : 1

Element you want to insert at the start  : 1


After insertion at head : 
List  : 1 

-------->>>>Do you want to do more operations <<<<<<---------: y


Operation you want to perform : 2

Element you want to insert at the last  : 3


After insertion element at last : 
List  : 1 3 

-------->>>>Do you want to do more operations <<<<<<---------: y


Operation you want to perform : 3

Enter the postion where do you want to delete the element from : 2

After deletion at postion 2 : 
List  : 1 

-------->>>>Do you want to do more operations <<<<<<---------: n


-------------------------------------------------------
*/