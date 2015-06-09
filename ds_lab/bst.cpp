#include<iostream>
using namespace std;

struct node {
  int data;
  node *left;
  node *right;
} *head ;     //pointer to root

class tree {
public:
    int count;     //stores number of elements in tree
  
    tree();
    void addnode(int);
    // void deletenode(int);
    bool search(int);

    // void postorder();
    // void printtree();
};

tree::tree() {
   head = NULL;
   count = 0;
}

void tree::addnode(int num) {
   node *temp= new node;
   temp->data=num;
   temp->left=NULL;
   temp->right=NULL;

   node **ptr = &head;          //double pointer

   while(*ptr!=NULL) {
      if(num > (*ptr)->data)
         ptr = &((*ptr)->right);

      if(num < (*ptr)->data)
         ptr = &((*ptr)->left);
   }
   *ptr = temp;
}

bool tree::search(int num) {
    node *temp = head;

    while (temp != NULL) {
        if (temp->data == num)
            break;

        if (num > temp->data)
            temp = temp->right;
        else if (num < temp->data)
            temp = temp->left;
    }

    if (temp == NULL)
        return false;

    if (temp->data == num)
        return true;

    return false;
}

int main() {
   tree ob;
   cout << "\nInserting 2 in the BST : " ; 
   ob.addnode(2);

   bool status  ; 
   cout << "\nSearching for elements : " ;  
   status = ob.search(2);
   cout << "0 : Element not found \t 1 : Element found : " ;
   cout << "\nwas 2 found : " << status  ;

   status = ob.search(3);
   cout << "\nwas 3 found : " << status << "\n\n" ;
   
   cout << "\n\n" ;
}              