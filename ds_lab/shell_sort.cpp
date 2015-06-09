#include <iostream>
using namespace std ; 

class shell_sort{
  public : 
    int a[10] , size  ;                               // array declared 

    void sort(int a[], int size){
      for (int gap = size / 2  ; gap > 0 ; gap /= 2){
        for (int i = gap ; i < size ; ++i){
            int tmp = a[i] ; 
            int j = i ;
            for (  ; j >= gap && tmp < a[j - gap] ; j -= gap)
                a[j] = a[j - gap] ; 
            a[j] = tmp ; 
        }
      }
    }

    void print(int arr[], int size){
        for(int i = 0 ; i < size ; i++)
            cout << arr[i] << " ";   
        cout << "\n" ; 
    }

    void insertion(){
      cout << "\nInsert the elements in the array: "  
           << "\nsize of the array ? :  "   ; 

      cin >> size ; 

      cout << "\nEnter the elements : " ; 
      for (int i = 0; i < size; ++i){
        cin >> a[i] ; 
      }

      sort(a, size) ; 

      cout << "\nAfter sorting : " ; 

      print(a, size) ; 
    }
} ; 

int main(){
  cout << "\n" ; 

  shell_sort obj ;                       // object of the class created  
  obj.insertion() ; 

  cout << "\n" ; 
}