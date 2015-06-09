/*
	Author : Tasdik Rahman
	Topic  : Binary search in an array !!
*/

#include <iostream>
using namespace std ; 

class binary_search_algo{
	public : 
		int arr[10], size, element, left, right ; 
		
		int binary_search(int arr[], int value, int left, int right) {
		      while (left <= right) {

		            int middle = (left + right) / 2;

		            if (arr[middle] == value)
	                	return middle;		//  when the element is found it returns the index position
		        
		            else if (arr[middle] > value)
	                	right = middle - 1;
		        
		            else
	                	left = middle + 1;
		      }
		 	  return -1;  		// when the element is not found, it returns -1
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
			cout << "\nEnter the elements : "  ;
            for(int i = 0 ; i < size ; i++){
                cin>>arr[i] ;
            }
            print(size) ; 
            cout << "\nElement to be found : " ; 
            cin >> element ; 

            left = 0 ; 
            right = size - 1 ; 
            int flag = 0 ; 
            flag = binary_search(arr, element, left, right ) ; 
            if(flag == -1){
            	cout << "\nElement was not found !! " ; 
            }
            else
            	cout << "\nElement was found at index : " << flag ; 
 		}
} ; 

int main() {
	cout << "\n" ; 
	binary_search_algo obj ; 
	obj.arr_initialize() ;
	cout << "\n" ; 
}