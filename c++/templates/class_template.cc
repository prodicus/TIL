/*
* @Author: Tasdik Rahman
* @Date:   2016-05-01 10:51:38
* @Last Modified by:   Tasdik Rahman
* @Last Modified time: 2016-05-01 11:15:29
*/

#include <iostream>
#include <cstdlib>

using namespace std;

template <class T, int range> class ex {
    T ar;
    int r;
};

int main(int argc, char* argv[]){

    ex<double, 20> object1;    //valid
    //ex<double> object2;         //invalid
    //ex object3;                 //invalid

    return 0;
}