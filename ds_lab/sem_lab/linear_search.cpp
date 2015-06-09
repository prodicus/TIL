#include <iostream>
using namespace std ; 

class LinearSearch{
public :
	bool search(int *, int, int);
};

bool LinearSearch::search(int *arr,int num, int size){
	cout << "\nNumber to be searched : " << num ; 
	for(int i = 0 ; i < size ; i ++){
		if(arr[i] == num)
			return true ; 
	}
	return false ;
}

int main(){
    cout << "\n" ;

    LinearSearch obj ; 
    int arr[5] ; 
    cout << "\nEnter elements : " ;
    for(int i = 0 ; i < 5 ; i ++){
    	cin >> arr[i];
    }

    int size = sizeof(arr)/sizeof(arr[0]) ; 
    cout << "\nEnter element to be searched : ";
    int search_element;
    cin >> search_element ; 

    bool result = obj.search(arr,search_element, size);
    if (result)
    	cout << "\nElement was found" ; 
    else
    	cout << "\nElement not found" ; 
    cout << "\n" ;
}