/*
 	
 	Insertion of an array when the array is not full

*/
#include<iostream>
using namespace std ; 
int main(){
	int a[10]  ; 
	cout<<"\nEnter no. of elements : " ; 
	int size ; 
	cin>>size ; 
	cout<<"\nEnter the elements of the array (must be ascending order) : \n" ; 
	for(int i = 0 ; i < size ; i++){
		cin>>a[i] ; 
	}

	cout<<"\n" ; 
	for (int i = 0; i < size; ++i){
		cout<<a[i]<<"\t" ; 
	}

	cout<<"\ninserting elements inside the array : " ; 
	int new_element ; 
	cin>>new_element ; 
	cout<<"\nEnter the position where you want to insert the element : " ; 
	int pos  ; 
	cin>>pos ;  
	for(int i = pos )
	cout<<"\n" ; 
}
