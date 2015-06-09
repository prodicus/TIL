#include <iostream>
using namespace std ; 

void swap(int *a, int *b){
	int t = *a ; 
	*a = *b ; 
	*b = t ;
}

void quickSort(int arr[], int l , int h){
	if(l < h){
		int p = partition(arr, l , h);
		quickSort(arr, l , p-1) ; 
		quickSort(arr, p+1, h) ; 
	}
}

int partition(int a[], int l , int h){
	int x = a[h] ;
	int i = a[l-1] ;
	for(int j = l ; j <= h ; j++){
		if(a[j] <= x){
			swap(&a[i], &a[j]) ; 
		}
	}
	swap(&a[i+1] , &a[h]) ; 
	return (i+1) ; 
}

int main(){
    cout << "\n" ;

    QuickSort obj ; 
    

    cout << "\n" ;
}