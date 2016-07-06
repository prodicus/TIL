/*
* @Author: Tasdik Rahman
* @Date:   2016-06-06 09:11:04
* @Last Modified by:   Tasdik Rahman
* @Last Modified time: 2016-06-06 09:14:20
*/

package main

import "fmt"

func main() {
    if 7%2 == 0 {
        fmt.Println("Remainder is not zero")
    }

    if num := 9; num < 0 {
        fmt.Println(num, "He is a good guy")
    } else if num > 4 {
        fmt.Println(num, "This shall be printed")
    } else {
        fmt.Println(num, "This shall not be getting printed")
    }
}