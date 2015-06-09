#include <iostream>
using namespace std ; 

class Reverse{
public: 
    int precedence(char );

};

int Reverse::precedence(char x){
    if(x == '(')
        return 0;
    if(x == '+' || x == '-')
        return 1;
    if(x == '*' || x == '/')
        return 2;
    else
        retrun 3;
}

int main(){
    cout << "\n" ;



    cout << "\n" ;
}