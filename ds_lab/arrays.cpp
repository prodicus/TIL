/*
    Date : 20/1/15
    Exp 1 : Array Operations

    To insert element at  
    1) 1st postition
    2) last position 
    3) user defined position 
    
    To delete element at 
    1) 1st postition
    2) last position 
    3) user defined position

*/
#include <iostream>
using namespace std ;
class Array{              
        int n, arr[10], pos, val ,size;
    public :
        //--------->> 1
        void arr_initialize(){
            cout<<"\nInitializing the array : " 
                <<"\nNumber of elements : " ; 
            cin>>size ;
            cout<<"\nEnter the elements : "  ;
            for(int i = 0 ; i < size ; i++){
                cin>>arr[i] ;
            }
            print(size) ; 
        }
        //--------->> 2
        void insert_at_first(){
            size++; 
            for (int j = size - 1 ; j > 0;  j--){
                arr[j] = arr[j - 1];
            }
            cout<<"\nElement you want to insert at 1st position : " ; 
            int temp ; 
            cin>>temp ; 
            arr[0] = temp ; 
            print(size) ; 
        }

        //--------->> 3
        void insert_at_last(){
            print(size) ; 
            cout<<"\n\nInserting at last position : " ; 
            size++ ; 
            cout<<"\nElement you want to insert at last position : " ; 
            int temp ; 
            cin>>temp ; 
            arr[size-1] = temp ; 
            print(size) ; 
        }
        //--------->> 4
        void insert_at_pos(){
            print(size) ; 
            cout<<"\n\nInserting element where the user wants : !!"  
            	<<"\nEnter the position : "  ;
            cin>>pos ; 
            cout<<"\nEnter the element you want to insert : " ;
            int temp ;
            cin>>temp ; 
            
            ++size ; 
            for (int j = size - 1 ; j > pos;  j--){
                arr[j] = arr[j - 1];
            }
            arr[pos] = temp ;
            print(size) ; 
        }
        //--------->> 5
        void delete_at_first(){
            print(size) ; 

            cout<<"\n\nDeleting 1st element : " ; 
            size-- ; 
            
            for(int i = 0 ; i<size ; i++){
                arr[i] = arr[i+1] ; 
            }
            print(size) ; 
        }
        //--------->> 6
        void delete_at_last(){
            print(size) ; 
            cout<<"\n\nDeleting last element : " ; 
            size-- ; 
            print(size) ; 
        }
        //--------->> 7
        void delete_at_pos(){
            cout<<"\nDeleting element at the required position " 
                <<"\nEnter the position : " ; 
            cin>>pos ; 
            for (int i = pos ; i < size; ++i){
                arr[i] = arr[i+1] ; 
            }
            size-- ; 
            print(size) ; 
        }
        // ---------->> 8 
        void print(int size){
        	cout<<"\n array  : ";
            for(int i = 0 ; i < size ; i++){
                cout<<arr[i]<<" ";
            }	
            cout<<"\n" ; 
        }
};
int main(){
    Array obj ;         // object of the class created !!
    char ch = 'y' ; 
    obj.arr_initialize() ; // initializes the array to the initial values
	cout<<"\n\n1) insert_at_first "
        <<"\n2) insert_at_last " 
        <<"\n3) delete_at_first "
        <<"\n4) delete_at_last " 
        <<"\n5) insert_at_pos " 
        <<"\n6) delete_at_pos"  ;
    do{
        cout<<"\n\n---->>>Operation you want to perform :  " ; 
        int choice ; 
        cin>>choice ;         
        switch(choice){    
            case 1 : obj.insert_at_first()  ; 
                     cout<<"\n" ; 
                     break ;
            case 2 : obj.insert_at_last() ;   
                     cout<<"\n" ; 
                     break ; 
            case 3 : obj.delete_at_first() ; 
                     cout<<"\n" ; 
                     break ; 
            case 4 : obj.delete_at_last() ;
                     cout<<"\n" ; 
                     break ;  
            case 5 : obj.insert_at_pos() ; 
                     cout<<"\n" ; 
                     break ; 
            case 6 : obj.delete_at_pos() ; 
                     cout<<"\n" ; 
                     break ;
            default: cout<<"\nError !!" ; 
                     break ; 
        }

        cout<<"---->>>More operations ? :   "   ;
        cin>>ch ; 
    }while(ch == 'y') ; 
}

/*
	-------------->> OUTPUT <<--------------
Initializing the array : 
Number of elements : 3

Enter the elements : 1 2 3

 array  : 1 2 3 


1) insert_at_first 
2) insert_at_last 
3) delete_at_first 
4) delete_at_last 
5) insert_at_pos 
6) delete_at_pos

------------------->>>>>>>>Operation you want to perform :  1

Element you want to insert at 1st position : 0

 array  : 0 1 2 3 

------------------->>>>>>>>Do you want to do more operations ? :   y


------------------->>>>>>>>Operation you want to perform :  2

 array  : 0 1 2 3 


Inserting at last position : 
Element you want to insert at last position : 4

Updated array  : 
 array  : 0 1 2 3 4 

------------------->>>>>>>>Do you want to do more operations ? :   y


------------------->>>>>>>>Operation you want to perform :  3


 array  : 0 1 2 3 4 


Deleting 1st element : 
 array  : 1 2 3 4 


------------------->>>>>>>>Do you want to do more operations ? :   y


------------------->>>>>>>>Operation you want to perform :  4

 array  : 1 2 3 4 


Deleting last element : 
 array  : 1 2 3 

------------------->>>>>>>>Do you want to do more operations ? :   y


------------------->>>>>>>>Operation you want to perform :  5

 array  : 1 2 3 


Inserting element where the user wants : !!
Enter the position : 3

Enter the element you want to insert : 10

 array  : 1 2 3 10 

------------------->>>>>>>>Do you want to do more operations ? :   y


------------------->>>>>>>>Operation you want to perform :  6

Deleting element at the required position 
Enter the position : 3

 array  : 1 2 10 

------------------->>>>>>>>Do you want to do more operations ? :   n
*/