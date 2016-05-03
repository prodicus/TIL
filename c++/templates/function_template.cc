/*
* @Author: Tasdik Rahman
* @Date:   2016-05-01 10:51:38
* @Last Modified by:   Tasdik Rahman
* @Last Modified time: 2016-05-01 11:15:29
*/

#include <iostream>
#include <cstdlib>

using namespace std;

template <class T> T PrintTwice(T data) {
    cout << "Twice of : " << data << " is : " << data * 2 << endl;
}

template <class S> void ReturnSum(S data1, S data2) { 
    cout << "The sum of : " << data1 << " & " << data2 << " is : " 
         << data1 + data2 << endl; 
}

int main(int argc, char* argv[]){

    // PrintTwice(atoi(argv[1]));
    // PrintTwice(atof(argv[2]));

    // returning the sum of two numbers
    ReturnSum(atoi(argv[1]), atoi(argv[2]));
    return 0;
}