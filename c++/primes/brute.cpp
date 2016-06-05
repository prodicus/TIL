/*
* @Author: Tasdik Rahman
* @Date:   2016-05-06 19:40:01
* @Last Modified by:   Tasdik Rahman
* @Last Modified time: 2016-05-06 20:25:19
* MIT License

Checks for the primality of a given input number using the trial and
division method
*/

#include <iostream>
#include <cmath>
#include <cstdlib>

bool check(int arg) {
    bool b(true);
    for (int i = 2; i <= std::sqrt(arg); ++i) {
        if (arg % i == 0){
            b = false;
        }
        return b;
    }
}

int main(int argc, char *argv[]) {
    std::cout << "The number passed :: " << argv[1] << " is prime or not? : "
              << check(atoi(argv[1]));
    return 0;
}
