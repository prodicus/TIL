// A typical recursive implementation of quick sort 
#include <iostream>
using namespace std ; 
// A utility function to swap two elements

class quick_sort{
  public : 
    void swap(int *, int *) ; 
    int partition(int arr[], int , int ) ; 
    void quickSort(int arr[], int , int) ; 
    void printArray(int arr[], int) ; 
} ; 

void quick_sort::swap(int* a, int* b){
    int t = *a;
    *a = *b;
    *b = t;
}

// This function takes last element as pivot, places the pivot element at its
// correct position in sorted array, and places all smaller (smaller than pivot)
// to left of pivot and all greater elements to right of pivot 
int quick_sort::partition (int arr[], int l, int r){
    int pivot = arr[r];    // pivot
    int i = (l - 1);       // Index of smaller element

    for (int j = l; j <= r - 1; j++) {
        // If current element is smaller than or equal to pivot 
        if (arr[j] <= pivot) {
            i++;    // increment index of smaller element
            swap(&arr[i], &arr[j]);  // Swap current element with index
        }
    }
    swap(&arr[i + 1], &arr[r]);  
    return (i + 1);
}

 //arr[] --> Array to be sorted, l  --> Starting index, r  --> Ending index 
void quick_sort::quickSort(int arr[], int l, int r) {
    if (l < r) {
        int p = partition(arr, l, r); // Partitioning index 
        quickSort(arr, l, p - 1);
        quickSort(arr, p + 1, r);
    }
}

// Function to print an array 
void quick_sort::printArray(int arr[], int size) {
    int i;
    for (i=0; i < size; i++)
        cout << arr[i] << " " ;
    cout << "\n";
}

int main() {
    int arr[] = {10, 7, 8, 9, 1, 5};

    int n = sizeof(arr)/sizeof(arr[0]);
    quick_sort obj ; 

    cout << "\nInserted array is  : " ; 
    obj.printArray(arr, n) ; 
    obj.quickSort(arr, 0, n-1);
    cout << "\nSorted array :  ";
    obj.printArray(arr, n);
}
