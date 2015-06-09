#include <iostream>
using namespace std ; 

void insertion_sort(int arr[], int size){
	for(int i = 0 ; i < size ; i++)
		cout << arr[i] << " " ; 

	int j ; 
	for(int i = 0 ; i < size ; i++){
		int temp = arr[i] ; 
		for(j = i ; j > 0 && temp < arr[j-1] ; j--){
			arr[j] = arr[j-1] ; 
		}
		arr[j] = temp ; 
	}

	cout << "\n" ; 
	for(int i = 0 ; i < size ; i++)
		cout << arr[i] << " " ; 
}

int main(){
    cout << "\n" ;

    int arr[] = { 30 , 20 , 15 , -10 , 5} ; 
    int size = sizeof(arr)/sizeof(arr[0]) ; 
    insertion_sort(arr, size) ; 

    cout << "\n" ;
}