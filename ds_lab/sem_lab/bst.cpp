#include <iostream>
using namespace std ; 

struct node{
	int data;
	node *left;
	node *right;
} *root;

class BST{
public : 
	node* insert(node *root, int data);
	node* createNode(int) ;
	bool search(node *root, int );
	void PreOrder(node* root) ; 
};

bool BST::search(node *root, int num){
	if(root == NULL) return false ; 
	else if(root->data == num) return true ; 
	else if(num > root->data) return search(root->right, num) ; 
	else if(num <= root->data) return search(root->left, num) ; 
}	

node* BST::createNode(int num){
	node *temp = new node(); 
	temp->data = num;
	temp->left = temp->right = NULL ; 
	return temp ; 
}

void BST::PreOrder(node *root){
	if(root == NULL){
		return  ; 
	}
	cout << root->data << " " ; 
	PreOrder(root->left) ; 
	PreOrder(root->right) ; 
}

node* BST::insert(node *root, int data){
	if(root == NULL) 
		root = createNode(data) ;
	
	else if(data <= root->data) 
		root->left = insert(root->left, data);
	
		else if(data > root->data)
		root->right = insert(root->right, data) ;
	
	return root; 
}

int main(){
    cout << "\n" ;

    root = NULL ;			// well initially 
    BST obj;
    root = obj.insert(root, 2) ; 
    root = obj.insert(root, 1) ; 
    root = obj.insert(root, 5) ; 
    root = obj.insert(root, 3) ; 
    root = obj.insert(root, 6) ; 

    cout << "\nInserted successfully : " ;

    obj.PreOrder(root) ; 

    bool result = obj.search(root, 6) ; 
    cout << "\nSearching for 6 : " <<result ; 

	result = obj.search(root, 9) ; 
    cout << "\nSearching for 9 : "<<result ; 

    cout << "\n" ;
}