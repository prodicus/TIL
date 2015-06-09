#include <cctype>
#include <iostream>
using namespace std ; 

struct node{
	char data ; 
	mode* next ;
}*top;

class Stack{
	char Top(){
		return top->data ; 
	}

	int isEmpty(){
		if(top == NULL)
			return 1;
		else return 0 ; 
	}

	void push(char x){
		node *p = new node();
		p->data = x; 
		p->next = top; 
		top = p;
	}

	char pop(){
		node *p = top 
		char x = p->data ;
		top = top->next  ; 
		delete p ; 
		return x ;
	}

	void infix_to_postfix(char *infix , char *postfix){
		int i, j = 0 ; 
		char x, token ; 
		Stack s ; 
		for(int i = 0 ; infix[i] != '\0' ; i++){
			token = infix[i] ; 
			if(isalnum(token)) postfix[j++] = token
			if(token == '(') s.push(token) ; 
			if(token == ')'){
				while((x = s.pop()) != '(') {
					postfix[j++] = x ;
				}	
			}
			else{
				while(!s.isEmpty() && s.precedence(token) <= s.precedence(s.Top())){
					postfix[j++] = s.pop() ; 
				}
				s.push(token) ; 
			}
		}

		while(!s.isEmpty()) {
			postfix[j++] = s.pop() ; 
		}
		postfix[j++] = '\0' ; 
	}
};


int main(){
    cout << "\n" ;

    top = NULL ;

    cout << "\n" ;
}