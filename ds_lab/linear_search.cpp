/*
	Author : Tasdik Rahman
	Topic  : Linear search in an array !!
*/

#include <iostream>
using namespace std ; 

class linear_search{
	public : 
		int arr[10], size, element ; 
		
 		void search(int arr[], int size, int element){
 			int flag = 0 ; 
 			for(int i = 0 ; i < size ; i++){
 				if(arr[i] == element){
 					flag = 1 ;
 					cout << "\nElement " << element << " was found at index : " << i ; 
 				}
 			}
 			if(flag == 0){
 				cout << "\nElement was not found !" ; 
 			}
 		}

 		void print(int size){
        	cout << "\n array  : ";
            for(int i = 0 ; i < size ; i++){
                cout << arr[i] << " ";
            }	
            cout << "\n" ; 
        }

		void arr_initialize(){
			cout << "\nInitializing the array  !" 
				 << "\nSize of the array :  " ;
			cin >> size ; 
			cout<<"\nEnter the elements : "  ;
            for(int i = 0 ; i < size ; i++){
                cin>>arr[i] ;
            }
            print(size) ; 
            cout << "\nElement to be found : " ; 
            cin >> element ; 
            search(arr, size, element ) ; 
 		}

} ; 

int main() {
	cout << "\n" ; 
	linear_search obj ; 
	obj.arr_initialize() ;
	cout << "\n" ; 
}