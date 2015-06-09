#include <iostream>
using namespace std ; 

class Binarysearch{
public :
	int search(int arr[], int key , int min, int max);
};

int Binarysearch::search(int arr[], int key , int min, int max){
    if(max < min)
        return -1 ; 
    else{
        int mid = (min + max)/2 ; 
        if(key < mid) search(arr, key, min, mid-1) ;
        if(key > mid) search(arr, key, mid+1, max) ; 
        else return mid ;
    }
}

int main(){
    cout << "\n" ;

    Binarysearch obj ; 
    int arr[5] ; 
    cout << "\nEnter elements : " ;
    for(int i = 0 ; i < 5 ; i ++){
    	cin >> arr[i];
    }

    int size = sizeof(arr)/sizeof(arr[0]) ; 

    cout << "\nEnter element to be searched : ";
    int search_element;
    cin >> search_element ; 

    int min = arr[0] ; 
    int max = arr[size-1];

    int result = obj.search(arr, search_element, min,max);
    if (result == -1)
    	cout << "\nElement not found" ; 
    else
        cout << "\nElement was found "; 

    cout << "\n" ;
}