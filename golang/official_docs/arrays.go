/*
* @Author: Tasdik Rahman
* @Date:   2016-06-06 09:52:13
* @Last Modified by:   Tasdik Rahman
* @Last Modified time: 2016-06-06 10:20:16
*/

package main

import "fmt"

func main() {
    var a [5]int
    fmt.Println("initial: ", a)      // will print zeros inside the five elements

    // printing the lenght of the array using the builtin len() method
    fmt.Println(len(a))

    a[4] = 100
    fmt.Println("get:", a)

    b := [6]int{1, 3, 5, 7, 9, 11}
    fmt.Println("b : get : ", b)

    var twoD [2][3]int

    for i:=0; i<2; i++ {
        for j:=0; j<3; j++ {
            twoD[i][j] = i + j
        }
    }

    fmt.Println("twoD: ", twoD)

}