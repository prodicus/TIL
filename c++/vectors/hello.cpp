#include <iostream>
#include "maximum.h"
#include <string>

using namespace std; 

int main(){
    unsigned int a, b, c;
    a = 10;
    b = 20;
    c = 30; 

    cout << "maximum value out of a, b, c :  " << maximum(a, b, c) << endl;

    double x, y, z ;
    x = 10.6;
    y = 45.12;
    z = 34.123 ; 

    cout << "maximum value out of x, y, z : " << maximum(x, y, z) << endl;

    string c1, c2, c3;
    c1 = "A";
    c2 = "B";
    c3 = "C";

    cout << "maximum value of c1, c2, c3 : " << maximum(c1, c2, c3) << endl;

    return 0;
}
