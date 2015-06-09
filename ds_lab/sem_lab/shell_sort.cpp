#include <iostream>
using namespace std ; 

class Shell_sort{
public : 
	void sort(int arr[] , int size){
		for(int gap = size/2 ; gap > 0 ; gap/=2)
			for (int i = gap ; i < size ; i++){
				int temp = arr[i] ; 
				int j = i ;
				for( ; j >= gap && temp < arr[j-gap] ; j-=gap)
					arr[j] = arr[j-gap] ; 
				arr[j] = temp ; 
			}
	}
	void disp(int arr[] , int size){
		for (int i = 0; i < size; ++i){
			cout << arr[i] << " " ; 
		}
		cout << "\n" ; 
	}
};

int main(){
    cout << "\n" ;

    Shell_sort obj ; 
    int arr[] = {12 , 23 ,1, -2 ,6 } ;
    int size = sizeof(arr)/sizeof(arr[0]) ; 
    cout << "\nBefore sort : " ;
    obj.disp(arr, size) ; 
    
    obj.sort(arr, size) ; 

    cout << "\nAfter sort : " ; 
    obj.disp(arr, size) ; 

    cout << "\n" ;
}