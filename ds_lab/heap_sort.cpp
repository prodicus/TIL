#include <iostream>
using namespace std;

class HS{
public:
    void max_heap(int heap[],int size); 
    void heap_sort(int heap[],int size);
    void display(int heap[],int size);
    void swap(int *a, int *b) ; 
};

void HS::swap(int *a , int *b){
    int t = *a ; 
    *a = *b ; 
    *b = t ;
}

void HS::display(int heap[],int size){
    cout<<"\nThe Array is:- \t";
    for(int z = 0; z < size ; z++){
        cout << heap[z] << " ";
    }
}

void HS::max_heap(int heap[],int size){
    int root = 0, c ;
    for(int i = 1; i < size ; i++){
        c = i;
        do{
            root = (c-1)/2;
            if(heap[root] < heap[c])
                swap(&heap[root], &heap[c]) ;
            c = root;
        }while(c != 0);
    }
}

void HS::heap_sort(int heap[],int size){
    int root  = 0 , c;
    for( int i = size-1 ; i >= 0; i--){
        swap(&heap[0], &heap[i]) ; 
        do{
            c = (2*root)+1;
            if(heap[c] < heap[c+1] && c < i-1)
                c++;
            if(heap[root] < heap[c] && c < i)
                swap(&heap[root], &heap[c]);
            root = c;
        }while(c < i);
    }
}

int main(){
    HS obj;

    int heap[] = { 40 , -10 , 20 , 23} ; 
    int size = sizeof(heap)/sizeof(heap[0]) ; 

    obj.max_heap(heap,size);
    obj.display(heap,size);
    
    obj.heap_sort(heap,size);
    obj.display(heap,size);

    cout << "\n" ; 
}