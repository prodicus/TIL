#include <stdio.h>
int main(){
    int a[5] = {1, 2, 3 ,4 ,5} ; 
    printf("%u\n", &a );
    printf("%d\n", a );
    printf("%d\n", *a );
    printf("%d\n", a[0] );
}