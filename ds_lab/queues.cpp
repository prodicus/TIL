/*
	Name: Tasdik Rahman
	date: 4/2/15

    Exp 4  : Implementation of "Queue" Data Structure!!
   	
   	Operations to be performed
   	1) Enqueue (Insert at last)
   	2) Dequeue (Remove at front)
*/

/*
	Queues:
 		It follows FIFO(first in first out)
*/

#include <iostream>
using namespace std;

struct node{
     int data;
     struct node *next;
};

class Queue{
    private:
        node *rear;			//stores the address of last node
        node *front;		//stores address of the first node

    public:
        Queue(){
        	// constructor for the class 
		    rear = NULL;
		    front = NULL;
        }

        void insert(){        	// Enqueue operation
		    int data;

		    cout << "Enter the data to insert: ";
		    cin >> data;
		    // initializing the data 
		    node *temp = new node;
		    temp->data = data;
		    temp->next = NULL;

		    if(front == NULL){ 
                // when the list is empty
		        front = temp;
		    }
		    else{
		    	// inserting data at the end
		        rear->next = temp;
		    }

		    rear = temp;
		    cout << "\nAfter insertion (List) : " ;
		    display() ; 
        }

        void deletion(){	   // Dequeue operation
		    node *temp = new node;

		    if(front == NULL){
		        cout << "\nQueue is Emtpty\n";
		    }
		    else{
		        temp = front;
		        front = front->next;
		        // deletion from front done

		        cout << "The data Dequeued is " << temp->data;
		        // freeing memory space
		        delete temp;
		    }

		    cout << "\nAfter deletion (List) " ;
		    display() ; 
        }

        void display(){        	
 			node *temp = new node;
		    temp = front;		// pointing to the first element
	        while(temp != NULL){
	            cout << temp->data << " ";
	            temp = temp->next;
	        }
        }
};

int main(){

    Queue object;    // creating an object of class Queue

    int choice;
    cout << "\n1.insert\n2. deletion\n";

    char ch  ; 
    do{
        cout << "\nEnter your choice: ";
        cin >> choice;

        switch(choice){
            case 1: object.insert();
                    break;
            case 2: object.deletion();
                    break;
            case 3: object.display();
                    break;
            default: cout << "\nERROR 404 !\n";
                    break;
        }

        cout << "\n-->>More operations ???? " ; 
        cin >> ch ;
    }while(ch == 'y') ; 
}

/*
  --------------------->>	OUTPUT <<----------------------
1. insert
2. deletion

Enter your choice: 1
Enter the data to insert: 0

After insertion (List) : 0 
---------->>>>>More operations ???? y

Enter your choice: 1
Enter the data to insert: 1

After insertion (List) : 0 1 
---------->>>>>More operations ???? y

Enter your choice: 1
Enter the data to insert: 2

After insertion (List) : 0 1 2 
---------->>>>>More operations ???? y

Enter your choice: 2
The data Dequeued is "0"
After deletion (List) : 1 2 
---------->>>>>More operations ???? n

  ---------------------------------------------------------
*/
