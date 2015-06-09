#include <iostream>
#include <cctype>
using namespace std;

struct node{
    char data;
    node *next;
};
node *top;

class stack{
    public:
        char Top(){             //return top element without popping
            return(top->data);
        }

        int empty(){            //check empty
            if(top == NULL)
                return(1);
            return(0);
        }

        void push(char x) {     //push function
            node *p = new node();
            p->data = x;
            p->next = top;
            top = p;
        }

        char pop() {            //pop function
            node *p = top;

            char x = p->data;
            top = top->next;

            delete(p);
            return(x);
        }

        int precedence(char x) {         //check precedence of operators
            if(x == '(')
                return 0;
            else if(x =='+' || x == '-')
                return 1;
            else if(x == '*' || x == '/' || x =='%')
                return 2;
            return 3;
        }

        void infix_to_postfix(char infix[],char postfix[]){
            stack s;
            char x,token;
            int i,j = 0;

            for(i = 0  ; infix[i] != '\0' ; i++) {
                token = infix[i];

                if( isalnum(token) )
                    postfix[j++] = token;
                else if( token == '(' )
                    s.push(token);
                else if( token == ')') {
                    while( (x = s.pop()) != '(' )
                        postfix[j++] = x;
                }
                else {
                    while(!s.empty() && s.precedence(token) <= s.precedence(s.Top()))
                        postfix[j++] = s.pop();
                    s.push(token);
                }
            }

            while( !s.empty() ) {
                x = s.pop();
                postfix[j++] = x;
            }
            postfix[j++] = '\0';
        }
};

int main() {
    
    top = NULL;

    char infix[30],postfix[30];
    stack obj ;

    cout << "\nEnter Infix expression :: ";
    cin >> infix;

    obj.infix_to_postfix(infix,postfix);

    cout << "\npostfix expression : " << postfix;

    cout << "\n" ;
}
