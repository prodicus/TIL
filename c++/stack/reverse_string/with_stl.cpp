#include <iostream>
#include <stack>				// using STL for the first time here 
using namespace std;  

void reverse(char *ch, int size){
	// passing a character array using 
	stack<char> S ; 			// object of stack class created 

	for (int i = 0; i < size; ++i){
		S.push(ch[i]) ; 
	}
	// elements pushed into the stack 
	// now to reverse the contents of the string 

	for (int i = 0; i < size; ++i){
		ch[i] = S.top() ; 
		S.pop() ; 
	}

	cout << "\nReversed string is : " ; 
	for(int i = 0 ; i < size ; i++){
		cout << ch[i] ; 
	}
}

int main(){
	
	cout << "\n" ; 

	char ch[] = {'a', 'b', 'c', '\0'}; 
	cout << "\nYou have entered : " << ch ; 
	reverse(ch, 4) ; 
	
	cout << "\n" ; 
}
